package com.chemart.sherlock;


	import java.util.Arrays;
import java.util.Random;

//import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
//import android.content.Intent;
//import android.content.SharedPreferences;
//import android.graphics.Bitmap;
//import android.graphics.Matrix;
import android.util.Log;
//import android.view.View;
//import android.widget.ImageView;
import android.widget.RemoteViews;
//import android.widget.TextView;

	public class CopyOfwidget extends AppWidgetProvider {

	  final String LOG_TAG = "myLogs";
	  public static ComponentName thisWidget;
	  public static RemoteViews remoteViews;

	  @Override
	  public void onEnabled(Context context) {
	    super.onEnabled(context);
	    Log.d(LOG_TAG, "onEnabled");
	  }

	  @Override
	  public void onUpdate(Context context, AppWidgetManager appWidgetManager,
	      int[] appWidgetIds) {
	    super.onUpdate(context, appWidgetManager, appWidgetIds);
	    //int i =0;
	   //String str = context.getString(R.string.algiz_up_wd);
	    final Random myRandom = new Random();
	    
	    RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_activity_main);
	    thisWidget = new ComponentName(context, CopyOfwidget.class);
	    int i = myRandom.nextInt(3);
        switch (i){
        case 0:
        	remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.algiz_up_wd));
            remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.algiz_wd);
          break;
        case 1:
        	remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.ansuz_up_wd));
            remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.ansuz_wd);
        break;
        case 2:
        	remoteViews.setTextViewText(R.id.textViewInWidget, context.getString(R.string.berkana_up_wd));
            remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.berkana_wd);
        break;
        }
        AppWidgetManager manager = AppWidgetManager.getInstance(context);
        manager.updateAppWidget(thisWidget, remoteViews);
        //PendingIntent pending = PendingIntent.getBroadcast(context, 0, updateWidget, PendingIntent.FLAG_CANCEL_CURRENT);
        //pending.send();
        Log.d(LOG_TAG, "onUpdate " + Arrays.toString(appWidgetIds));
        
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
	  
	 // public void onClick(Context context, AppWidgetManager appWidgetManager,
	//	      int[] appWidgetIds){
		//  AppWidgetManager manager = AppWidgetManager.getInstance(context);
	      //  manager.updateAppWidget(thisWidget, remoteViews); 
	  //}

	}
