package com.example;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class GettingResults extends Activity {
	/**
	 * Called when the activity is first created.
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Toast.makeText(this, "Sto per partire....", Toast.LENGTH_LONG).show();

		Intent intent = new Intent(this, SecondActivity.class);
		startActivityForResult(intent, 0);
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		Toast.makeText(this, Integer.toString(resultCode), Toast.LENGTH_LONG).show();
	}


}
