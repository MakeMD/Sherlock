package com.chemart.sherlock;


import java.util.Random;

import android.app.Activity;
//import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;



public class SecondActivity extends Activity {
	   	int i=0;
	    //int r=0;
	    TextView text,name;
	    ImageView image;
	   protected void onCreate(Bundle savedInstanceState) 
	    {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_second);
	        final Random myRandom = new Random();
	        Matrix matrix=new Matrix();
	        Bitmap bMapRotate;
	        i = myRandom.nextInt(40);
	        //r = getIntent().getIntExtra("runa", 2);
	        text = (TextView) findViewById(R.id.textView1);
	        name = (TextView) findViewById(R.id.textView2);
	        image = (ImageView) findViewById(R.id.imageView1);
	        Bitmap bMap;
	        matrix.postRotate(180);
	        text.setMovementMethod(new ScrollingMovementMethod());
	        switch (i){
	        	case 0:
		        image.setImageResource(R.drawable.ehwaz);
		        text.setText(R.string.ehwaz_up);
		        name.setText("�����");
	        	break;
	        		case 1:
	        		//������������
	        		image.setImageResource(R.drawable.ehwaz);
	        		text.setText(R.string.ehwaz_down);
	        		name.setText("����� (������������)");
	        		bMap = BitmapFactory.decodeResource(getResources(), R.drawable.ehwaz);
	        		bMapRotate = Bitmap.createBitmap(bMap, 0, 0, bMap.getWidth(), bMap.getHeight(), matrix, true);
	        		image.setImageBitmap(bMapRotate);
	        		break;
	        	case 2:
	        	image.setImageResource(R.drawable.uruz);
	        	text.setText(R.string.uruz_up);
	        	name.setText("����");
	        	break;
	        		case 3:
	        		//������������
		        	image.setImageResource(R.drawable.uruz);
		        	text.setText(R.string.uruz_down);
		        	name.setText("���� (������������)");
		        	bMap = BitmapFactory.decodeResource(getResources(), R.drawable.uruz);
		        	bMapRotate = Bitmap.createBitmap(bMap, 0, 0, bMap.getWidth(), bMap.getHeight(), matrix, true);
		            image.setImageBitmap(bMapRotate);
		            break;
	        	case 4:
	    	    image.setImageResource(R.drawable.gebo);
	    	    text.setText(R.string.gebo);
	    	    name.setText("����");
	        	
	    	    break;
	        	case 5:
		    	image.setImageResource(R.drawable.hagalaz);
		    	text.setText(R.string.hagalaz);
		    	name.setText("�������");
	        	break;
	        	case 6:
		    	image.setImageResource(R.drawable.algiz);
		    	text.setText(R.string.algiz_up);
		    	name.setText("�����");
	        	break;
	        		case 7:
	        		//������������
			        image.setImageResource(R.drawable.algiz);
		    	    text.setText(R.string.algiz_down);
		    	    name.setText("����� (������������)");
		    	    bMap = BitmapFactory.decodeResource(getResources(), R.drawable.algiz);
		        	bMapRotate = Bitmap.createBitmap(bMap, 0, 0, bMap.getWidth(), bMap.getHeight(), matrix, true);
		            image.setImageBitmap(bMapRotate);
		    	    break;

	        	case 8:
		    	image.setImageResource(R.drawable.raido);
		    	text.setText(R.string.raido_up);
		    	name.setText("�����");
	        	break;
	        		case 9:
	        		//������������
			        image.setImageResource(R.drawable.raido);
		    	    text.setText(R.string.raido_down);
		    	    name.setText("����� (������������)");
		    	    bMap = BitmapFactory.decodeResource(getResources(), R.drawable.raido);
		        	bMapRotate = Bitmap.createBitmap(bMap, 0, 0, bMap.getWidth(), bMap.getHeight(), matrix, true);
		            image.setImageBitmap(bMapRotate);
		    	    break;
	        	case 10:
		    	image.setImageResource(R.drawable.nauthiz);
		    	text.setText(R.string.nauthiz_up);
		    	name.setText("������");
	        	
		    	break;
	        		case 11:
	        		//������������
			        image.setImageResource(R.drawable.nauthiz);
		    	    text.setText(R.string.nauthiz_down);
		    	    name.setText("������ (������������)");
		    	    bMap = BitmapFactory.decodeResource(getResources(), R.drawable.nauthiz);
		    	    bMapRotate = Bitmap.createBitmap(bMap, 0, 0, bMap.getWidth(), bMap.getHeight(), matrix, true);
		            image.setImageBitmap(bMapRotate);
		    	    break;
	        	case 12:
		    	image.setImageResource(R.drawable.wunjo);
		    	text.setText(R.string.wunjo_up);
		    	name.setText("�����");
	        	
		    	break;
	        		case 13:
	        		//������������
			        image.setImageResource(R.drawable.wunjo);
		    	    text.setText(R.string.wunjo_down);
		    	    name.setText("����� (������������)");
		    	    bMap = BitmapFactory.decodeResource(getResources(), R.drawable.wunjo);
		    	    bMapRotate = Bitmap.createBitmap(bMap, 0, 0, bMap.getWidth(), bMap.getHeight(), matrix, true);
		            image.setImageBitmap(bMapRotate);
		    	    break;
	        	case 14:
		    	image.setImageResource(R.drawable.kano);
		    	text.setText(R.string.kano_up);
		    	name.setText("����");
	        	
		    	break;
	        		case 15:
	        		//������������
			        image.setImageResource(R.drawable.kano);
		    	    text.setText(R.string.kano_down);
		    	    name.setText("���� (������������)");
		    	    bMap = BitmapFactory.decodeResource(getResources(), R.drawable.kano);
		    	    bMapRotate = Bitmap.createBitmap(bMap, 0, 0, bMap.getWidth(), bMap.getHeight(), matrix, true);
		            image.setImageBitmap(bMapRotate);
		    	    break;
	        	case 16:
		    	image.setImageResource(R.drawable.isa);
		    	text.setText(R.string.isa);
		    	name.setText("���");
	        	
		    	break;
	        	case 17:
	        	image.setImageResource(R.drawable.jera);
		    	text.setText(R.string.jera);
		    	name.setText("���");
	        	
		    	break;
	        	case 18:
		    	image.setImageResource(R.drawable.perth);
		    	text.setText(R.string.perth_up);
		    	name.setText("����");
	        	
		    	break;
	        		case 19:
	        		//������������
			        image.setImageResource(R.drawable.perth);
		    	    text.setText(R.string.perth_down);
		    	    name.setText("���� (������������)");
		    	    bMap = BitmapFactory.decodeResource(getResources(), R.drawable.perth);
		    	    bMapRotate = Bitmap.createBitmap(bMap, 0, 0, bMap.getWidth(), bMap.getHeight(), matrix, true);
		            image.setImageBitmap(bMapRotate);
		    	    break;
	        	case 20:
		    	image.setImageResource(R.drawable.fehu);
		    	text.setText(R.string.fehu_up);
		    	name.setText("���");
	        	
		    	break;
	        		case 21:
	        		//������������
			        image.setImageResource(R.drawable.fehu);
		    	    text.setText(R.string.fehu_down);
		    	    name.setText("��� (������������)");
		    	    bMap = BitmapFactory.decodeResource(getResources(), R.drawable.fehu);
		    	    bMapRotate = Bitmap.createBitmap(bMap, 0, 0, bMap.getWidth(), bMap.getHeight(), matrix, true);
		            image.setImageBitmap(bMapRotate);
		    	    break;
	        	case 22:
		    	image.setImageResource(R.drawable.ansuz);
		    	text.setText(R.string.ansuz_up);
		    	name.setText("�����");
	        	
		    	break;
	        		case 23:
	        		//������������
			        image.setImageResource(R.drawable.ansuz);
		    	    text.setText(R.string.ansuz_down);
		    	    name.setText("���� (������������)");
		    	    bMap = BitmapFactory.decodeResource(getResources(), R.drawable.ansuz);
		    	    bMapRotate = Bitmap.createBitmap(bMap, 0, 0, bMap.getWidth(), bMap.getHeight(), matrix, true);
		            image.setImageBitmap(bMapRotate);
		    	    break;
	        	case 24:
		    	image.setImageResource(R.drawable.mannaz);
		    	text.setText(R.string.mannaz_up);
		    	name.setText("������");
	        	
		    	break;
	        		case 25:
	        		//������������
			        image.setImageResource(R.drawable.mannaz);
		    	    text.setText(R.string.mannaz_down);
		    	    name.setText("������ (������������)");
		    	    bMap = BitmapFactory.decodeResource(getResources(), R.drawable.mannaz);
		    	    bMapRotate = Bitmap.createBitmap(bMap, 0, 0, bMap.getWidth(), bMap.getHeight(), matrix, true);
		            image.setImageBitmap(bMapRotate);
		    	    break;
	        	case 26:
		    	image.setImageResource(R.drawable.berkana);
		    	text.setText(R.string.berkana_up);
		    	name.setText("�������");
	        	
		    	break;
	        		case 27:
	        		//������������
			        image.setImageResource(R.drawable.berkana);
		    	    text.setText(R.string.berkana_down);
		    	    name.setText("����� (������������)");
		    	    bMap = BitmapFactory.decodeResource(getResources(), R.drawable.berkana);
		    	    bMapRotate = Bitmap.createBitmap(bMap, 0, 0, bMap.getWidth(), bMap.getHeight(), matrix, true);
		            image.setImageBitmap(bMapRotate);
		    	    break;
	        	case 28:
		    	image.setImageResource(R.drawable.teivaz);
		    	text.setText(R.string.teivaz_up);
		    	name.setText("������");
	        	
		    	break;
	        		case 29:
	        		//������������
			        image.setImageResource(R.drawable.teivaz);
		    	    text.setText(R.string.teivaz_down);
		    	    name.setText("������ (������������)");
		    	    bMap = BitmapFactory.decodeResource(getResources(), R.drawable.teivaz);
		    	    bMapRotate = Bitmap.createBitmap(bMap, 0, 0, bMap.getWidth(), bMap.getHeight(), matrix, true);
		            image.setImageBitmap(bMapRotate);
		    	    break;
	        	case 30:
		    	image.setImageResource(R.drawable.sowelu);
		    	text.setText(R.string.sowelu);
		    	name.setText("�����");
	        	
		    	break;
	        	case 31:
		    	image.setImageResource(R.drawable.laguz);
		    	text.setText(R.string.laguz_up);
		    	name.setText("�����");
	        	
		    	break;
	        		case 32:
	        		//������������
			        image.setImageResource(R.drawable.laguz);
		    	    text.setText(R.string.laguz_down);
		    	    name.setText("����� (������������)");
		    	    bMap = BitmapFactory.decodeResource(getResources(), R.drawable.laguz);
		    	    bMapRotate = Bitmap.createBitmap(bMap, 0, 0, bMap.getWidth(), bMap.getHeight(), matrix, true);
		            image.setImageBitmap(bMapRotate);
		    	    break;
	        	case 33:
		    	image.setImageResource(R.drawable.inguz);
		    	text.setText(R.string.inguz);
		    	name.setText("�����");
	        	
		    	break;
	        	case 34:
		    	image.setImageResource(R.drawable.othilia);
		    	text.setText(R.string.othilia_up);
		    	name.setText("����");
	        	
		    	break;
	        		case 35:
	        		//������������
			        image.setImageResource(R.drawable.othilia);
		    	    text.setText(R.string.othilia_down);
		    	    name.setText("���� (������������)");
		    	    bMap = BitmapFactory.decodeResource(getResources(), R.drawable.othilia);
		    	    bMapRotate = Bitmap.createBitmap(bMap, 0, 0, bMap.getWidth(), bMap.getHeight(), matrix, true);
		            image.setImageBitmap(bMapRotate);
		    	    break;
	        	case 37:
		    	image.setImageResource(R.drawable.dagaz);
		    	text.setText(R.string.dagaz);
		    	name.setText("�����");
	        	
		    	break;
	        	case 38:
	        	image.setImageResource(R.drawable.weird);
		    	text.setText(R.string.weird);
		    	name.setText("����");
	        	break;
	        	case 39:
			        image.setImageResource(R.drawable.eihwaz);
				    text.setText(R.string.eihwaz);
				    name.setText("�����");
			        break;

	        	    
	        }	                       
	    }
	   
	   
	   
	   public void onClick(View v){
		   finish();
	  }
}
