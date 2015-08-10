package com.chehui.maiche.setup;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.message.BasicNameValuePair;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.chehui.maiche.BaseActivity;
import com.chehui.maiche.R;
import com.chehui.maiche.SharedPreManager;
import com.chehui.maiche.comm.CommonData;
import com.chehui.maiche.httpserve.HttpService;
import com.chehui.maiche.utils.StringUtils;
import com.chehui.maiche.utils.ToastUtils;

/**
 * 反馈
 * @author gqy
 *
 */
public class SetupFeedBackActivity extends BaseActivity {
	private EditText tv_FeedBack;
	private Button  btn_commit; 
	
	/**用户ID*/
	private int userID =1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_feedback);
		initTitleView(-1, 255, R.string.set_account_feedback, 255, -1, 0);
		init();
	}

	private void init() {
		tv_FeedBack = (EditText) findViewById(R.id.tv_feedback);
		btn_commit = (Button) findViewById(R.id.feedback_btn_commit);
		userID = SharedPreManager.getInstance().getInt(CommonData.USER_ID, 1);
	 	btn_commit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(StringUtils.isEmpty(tv_FeedBack.getText().toString().trim())){
					ToastUtils.showLongToast(SetupFeedBackActivity.this, "反馈内容不能为空！");
				}else{
					new AsyncTask<Void, Integer, String>() {

						@Override
						protected String doInBackground(Void... params) {
							// 请求服务器
							final List<BasicNameValuePair> parameters = new ArrayList<BasicNameValuePair>();
							parameters.add(new BasicNameValuePair("classname",
									"BaseInfoService"));
							parameters.add(new BasicNameValuePair("methodname",
									"AddAdvice"));
							parameters.add(new BasicNameValuePair("params",userID+"|"+tv_FeedBack.getText().toString().trim()));
							String response = HttpService.methodPost(CommonData.HTTP_URL, parameters);
							return response;
						}
                     protected void onPostExecute(String result) {
                    	 if(result.toString().equals("true")){
                    		 ToastUtils.showLongToast(SetupFeedBackActivity.this, "提交成功");
                    	     finish();
                    	 }else{
                    		 ToastUtils.showShortToast(SetupFeedBackActivity.this, "提交失败");
                    	 }
                    	 };
                     }.execute();
				}
			}
		}); 
	}
}
