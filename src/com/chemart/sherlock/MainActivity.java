package com.chemart.sherlock;

//import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends Activity {
	int i=0;
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
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
