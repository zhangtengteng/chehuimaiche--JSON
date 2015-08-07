package com.chehui.maiche.setup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.chehui.maiche.MainActivity;
import com.chehui.maiche.R;

/**
 * 实名认证成功界面
 * 
 * @author gqy
 * 
 */
public class SetupUploadSuccess extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_setup_upload_success);
		findViewById(R.id.authen_finish).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(SetupUploadSuccess.this,MainActivity.class));
			}
		});
	}
}
