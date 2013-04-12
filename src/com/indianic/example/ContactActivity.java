package com.indianic.example;

import android.app.Activity;
import android.os.Bundle;

import com.indianic.example.tabpanel.MyTabHostProvider;
import com.indianic.example.tabpanel.TabHostProvider;
import com.indianic.example.tabpanel.TabView;

public class ContactActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TabHostProvider tabProvider = new MyTabHostProvider(ContactActivity.this);
		TabView tabView = tabProvider.getTabHost("Contact");
		tabView.setCurrentView(R.layout.contact);
		setContentView(tabView.render(1));
	}
	
}