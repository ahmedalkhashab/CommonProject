package com.indianic.example;

import android.app.Activity;
import android.os.Bundle;

import com.indianic.example.tabpanel.MyTabHostProvider;
import com.indianic.example.tabpanel.TabHostProvider;
import com.indianic.example.tabpanel.TabView;

public class ShareActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TabHostProvider tabProvider = new MyTabHostProvider(ShareActivity.this);
		TabView tabView = tabProvider.getTabHost("Share");
		tabView.setCurrentView(R.layout.share);
		setContentView(tabView.render(2));
	}
}