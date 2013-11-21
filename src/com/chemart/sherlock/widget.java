package com.chemart.sherlock;


import java.util.Arrays;
import java.util.Random;



//import android.app.AlarmManager;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.RemoteViews;

	public class widget extends AppWidgetProvider {
	  final String UPDATE_ALL_WIDGETS = "update_all_widgets";
	  final String LOG_TAG = "myLogs";
	  public static ComponentName thisWidget;
	  public static RemoteViews remoteViews;
	 
	 // int i = myRandom.nextInt(41);
	  
	    
	  @Override
	  public void onEnabled(Context context) {
	    super.onEnabled(context);
	    Log.d(LOG_TAG, "onEnabled");
	   
	    
	  }

	  @Override
	  public void onUpdate(Context context, AppWidgetManager appWidgetManager,
	      int[] appWidgetIds) {
	    super.onUpdate(context, appWidgetManager, appWidgetIds);
	    Log.d(LOG_TAG, "onUpdate " + Arrays.toString(appWidgetIds));
	    RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_activity_main);
	    thisWidget = new ComponentName(context, widget.class);
	    AppWidgetManager manager = AppWidgetManager.getInstance(context);
	    //генерируем андомное число
	    //final Random myRandom = new Random(); 
	    //i = myRandom.nextInt(41); 
	    //final Random myRandom = new Random(); 
	    int i = (new Random().nextInt(41));
	   // remoteViews.setTextViewText(R.id.textView2, String.valueOf(i));
	//   manager.updateAppWidget(thisWidget, remoteViews);
	    //делаем выбор значений remoteViews на основе рандомного числа
	    switch (i){
case 0:
remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.ehwaz_up_wd));
remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.ehwaz_wd);
//manager.updateAppWidget(thisWidget, remoteViews);
break;
case 1:
remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.ehwaz_down_wd));
remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.ehwaz_down_wd);
//manager.updateAppWidget(thisWidget, remoteViews);
break;
case 2:
remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.uruz_up_wd));
remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.uruz_wd);
//manager.updateAppWidget(thisWidget, remoteViews);
break;
case 3:
remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.uruz_down_wd));
remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.uruz_down_wd);	        	
//manager.updateAppWidget(thisWidget, remoteViews);
break;
case 4:
remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.gebo_wd));
remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.gebo_wd);
//manager.updateAppWidget(thisWidget, remoteViews);
break;
case 5:
remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.hagalaz_wd));
remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.hagalaz_wd);
//manager.updateAppWidget(thisWidget, remoteViews);
break;
case 6:
remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.algiz_up_wd));
remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.algiz_wd);	        	
//manager.updateAppWidget(thisWidget, remoteViews);
break;
case 7:
remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.algiz_down_wd));
remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.algiz_down_wd);
//manager.updateAppWidget(thisWidget, remoteViews);
break;
case 8:
remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.raido_up_wd));
remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.raido_wd);
//manager.updateAppWidget(thisWidget, remoteViews);
break;
case 9:
remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.raido_down_wd));
remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.raido_down_wd);
//manager.updateAppWidget(thisWidget, remoteViews);
break;
case 10:
remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.nauthiz_up_wd));
remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.nauthiz_wd);
//manager.updateAppWidget(thisWidget, remoteViews);
break;
case 11:
remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.nauthiz_down_wd));
remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.nauthiz_down_wd);
//manager.updateAppWidget(thisWidget, remoteViews);
break;
case 12:
remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.wunjo_up_wd));
remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.wunjo_wd);
//manager.updateAppWidget(thisWidget, remoteViews);
break;
case 13:
remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.wunjo_down_wd));
remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.wunjo_down_wd);
//manager.updateAppWidget(thisWidget, remoteViews);
break;
case 14:
remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.kano_up_wd));
remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.kano_wd);
//manager.updateAppWidget(thisWidget, remoteViews);
break;
case 15:
remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.kano_down_wd));
remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.kano_down_wd);
//manager.updateAppWidget(thisWidget, remoteViews);
break;
case 16:
remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.isa_wd));
remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.isa_wd);
//manager.updateAppWidget(thisWidget, remoteViews);
break;
case 17:
remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.jera_wd));
remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.jera_wd);
//manager.updateAppWidget(thisWidget, remoteViews);
break;
case 18:
remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.perth_up_wd));
remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.perth_wd);
//manager.updateAppWidget(thisWidget, remoteViews);
break;
case 19:
remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.perth_down_wd));
remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.perth_down_wd);
//manager.updateAppWidget(thisWidget, remoteViews);
break;
case 20:
remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.fehu_up_wd));
remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.fehu_wd);
//manager.updateAppWidget(thisWidget, remoteViews);
break;
case 21:
remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.fehu_down_wd));
remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.fehu_down_wd);
//manager.updateAppWidget(thisWidget, remoteViews);
break;
case 22:
remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.ansuz_up_wd));
remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.ansuz_wd);
//manager.updateAppWidget(thisWidget, remoteViews);
break;
case 23:
remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.ansuz_down_wd));
remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.ansuz_down_wd);
//manager.updateAppWidget(thisWidget, remoteViews);
break;
case 24:
remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.mannaz_up_wd));
remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.mannaz_wd);
//manager.updateAppWidget(thisWidget, remoteViews);
break;
case 25:
remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.mannaz_down_wd));
remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.mannaz_down_wd);
//manager.updateAppWidget(thisWidget, remoteViews);
break;
case 26:
remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.berkana_up_wd));
remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.berkana_wd);
//manager.updateAppWidget(thisWidget, remoteViews);
break;
case 27:
remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.berkana_down_wd));
remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.berkana_down_wd);
//manager.updateAppWidget(thisWidget, remoteViews);
break;
case 28:
remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.teivaz_up_wd));
remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.teivaz_wd);
//manager.updateAppWidget(thisWidget, remoteViews);
break;
case 29:
remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.teivaz_down_wd));
remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.teivaz_down_wd);
//manager.updateAppWidget(thisWidget, remoteViews);
break;
case 30:
remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.sowelu_wd));
remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.sowelu_wd);
//manager.updateAppWidget(thisWidget, remoteViews);
break;
case 31:
remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.laguz_up_wd));
remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.laguz_wd);
//manager.updateAppWidget(thisWidget, remoteViews);
break;
case 32:
remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.laguz_down_wd));
remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.laguz_down_wd);
//manager.updateAppWidget(thisWidget, remoteViews);
break;
case 33:
remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.inguz_wd));
remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.inguz_wd);
//manager.updateAppWidget(thisWidget, remoteViews);
break;
case 34:
remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.othilia_up_wd));
remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.othilia_wd);
//manager.updateAppWidget(thisWidget, remoteViews);
break;
case 35:
remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.othilia_down_wd));
remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.othilia_down_wd);
//manager.updateAppWidget(thisWidget, remoteViews);
break;
case 36:
remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.dagaz_wd));
remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.dagaz_wd);
//manager.updateAppWidget(thisWidget, remoteViews);
break;
case 37:
remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.weird_wd));
remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.weird_wd);
//manager.updateAppWidget(thisWidget, remoteViews);
break;
case 38:
remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.eihwaz_wd));
remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.eihwaz_wd);
//manager.updateAppWidget(thisWidget, remoteViews);
break;
case 39:
remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.thurisaz_wd));
remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.thurisaz_wd);
//manager.updateAppWidget(thisWidget, remoteViews);
break;
case 40:
remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.thurisaz_down_wd));
remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.thurisaz_down_wd);
//manager.updateAppWidget(thisWidget, remoteViews);
break;
        }
	    remoteViews.setTextViewText(R.id.textView1, String.valueOf(i)); 
        manager.updateAppWidget(thisWidget, remoteViews);
        
        RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), R.layout.widget_activity_main);
	    Intent configIntent = new Intent(context, ThirdActivity.class);
	    configIntent.putExtra("runa", i);
	    PendingIntent configPendingIntent = PendingIntent.getActivity(context, i, configIntent, 0);
	    
	    remoteViews2.setOnClickPendingIntent(R.id.textViewInWidget, configPendingIntent);
	    
	    appWidgetManager.updateAppWidget(appWidgetIds, remoteViews2);
	    
	  }

	  @Override
	  public void onDeleted(Context context, int[] appWidgetIds) {
	    super.onDeleted(context, appWidgetIds);
	    Log.d(LOG_TAG, "onDeleted " + Arrays.toString(appWidgetIds));
	  }

	  @Override
	  public void onDisabled(Context context) {
	    super.onDisabled(context);
	    Log.d(LOG_TAG, "onDisabled");

	  }
	  
	  @Override
	  public void onReceive(Context context, Intent intent) {
	    super.onReceive(context, intent);
	    Log.d(LOG_TAG, "onReceive");
	  }

	
	}
