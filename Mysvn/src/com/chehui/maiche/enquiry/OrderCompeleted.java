package com.chehui.maiche.enquiry;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.chehui.maiche.BaseActivity;
import com.chehui.maiche.R;

/***
 * 
 * @author zzp
 *         <P>
 *         完成报价
 *         <P>
 * 
 */
public class OrderCompeleted extends BaseActivity {

	private Button btn_compelet;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_order_detail4);
		btn_compelet = (Button) findViewById(R.id.orderItemC_btn_compelet);
		btn_compelet.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				finish();
			}
		});
	}
}
