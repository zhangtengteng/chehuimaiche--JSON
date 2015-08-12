package com.chehui.maiche.setup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.chehui.maiche.BaseActivity;
import com.chehui.maiche.MainActivity;
import com.chehui.maiche.R;

/**
 * 实名认证成功界面
 * 
 * @author gqy
 * 
 */
public class SetupUploadSuccess extends BaseActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_setup_upload_success);
		initTitleView(-1, 255, R.string.set_account_authentication, 255, -1, 0);
		findViewById(R.id.authen_finish).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(SetupUploadSuccess.this,MainActivity.class));
			}
		});
	}
}
