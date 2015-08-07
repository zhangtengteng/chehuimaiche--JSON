package com.chehui.maiche.setup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.chehui.maiche.BaseActivity;
import com.chehui.maiche.R;
import com.chehui.maiche.SharedPreManager;
import com.chehui.maiche.comm.CommonData;
import com.chehui.maiche.utils.ToastUtils;

/**
 * 实名认证
 * 
 * @author gqy
 * 
 */
public class SetupManagerAuthentication extends BaseActivity {

	private Button btn_authentication;
	private LinearLayout authened;
	private EditText et_userName, et_identifyNumber;
	private TextView tv_userName, tv_identifyNumber;
	private ImageView image_authen;
	private TextView certified_progress;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_certified_merchants);
		initTitleView(-1, 255, R.string.set_account_authentication, 255, -1, 0);
		init();
	}

	private void init() {
		btn_authentication = (Button) findViewById(R.id.btn_next3);
		et_userName = (EditText) findViewById(R.id.et_userName);
		et_identifyNumber = (EditText) findViewById(R.id.et_identity_number);
		tv_userName = (TextView) findViewById(R.id.tv_userName);
		tv_identifyNumber = (TextView) findViewById(R.id.tv_identity_number);
		authened = (LinearLayout) findViewById(R.id.authened);
		image_authen = (ImageView) findViewById(R.id.img_authen);
		certified_progress = (TextView) findViewById(R.id.txt_certified_progress);

		// 判断是否已认证，1为已认证，0为未认证,2为待审核
		int vipLevel = SharedPreManager.getInstance().getInt(
				CommonData.VIPLEVEL, 0);
		if (vipLevel == 1) {
			image_authen.setBackgroundResource(R.drawable.authened);
			btn_authentication.setVisibility(View.GONE);
			authened.setVisibility(View.VISIBLE);
			tv_userName.setText(SharedPreManager.getInstance().getString(
					CommonData.USER_NAME, ""));
			tv_identifyNumber.setText(SharedPreManager.getInstance().getString(
					CommonData.SFZ, ""));
			et_userName.setVisibility(View.GONE);
			et_identifyNumber.setVisibility(View.GONE);
			certified_progress.setText("通过审核");

		} else if (vipLevel == 2) {
			image_authen.setBackgroundResource(R.drawable.authened);
			btn_authentication.setVisibility(View.GONE);
			authened.setVisibility(View.VISIBLE);
			tv_userName.setText(SharedPreManager.getInstance().getString(
					CommonData.USER_NAME, ""));
			tv_identifyNumber.setText(SharedPreManager.getInstance().getString(
					CommonData.SFZ, ""));
			et_userName.setVisibility(View.GONE);
			et_identifyNumber.setVisibility(View.GONE);
			certified_progress.setText("待审核");
		} else if (vipLevel == 0) {
			image_authen.setBackgroundResource(R.drawable.unauthen);
			btn_authentication.setVisibility(View.VISIBLE);
			authened.setVisibility(View.GONE);
		}

		btn_authentication.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (et_userName.getText().toString().equals("")
						&& et_userName.getText().toString().trim() != null) {
					ToastUtils
							.showLongToast(getApplicationContext(), "姓名不能为空！");
				} else if (et_identifyNumber.getText().toString().equals("")
						&& et_identifyNumber.getText().length() != 18) {
					ToastUtils.showLongToast(getApplicationContext(),
							"身份证号格式不正确");
				} else {
					Intent intent = new Intent(SetupManagerAuthentication.this,
							SetupUploadPic.class);
					intent.putExtra("USERNAME", et_userName.getText()
							.toString());
					intent.putExtra("IDETIFY", et_identifyNumber.getText()
							.toString());
					startActivity(intent);
				}
			}
		});
	}
}
