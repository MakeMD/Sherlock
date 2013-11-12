package com.chemart.sherlock;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;



public class ThirdActivity extends Activity {
	   	int in;
	    TextView text,name;
	    ImageView image;
	   protected void onCreate(Bundle savedInstanceState) 
	    {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_third);
	        //читаем данные из виджета
	        //Bundle extras = data.getExtras();
	        Intent myintent = getIntent();
	        
	        in = myintent.getIntExtra("runa", 0);
	        //i = myRandom.nextInt(41);
	        //
	        
	        Matrix matrix=new Matrix();
	        matrix.postRotate(180);
	        Bitmap bMapRotate;
	        Bitmap bMap;
	        text = (TextView) findViewById(R.id.textViewInWidget);
	        name = (TextView) findViewById(R.id.textView2);
	        image = (ImageView) findViewById(R.id.imageView1);
	        text.setMovementMethod(new ScrollingMovementMethod());
	        //делаем выбор на основе данных из виджета
	        switch (in){
	        	case 0:
		        image.setImageResource(R.drawable.ehwaz);
		        text.setText(R.string.ehwaz_up);
		        name.setText(R.string.d_ehwaz_up);
	        	break;
	        		case 1:
	        		//перевернутые
	        		image.setImageResource(R.drawable.ehwaz);
	        		text.setText(R.string.ehwaz_down);
	        		name.setText(R.string.d_ehwaz_down);
	        		//переворачиваем картинку внутри ImagView
	        		bMap = BitmapFactory.decodeResource(getResources(), R.drawable.ehwaz);
	        		bMapRotate = Bitmap.createBitmap(bMap, 0, 0, bMap.getWidth(), bMap.getHeight(), matrix, true);
	        		image.setImageBitmap(bMapRotate);
	        		break;
	        	case 2:
	        	image.setImageResource(R.drawable.uruz);
	        	text.setText(R.string.uruz_up);
	        	name.setText(R.string.d_uruz_up);
	        	break;
	        		case 3:
	        		//перевернутые
		        	image.setImageResource(R.drawable.uruz);
		        	text.setText(R.string.uruz_down);
		        	name.setText(R.string.d_uruz_down);
		        	bMap = BitmapFactory.decodeResource(getResources(), R.drawable.uruz);
		        	bMapRotate = Bitmap.createBitmap(bMap, 0, 0, bMap.getWidth(), bMap.getHeight(), matrix, true);
		            image.setImageBitmap(bMapRotate);
		            break;
	        	case 4:
	    	    image.setImageResource(R.drawable.gebo);
	    	    text.setText(R.string.gebo);
	    	    name.setText(R.string.d_gebo);
	        	
	    	    break;
	        	case 5:
		    	image.setImageResource(R.drawable.hagalaz);
		    	text.setText(R.string.hagalaz);
		    	name.setText(R.string.d_hagalaz);
	        	break;
	        	case 6:
		    	image.setImageResource(R.drawable.algiz);
		    	text.setText(R.string.algiz_up);
		    	name.setText(R.string.d_algiz_up);
	        	break;
	        		case 7:
	        		//перевернутые
			        image.setImageResource(R.drawable.algiz);
		    	    text.setText(R.string.algiz_down);
		    	    name.setText(R.string.d_algiz_down);
		    	    bMap = BitmapFactory.decodeResource(getResources(), R.drawable.algiz);
		        	bMapRotate = Bitmap.createBitmap(bMap, 0, 0, bMap.getWidth(), bMap.getHeight(), matrix, true);
		            image.setImageBitmap(bMapRotate);
		    	    break;

	        	case 8:
		    	image.setImageResource(R.drawable.raido);
		    	text.setText(R.string.raido_up);
		    	name.setText(R.string.d_raido_up);
	        	break;
	        		case 9:
	        		//перевернутые
			        image.setImageResource(R.drawable.raido);
		    	    text.setText(R.string.raido_down);
		    	    name.setText(R.string.d_raido_down);
		    	    bMap = BitmapFactory.decodeResource(getResources(), R.drawable.raido);
		        	bMapRotate = Bitmap.createBitmap(bMap, 0, 0, bMap.getWidth(), bMap.getHeight(), matrix, true);
		            image.setImageBitmap(bMapRotate);
		    	    break;
	        	case 10:
		    	image.setImageResource(R.drawable.nauthiz);
		    	text.setText(R.string.nauthiz_up);
		    	name.setText(R.string.d_nauthiz_up);
	        	
		    	break;
	        		case 11:
	        		//перевернутые
			        image.setImageResource(R.drawable.nauthiz);
		    	    text.setText(R.string.nauthiz_down);
		    	    name.setText(R.string.d_nauthiz_down);
		    	    bMap = BitmapFactory.decodeResource(getResources(), R.drawable.nauthiz);
		    	    bMapRotate = Bitmap.createBitmap(bMap, 0, 0, bMap.getWidth(), bMap.getHeight(), matrix, true);
		            image.setImageBitmap(bMapRotate);
		    	    break;
	        	case 12:
		    	image.setImageResource(R.drawable.wunjo);
		    	text.setText(R.string.wunjo_up);
		    	name.setText(R.string.d_wunjo_up);
	        	
		    	break;
	        		case 13:
	        		//перевернутые
			        image.setImageResource(R.drawable.wunjo);
		    	    text.setText(R.string.wunjo_down);
		    	    name.setText(R.string.d_wunjo_down);
		    	    bMap = BitmapFactory.decodeResource(getResources(), R.drawable.wunjo);
		    	    bMapRotate = Bitmap.createBitmap(bMap, 0, 0, bMap.getWidth(), bMap.getHeight(), matrix, true);
		            image.setImageBitmap(bMapRotate);
		    	    break;
	        	case 14:
		    	image.setImageResource(R.drawable.kano);
		    	text.setText(R.string.kano_up);
		    	name.setText(R.string.d_kano_up);
	        	
		    	break;
	        		case 15:
	        		//перевернутые
			        image.setImageResource(R.drawable.kano);
		    	    text.setText(R.string.kano_down);
		    	    name.setText(R.string.d_kano_down);
		    	    bMap = BitmapFactory.decodeResource(getResources(), R.drawable.kano);
		    	    bMapRotate = Bitmap.createBitmap(bMap, 0, 0, bMap.getWidth(), bMap.getHeight(), matrix, true);
		            image.setImageBitmap(bMapRotate);
		    	    break;
	        	case 16:
		    	image.setImageResource(R.drawable.isa);
		    	text.setText(R.string.isa);
		    	name.setText(R.string.d_isa);
	        	
		    	break;
	        	case 17:
	        	image.setImageResource(R.drawable.jera);
		    	text.setText(R.string.jera);
		    	name.setText(R.string.d_jera);
	        	
		    	break;
	        	case 18:
		    	image.setImageResource(R.drawable.perth);
		    	text.setText(R.string.perth_up);
		    	name.setText(R.string.d_perth_up);
	        	
		    	break;
	        		case 19:
	        		//перевернутые
			        image.setImageResource(R.drawable.perth);
		    	    text.setText(R.string.perth_down);
		    	    name.setText(R.string.d_perth_down);
		    	    bMap = BitmapFactory.decodeResource(getResources(), R.drawable.perth);
		    	    bMapRotate = Bitmap.createBitmap(bMap, 0, 0, bMap.getWidth(), bMap.getHeight(), matrix, true);
		            image.setImageBitmap(bMapRotate);
		    	    break;
	        	case 20:
		    	image.setImageResource(R.drawable.fehu);
		    	text.setText(R.string.fehu_up);
		    	name.setText(R.string.d_fehu_up);
	        	
		    	break;
	        		case 21:
	        		//перевернутые
			        image.setImageResource(R.drawable.fehu);
		    	    text.setText(R.string.fehu_down);
		    	    name.setText(R.string.d_fehu_down);
		    	    bMap = BitmapFactory.decodeResource(getResources(), R.drawable.fehu);
		    	    bMapRotate = Bitmap.createBitmap(bMap, 0, 0, bMap.getWidth(), bMap.getHeight(), matrix, true);
		            image.setImageBitmap(bMapRotate);
		    	    break;
	        	case 22:
		    	image.setImageResource(R.drawable.ansuz);
		    	text.setText(R.string.ansuz_up);
		    	name.setText(R.string.d_ansuz_up);
	        	
		    	break;
	        		case 23:
	        		//перевернутые
			        image.setImageResource(R.drawable.ansuz);
		    	    text.setText(R.string.ansuz_down);
		    	    name.setText(R.string.d_ansuz_down);
		    	    bMap = BitmapFactory.decodeResource(getResources(), R.drawable.ansuz);
		    	    bMapRotate = Bitmap.createBitmap(bMap, 0, 0, bMap.getWidth(), bMap.getHeight(), matrix, true);
		            image.setImageBitmap(bMapRotate);
		    	    break;
	        	case 24:
		    	image.setImageResource(R.drawable.mannaz);
		    	text.setText(R.string.mannaz_up);
		    	name.setText(R.string.d_mannaz_up);
	        	
		    	break;
	        		case 25:
	        		//перевернутые
			        image.setImageResource(R.drawable.mannaz);
		    	    text.setText(R.string.mannaz_down);
		    	    name.setText(R.string.d_mannaz_down);
		    	    bMap = BitmapFactory.decodeResource(getResources(), R.drawable.mannaz);
		    	    bMapRotate = Bitmap.createBitmap(bMap, 0, 0, bMap.getWidth(), bMap.getHeight(), matrix, true);
		            image.setImageBitmap(bMapRotate);
		    	    break;
	        	case 26:
		    	image.setImageResource(R.drawable.berkana);
		    	text.setText(R.string.berkana_up);
		    	name.setText(R.string.d_berkana_up);
	        	
		    	break;
	        		case 27:
	        		//перевернутые
			        image.setImageResource(R.drawable.berkana);
		    	    text.setText(R.string.berkana_down);
		    	    name.setText(R.string.d_berkana_down);
		    	    bMap = BitmapFactory.decodeResource(getResources(), R.drawable.berkana);
		    	    bMapRotate = Bitmap.createBitmap(bMap, 0, 0, bMap.getWidth(), bMap.getHeight(), matrix, true);
		            image.setImageBitmap(bMapRotate);
		    	    break;
	        	case 28:
		    	image.setImageResource(R.drawable.teivaz);
		    	text.setText(R.string.teivaz_up);
		    	name.setText(R.string.d_teivaz_up);
	        	
		    	break;
	        		case 29:
	        		//перевернутые
			        image.setImageResource(R.drawable.teivaz);
		    	    text.setText(R.string.teivaz_down);
		    	    name.setText(R.string.d_teivaz_down);
		    	    bMap = BitmapFactory.decodeResource(getResources(), R.drawable.teivaz);
		    	    bMapRotate = Bitmap.createBitmap(bMap, 0, 0, bMap.getWidth(), bMap.getHeight(), matrix, true);
		            image.setImageBitmap(bMapRotate);
		    	    break;
	        	case 30:
		    	image.setImageResource(R.drawable.sowelu);
		    	text.setText(R.string.sowelu);
		    	name.setText(R.string.d_sowelu);
	        	
		    	break;
	        	case 31:
		    	image.setImageResource(R.drawable.laguz);
		    	text.setText(R.string.laguz_up);
		    	name.setText(R.string.d_laguz_up);
	        	
		    	break;
	        		case 32:
	        		//перевернутые
			        image.setImageResource(R.drawable.laguz);
		    	    text.setText(R.string.laguz_down);
		    	    name.setText(R.string.d_laguz_down);
		    	    bMap = BitmapFactory.decodeResource(getResources(), R.drawable.laguz);
		    	    bMapRotate = Bitmap.createBitmap(bMap, 0, 0, bMap.getWidth(), bMap.getHeight(), matrix, true);
		            image.setImageBitmap(bMapRotate);
		    	    break;
	        	case 33:
		    	image.setImageResource(R.drawable.inguz);
		    	text.setText(R.string.inguz);
		    	name.setText(R.string.d_inguz);
	        	
		    	break;
	        	case 34:
		    	image.setImageResource(R.drawable.othilia);
		    	text.setText(R.string.othilia_up);
		    	name.setText(R.string.d_othilia_up);
	        	
		    	break;
	        		case 35:
	        		//перевернутые
			        image.setImageResource(R.drawable.othilia);
		    	    text.setText(R.string.othilia_down);
		    	    name.setText(R.string.d_othilia_down);
		    	    bMap = BitmapFactory.decodeResource(getResources(), R.drawable.othilia);
		    	    bMapRotate = Bitmap.createBitmap(bMap, 0, 0, bMap.getWidth(), bMap.getHeight(), matrix, true);
		            image.setImageBitmap(bMapRotate);
		    	    break;
	        	case 36:
		    	image.setImageResource(R.drawable.dagaz);
		    	text.setText(R.string.dagaz);
		    	name.setText(R.string.d_dagaz);
	        	
		    	break;
	        	case 37:
	        	image.setImageResource(R.drawable.weird);
		    	text.setText(R.string.weird);
		    	name.setText(R.string.d_weird);
	        	break;
	        	case 38:
			        image.setImageResource(R.drawable.eihwaz);
				    text.setText(R.string.eihwaz);
				    name.setText(R.string.d_eihwaz);
			        break;
	        	case 39:
			        image.setImageResource(R.drawable.thurisaz);
				    text.setText(R.string.thurisaz_up);
				    name.setText(R.string.d_thurisaz_up);
			        break;
	        	case 40:
	        		image.setImageResource(R.drawable.thurisaz);
		    	    text.setText(R.string.thurisaz_down);
		    	    name.setText(R.string.d_thurisaz_down);
		    	    bMap = BitmapFactory.decodeResource(getResources(), R.drawable.thurisaz);
		    	    bMapRotate = Bitmap.createBitmap(bMap, 0, 0, bMap.getWidth(), bMap.getHeight(), matrix, true);
		            image.setImageBitmap(bMapRotate);
		            break;
	        	    
	        }	                       
	    }
	   
	   
	   
	   public void onClick(View v){
//выход из активити
		   finish();
	  }
}
