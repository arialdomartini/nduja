package com.example;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class ActivityStarter extends Activity {
	/**
	 * Called when the activity is first created.
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_starter);

		startAnotherActivity(Intent.ACTION_CALL_BUTTON);
	}

	private void startAnotherActivity(String action) {
		Intent intent = new Intent();
		intent.setAction(action);
		startActivity(intent);
	}

}
