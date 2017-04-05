package com.zms.xutils3demo;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;

import android.os.Bundle;
import android.widget.TextView;

@ContentView(R.layout.activity_main)
public class MainActivity extends BaseActivity {

	@ViewInject(R.id.textTest)
	private TextView textTest;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		textTest.setText(this.getClass().getName());
	}

}
