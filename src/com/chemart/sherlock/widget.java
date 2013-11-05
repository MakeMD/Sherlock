package com.chemart.sherlock;


	import java.util.Arrays;
import java.util.Random;

import android.app.PendingIntent;
	import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.util.Log;
import android.widget.ImageView;
import android.widget.RemoteViews;
import android.widget.TextView;

	public class widget extends AppWidgetProvider {

	  final String LOG_TAG = "myLogs";

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
	    final Random myRandom = new Random();
	    RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_activity_main);
       int i = myRandom.nextInt(3);
        switch (i){
        case 0:
        	remoteViews.setTextViewText(R.id.textViewInWidget, Integer.toString(R.string.algiz_up));
            remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.algiz_wd);
          break;
        case 1:
        	remoteViews.setTextViewText(R.id.textViewInWidget,"updated 2" );
            remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.ansuz_wd);
        break;
        case 2:
        	remoteViews.setTextViewText(R.id.textViewInWidget, "updated 3");
            remoteViews.setImageViewResource(R.id.imageViewInWidget, R.drawable.berkana_wd);
        break;
        }
        AppWidgetManager.getInstance(context).updateAppWidget(
                new ComponentName(context, widget.class), remoteViews);
        Intent updateWidget = new Intent(context, widget.class); // Widget.class is your widget class
        updateWidget.setAction("update_widget");
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

	}
