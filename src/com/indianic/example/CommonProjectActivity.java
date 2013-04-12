package com.indianic.example;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

public class CommonProjectActivity extends Activity implements OnClickListener 
{
	private final String TAG = this.getClass().getSimpleName();
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		View exitButton = findViewById(R.id.exit_button);
		exitButton.setOnClickListener(this);
		View finishButton = findViewById(R.id.finish_button);
		finishButton.setOnClickListener(this);
		Log.d(TAG, "onCreate");
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		Log.d(TAG, "onStart");
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		Log.d(TAG, "onRestart");
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.d(TAG, "onResume");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.d(TAG, "onPause");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.d(TAG, "onStop");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d(TAG, "onDestroy");
	}

	@Override
	public void onClick(View v) 
	{
		switch (v.getId()) 
		{
			case R.id.exit_button:
				android.os.Process.killProcess(android.os.Process.myPid());
				break;
			case R.id.finish_button:
				finish();
				break;
		}
	}
	
}