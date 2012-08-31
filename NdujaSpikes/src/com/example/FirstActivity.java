package com.example;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);

	    Button button = (Button) findViewById(R.id.main_activity_button);
	    View.OnClickListener listener = new View.OnClickListener(){

		    @Override
		    public void onClick(View view) {
			    Intent intent = new Intent();

			    String packageName = "com.example";
			    String className = "SecondActivity";
			    //intent.setClassName(packageName, className);
			    intent.setClass(getApplicationContext(), SecondActivity.class);

			    startActivity(intent);
		    }
	    };
	    button.setOnClickListener(listener);

    }
}
