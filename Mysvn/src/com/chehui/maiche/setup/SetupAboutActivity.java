package com.chehui.maiche.setup;

/****
 * 关于页面
 */
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.chehui.maiche.BaseActivity;
import com.chehui.maiche.R;
import com.chehui.maiche.update.UpdateManager;

public class SetupAboutActivity extends BaseActivity implements OnClickListener {
	// 版本升级
	private LinearLayout rlUpgrade;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
		initTitleView(-1, 255, R.string.set_account_about, 255, -1, 0);
		init();
	}

	private void init() {
		rlUpgrade = (LinearLayout) findViewById(R.id.rlUpgrade);
		rlUpgrade.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.rlUpgrade:
			try {
				new UpdateManager(this).isupdate();
			} catch (NameNotFoundException e) {
				e.printStackTrace();
			}
			break;
		default:
			break;
		}
	}
 }
