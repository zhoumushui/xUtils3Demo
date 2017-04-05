package com.zms.xutils3demo;

import org.xutils.x;

import android.app.Application;

public class MyApp extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		initialXUtils3();
	}

	private void initialXUtils3() {
		x.Ext.init(this); // 这一步之后, 我们就可以在任何地方使用x.app()来获取Application的实例了
		x.Ext.setDebug(true); // 是否输出日志
	}

}
