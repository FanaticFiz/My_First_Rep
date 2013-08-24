package com.example.bases;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity 
{
	
	TextView Text_Hello;
	int Count=0;
	
	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Text_Hello = (TextView) findViewById(R.id.textView1);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void OnClick(View v) 
	{
		Text_Hello.setText("А эт наша красивая картинка");
	}
	
	public void ClickOnButton1(View v) 
	{
		Text_Hello.setText("Вы нажали на кнопку "+ ++Count +" раз");
		
		TextView but1 = (TextView) findViewById(R.id.button1);
		if (Count==100) 
		{
			but1.setClickable(false);
			but1.setText("");
		}
	}
	
	public void OnClickBut2(View v) 
	{
		Intent intent1 = new Intent();
		intent1.setClass(MainActivity.this, SecondActivity.class);
		startActivity(intent1);
		//finish(); //акрывает предыдущий активити
	}
	
}


