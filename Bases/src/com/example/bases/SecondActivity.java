package com.example.bases;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class SecondActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		String parametr = getIntent().getStringExtra("param");
		
		TextView ttttt = (TextView) findViewById(R.id.textView111);
		ttttt.setText(parametr);
		
		setContentView(R.layout.activity_second);
				
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}

}
