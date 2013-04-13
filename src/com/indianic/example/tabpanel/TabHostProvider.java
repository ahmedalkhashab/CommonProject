package com.indianic.example.tabpanel;

import android.app.Activity;

// Actually, i don't know why this exists...
public abstract class TabHostProvider {
	public Activity context;

	public TabHostProvider(Activity context) {
		this.context = context;
	}

	// get tab host by tab name? what's category?
	public abstract TabView getTabHost(String category);
}