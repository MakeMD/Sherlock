package com.chemart.sherlock;



import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;

public class MainActivity extends Activity {
	final int MENU_QUIT_ID = 2;
	final int MENU_ABOUT_ID = 3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//выводим сообщение о выборе руны
		Toast.makeText(MainActivity.this, R.string.choise, Toast.LENGTH_LONG).show();
	}
	
	public void onClick(View v)
	{
	//генерируем случайное число 
		final Random myRandom = new Random();
        int i = myRandom.nextInt(41);
      //при выборе любой из рун, запускаем второе активити
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
	    intent.putExtra("mainruna", (int) i);
		startActivity(intent);
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		//Прописываем в меню пункт Выход
		menu.add(0, MENU_QUIT_ID, 0, R.string.quit);
		menu.add(0,MENU_ABOUT_ID, 0, R.string.about);
		return super.onCreateOptionsMenu(menu);
		
	}
	@SuppressWarnings("unused")
	public boolean onOptionsItemSelected(MenuItem item) {
		//TODO Auto-generated method stub
		switch (item.getItemId()) {
		case MENU_QUIT_ID:
		//выход из приложения
		finish();
		break;
		case MENU_ABOUT_ID:
			
		try {
			PackageManager manager = this.getPackageManager();
			PackageInfo info = manager.getPackageInfo(this.getPackageName(), 0);
			Toast.makeText(this,
			     "Version "+ info.versionName, Toast.LENGTH_LONG).show();	
		} catch (NameNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		break;
		}
		return super.onOptionsItemSelected(item);
			}
}
