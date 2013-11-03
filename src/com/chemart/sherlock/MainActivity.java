package com.chemart.sherlock;

//import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends Activity {
	//int i=0;
	final int MENU_QUIT_ID = 2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Toast.makeText(MainActivity.this, "Выберите руну", Toast.LENGTH_LONG).show();
		//final Random myRandom = new Random();
		//i = myRandom.nextInt(40);
		
	
	}
	
	public void onClick(View v)
	{
	    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
	    startActivity(intent);
	    //intent.putExtra("runa", i);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		menu.add(0, MENU_QUIT_ID, 0, "Quit");
		return super.onCreateOptionsMenu(menu);
		
	}
	@SuppressWarnings("unused")
	public boolean onOptionsItemSelected(MenuItem item) {
		//TODO Auto-generated method stub
		 MENU_QUIT_ID:
		//выход из приложения
		finish();
		return super.onOptionsItemSelected(item);
			}
}
