package com.chemart.sherlock;



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
		//������� ��������� � ������ ����
		Toast.makeText(MainActivity.this, "�������� ����", Toast.LENGTH_LONG).show();
	}
	
	public void onClick(View v)
	{
	//��� ������ ����� �� ���, ��������� ������ ��������
		Intent intent = new Intent(MainActivity.this, SecondActivity.class);
	    startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		//����������� � ���� ����� �����
		menu.add(0, MENU_QUIT_ID, 0, "�����");
		return super.onCreateOptionsMenu(menu);
		
	}
	@SuppressWarnings("unused")
	public boolean onOptionsItemSelected(MenuItem item) {
		//TODO Auto-generated method stub
		 MENU_QUIT_ID:
		//����� �� ����������
		finish();
		return super.onOptionsItemSelected(item);
			}
}
