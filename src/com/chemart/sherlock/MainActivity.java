package com.chemart.sherlock;



import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends Activity {
	final int MENU_QUIT_ID = 2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//выводим сообщение о выборе руны
		Toast.makeText(MainActivity.this, "¬ыберите руну", Toast.LENGTH_LONG).show();
	}
	
	public void onClick(View v)
	{
	//при выборе любой из рун, запускаем второе активити
		final Random myRandom = new Random();
        int i = myRandom.nextInt(41);
		Intent intent = new Intent(MainActivity.this, SecondActivity.class);
	    intent.putExtra("mainruna", (int) i);
		startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		//ѕрописываем в меню пункт ¬ыход
		menu.add(0, MENU_QUIT_ID, 0, "¬ыход");
		return super.onCreateOptionsMenu(menu);
		
	}
	@SuppressWarnings("unused")
	public boolean onOptionsItemSelected(MenuItem item) {
		//TODO Auto-generated method stub
		 MENU_QUIT_ID:
		//выход из приложени€
		finish();
		return super.onOptionsItemSelected(item);
			}
}
