package com.example;

import android.app.Activity;
import android.os.Bundle;

public class SecondActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setResult(42);

		finish();

	}
}
