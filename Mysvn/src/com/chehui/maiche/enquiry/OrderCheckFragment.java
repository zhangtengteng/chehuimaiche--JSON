package com.chehui.maiche.enquiry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.chehui.maiche.R;
import com.chehui.maiche.SharedPreManager;
import com.chehui.maiche.comm.CommonData;
import com.chehui.maiche.custom.BaseFragment;
import com.chehui.maiche.enquiry.DownImage.ImageCallBack;
import com.chehui.maiche.httpserve.HttpService;
import com.chehui.maiche.myorder.PullToRefreshListView;
import com.chehui.maiche.myorder.PullToRefreshListView.OnRefreshListener;
import com.chehui.maiche.utils.LogN;
import com.chehui.maiche.utils.ToastUtils;
import com.chehui.maiche.utils.Utils;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/***
 * 询价列表
 * 
 * 图片获取接口http://upload.chehui.com/seriesface/+json返回参数
 * 
 * @author zzp
 * 
 */
public class OrderCheckFragment extends BaseFragment {
	/** 提交参数 */
	private String postParams;
	/** 返回json数据 */
	private String json;
	/** 自定义ListView */
	private PullToRefreshListView listView;
	/** 自定义适配器 */
	private EqOrderAdapter adapter;
	/** 用户ID跳转下级也需要的参数 */
	private String sellerid;
	/** 初始化获取返回参数list集合 */
	private List<Map<String, String>> list = new ArrayList<Map<String, String>>();
	/** 返回参数的map */
	Map<String, String> map = null;
	/** 可以报价的数量 */
	private int baojiaNumber;
	private String cutCarColor;
	private Handler handler = new Handler() {
		@Override
		public void handleMessage(Message msg) {
			switch (msg.what) {
			case CommonData.HTTP_HANDLE_FAILE:
				Bundle data = msg.getData();
				String result = data.getString("mess");
				ToastUtils.showShortToast(getActivity().getApplicationContext(),
						result);
				break;

			default:
				break;
			}

		}
	};
	private String sellbrand1;
	private String sellbrand2;
	private String sellbrand3;
	private String cityname;
	private View mInflater;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		mInflater = inflater.inflate(R.layout.fragment_order_check, container,
				false);

		listView = (PullToRefreshListView) mInflater
				.findViewById(R.id.list_order);

		return mInflater;
	}

	@Override
	public void onActivityCreated(@Nullable Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

	}

	@Override
	public void onStart() {
		super.onStart();
		initData();

		getOrderByBrands(postParams);

		/**
		 * 刷新事件
		 */
		listView.setOnRefreshListener(new OnRefreshListener() {

			@Override
			public void onRefresh() {

				getOrderByBrands(postParams);

				listView.postDelayed(new Runnable() {

					@Override
					public void run() {
						if (adapter != null) {
							adapter.notifyDataSetChanged();
						}
						listView.onRefreshComplete();
					}

				}, 1000);
			}

		});

		/**
		 * 条目点击事件
		 */
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {

				// 需要用户sellerId 和OrderId
				String orderID = list.get(position).get("orderId");
				Intent intent = new Intent(
						getActivity().getApplicationContext(),
						OrderItemDetail.class);
				intent.putExtra("orderid", orderID);
				intent.putExtra("sellerid", sellerid);
				startActivity(intent);

			}
		});
	}

	/**
	 * 初始化数据
	 */
	private void initData() {

		int id = SharedPreManager.getInstance().getInt(CommonData.USER_ID, 72);
		sellbrand1 = SharedPreManager.getInstance()
				.getString(CommonData.BlandId1, "1");
		sellbrand2 = SharedPreManager.getInstance()
				.getString(CommonData.BlandId2, "1");
		sellbrand3 = SharedPreManager.getInstance()
				.getString(CommonData.BlandId3, "1");

		cityname = SharedPreManager.getInstance()
				.getString(CommonData.USER_CITY, "nanjing");

		sellerid = String.valueOf(id);

		Log.d("查询价的提交信息", sellbrand1 + sellbrand2 + sellbrand3 + cityname.trim()
				+ sellerid);

		// 去掉字符串中的空格
		String testCityname = cityname.replaceAll(" ", "");

		postParams = sellbrand1 + "|" + sellbrand1 + "|" + sellbrand1 + "|"
				+ testCityname + "|" + sellerid;

		System.out.println(sellbrand1 + cityname);

	}

	/***
	 * 获得询价数据
	 * 
	 * @param conParams
	 */
	private void getOrderByBrands(final String conParams) {
		if (!Utils.isNetworkAvailable(OrderCheckFragment.this.getActivity())) {
			ToastUtils.showShortToast(getActivity(),
					R.string.common_network_unavalible);
			return;
		}
		showWaitDialog(R.string.common_requesting);
		new AsyncTask<Void, Integer, String>() {

			@Override
			protected String doInBackground(Void... params) {
				// 请求服务器
				final List<BasicNameValuePair> parameters = new ArrayList<BasicNameValuePair>();
				parameters.add(new BasicNameValuePair("classname",
						"SellerOperationService"));
				parameters.add(new BasicNameValuePair("methodname",
						"GetOrderByBrands"));
				parameters.add(new BasicNameValuePair("params", conParams));

				Log.d("查看参数类型", parameters.toString());
				String response = HttpService.methodPost(CommonData.HTTP_URL,
						parameters);
				return response;
			}

			@Override
			protected void onPostExecute(String result) {
				dismissWaitDialog();
				if (result != null) {
					json = result.toString();
					Log.d("返回询价数据", json);
					baojiaNumber = 0;
					analysisJson();
				} else {
					ToastUtils.showShortToast(getActivity(), "加载数据失败!");
				}
			}
		}.execute();

	}

	/**
	 * 解析数据
	 */
	private void analysisJson() {
		try {
			JSONObject jsonObject = new JSONObject(json);
			Boolean success = jsonObject.getBoolean("Success");
			String mess = jsonObject.getString("Mess");

			if (success != true) {
				Message msg = handler
						.obtainMessage(CommonData.HTTP_HANDLE_FAILE);
				Bundle data = msg.getData();
				data.putString("mess", mess);
				handler.sendMessage(msg);
				return;
			}

			// 解析data数据
			JSONArray jsonArray = jsonObject.getJSONArray("Data");
			list.clear();
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject item = jsonArray.getJSONObject(i);
				// 获取对象对应的值
				String carImage = item.optString("CarImage");
				String CarYear = item.optString("CarYear");
				String seriesName = item.optString("SeriesName");

				String cutSeriesName = CarYear + "款" + seriesName;
				String tel = item.optString("Tel");
				// 替换号码*****
				String cutHeadTel = tel.substring(0, 3);
				String cutFootTel = tel.substring(8);
				String viewTel = cutHeadTel + "*****" + cutFootTel;

				String carName = item.optString("CarName").replaceAll(" ", "");
				// 替换车名
				String cutCarName = carName.substring(0, 8) + "...";

				String payMode = item.optString("PayMode");
				String carColor = item.optString("CarColor");
				if (carColor.length() > 6) {
					cutCarColor = carColor.substring(0, 8) + "...";
				} else {
					cutCarColor = carColor;
				}
				String beginDateStr = item.optString("BegindateStr");
				if (!item.optBoolean("IsBaojia")) {
					baojiaNumber++;
				}
				CommonData.tvNumber.setVisibility(View.VISIBLE);
				CommonData.tvNumber.setText(String.valueOf(baojiaNumber));
				int orderId = item.optInt("OrderID");// 下级界面需要

				map = new HashMap<String, String>(); // 存放到MAP里面
				map.put("carImage", carImage);
				map.put("seriesName", seriesName);
				map.put("viewTel", viewTel);
				map.put("cutCarName", cutCarName);
				map.put("payMode", payMode);
				map.put("cutCarColor", cutCarColor);
				map.put("beginDateStr", beginDateStr);
				map.put("orderId", String.valueOf(orderId));
				map.put("CarYear", CarYear);
				map.put("cutSeriesName", cutSeriesName);
				list.add(map);
				if (adapter == null) {
					adapter = new EqOrderAdapter(getActivity(), list);
					listView.setAdapter(adapter);
				} else {
					adapter.setData(list);
				}

			}
			CommonData.tvNumber.setText(String.valueOf(baojiaNumber));

		} catch (JSONException e) {

			e.printStackTrace();
		}

	}

	/**
	 * 自定义适配器
	 * 
	 * @author zzp
	 * 
	 */
	private class EqOrderAdapter extends BaseAdapter {

		/** 异步加载图片的URL */
		private static final String url = "http://upload.chehui.com/seriesface/";
		/** 在绑定的数据 */
		private List<Map<String, String>> listTOrder;
		private LayoutInflater inflater;

		@SuppressWarnings("unused")
		private Context context;

		public EqOrderAdapter(Context context,
				List<Map<String, String>> listTOder) {
			super();
			this.context = context;
			this.listTOrder = listTOder;
			this.inflater = LayoutInflater.from(context);

		}

		public void setData(List<Map<String, String>> listTOder) {
			this.listTOrder = listTOder;
			notifyDataSetChanged();
		}

		@Override
		public int getCount() {
			return listTOrder.size();
		}

		@Override
		public Object getItem(int position) {
			return listTOrder.get(position);
		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			final ImageView img_CarImage;
			TextView txt_SeriesName = null;
			TextView txt_PhoneNum = null;
			TextView txt_IsBaojia = null;
			TextView txt_CarName = null;
			TextView txt_CarColor = null;
			TextView txt_PayMode = null;
			TextView txt_BeginDate = null;
			if (convertView == null) {
				// 生成条目对象
				convertView = inflater
						.inflate(R.layout.fragment_order_check_item2, null);
				img_CarImage = (ImageView) convertView
						.findViewById(R.id.img_carImage);

				txt_SeriesName = (TextView) convertView
						.findViewById(R.id.txt_seriesName);

				txt_PhoneNum = (TextView) convertView
						.findViewById(R.id.txt_telNum);

				txt_IsBaojia = (TextView) convertView
						.findViewById(R.id.txt_isBaojia);

				txt_CarName = (TextView) convertView
						.findViewById(R.id.txt_carName);

				txt_CarColor = (TextView) convertView
						.findViewById(R.id.txt_carColor);

				txt_PayMode = (TextView) convertView
						.findViewById(R.id.txt_payMode);

				txt_BeginDate = (TextView) convertView
						.findViewById(R.id.txt_beginDate);

				ViewCahe viewCahe = new ViewCahe();
				viewCahe.CarImage = img_CarImage;
				viewCahe.SeriesName = txt_SeriesName;
				viewCahe.telNum = txt_PhoneNum;
				viewCahe.IsBaojia = txt_IsBaojia;
				viewCahe.CarName = txt_CarName;
				viewCahe.CarColor = txt_CarColor;
				viewCahe.PayMode = txt_PayMode;
				viewCahe.BeginDate = txt_BeginDate;
				convertView.setTag(viewCahe);
			} else {
				ViewCahe viewCahe = (ViewCahe) convertView.getTag();
				img_CarImage = viewCahe.CarImage;
				txt_SeriesName = viewCahe.SeriesName;
				txt_PhoneNum = viewCahe.telNum;
				txt_IsBaojia = viewCahe.IsBaojia;
				txt_CarName = viewCahe.CarName;
				txt_CarColor = viewCahe.CarColor;
				txt_PayMode = viewCahe.PayMode;
				txt_BeginDate = viewCahe.BeginDate;
			}

			// 绑定数据
			DownImage downImage = new DownImage(
					url + listTOrder.get(position).get("carImage"));

			downImage.loadImage(new ImageCallBack() {

				@Override
				public void getDrawable(Drawable drawable) {
					img_CarImage.setImageDrawable(drawable);
				}

			});

			String SeriesName = listTOrder.get(position).get("cutSeriesName");

			txt_SeriesName.setText(SeriesName);

			String Tel = listTOrder.get(position).get("viewTel");

			txt_PhoneNum.setText(Tel);
			// txt_IsBaojia.setText(listTOrder.get(position).get("carImage"));

			String CarName = listTOrder.get(position).get("cutCarName");
			txt_CarName.setText(CarName);

			txt_CarColor.setText(listTOrder.get(position).get("cutCarColor"));
			txt_PayMode.setText(listTOrder.get(position).get("payMode"));
			txt_BeginDate.setText(listTOrder.get(position).get("beginDateStr"));
			return convertView;
		}

		/**
		 * 
		 * @author zzp
		 * 
		 */
		private final class ViewCahe {
			public ImageView CarImage;
			public TextView SeriesName;
			public TextView telNum;
			public TextView IsBaojia;
			public TextView CarName;
			public TextView CarColor;
			public TextView PayMode;
			public TextView BeginDate;

		}
	}

	@Override
	public void onResume() {
		super.onResume();

	}
}
