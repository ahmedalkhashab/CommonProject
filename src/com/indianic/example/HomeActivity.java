package com.indianic.example;

import android.app.Activity;
import android.os.Bundle;

import com.indianic.example.tabpanel.MyTabHostProvider;
import com.indianic.example.tabpanel.TabHostProvider;
import com.indianic.example.tabpanel.TabView;

public class HomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TabHostProvider tabProvider = new MyTabHostProvider(HomeActivity.this);
		TabView tabView = tabProvider.getTabHost("Home");
		tabView.setCurrentView(R.layout.home);
		setContentView(tabView.render(0));
	}
}