package com.appslabz.event;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import android.R.string;
import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.CalendarContract.Events;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class Sched2 extends ActionBarActivity {

	void insertEvent(int month, int date, int sHour, int sMin, int eHour, int eMin, String evtName  )
	{
		Calendar calTime = Calendar.getInstance();
		Intent intent = new Intent(Intent.ACTION_EDIT);
		intent.setType("vnd.android.cursor.item/event");
		calTime.set(2014, month, date, sHour, sMin);
		intent.putExtra("beginTime", calTime.getTimeInMillis());
		calTime.set(2014, month, date, eHour, eMin);
		intent.putExtra("endTime", calTime.getTimeInMillis());
		intent.putExtra("allDay", false);
		intent.putExtra("rrule", "FREQ=YEARLY");
		intent.putExtra("title", evtName);
		intent.putExtra(Events.HAS_ALARM, true);
		startActivity(intent);
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sched2);
		//Initialize the listview
		final ListView lv = (ListView) findViewById(R.id.listView13);

		//call set on item click listener.
		lv.setOnItemClickListener(new OnItemClickListener() 
		{
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) 
			{
				// TODO Auto-generated method stub
				              	
				switch(position)
				{
					case 0:
						insertEvent(9, 18, 9, 0, 17, 30, "Maayantra Robotics Workshop" );
						break;
					case 1:
						insertEvent(9, 17, 9, 30, 12, 00, "Battle of Bands" );
						break;
					case 2:
						insertEvent(9, 18, 10, 30, 12, 30, "Creative Writing" );
						break;
					case 3:
						insertEvent(9, 18, 10, 30, 11, 00, "Limbo" );
						break;
					case 4:
						insertEvent(9, 18, 10, 30, 11, 30, "Rangoli" );
						break;
					case 5:
						insertEvent(9, 17, 10, 30, 13 ,00, "Splash The Colours" );
						break;
					case 6:
						insertEvent(9, 18, 10, 30, 13, 30, "Sand Casting" );
						break;
					case 7:
						insertEvent(9, 18, 11, 0, 12, 30, "Aircrash" );
						break;
					case 8:
						insertEvent(9, 18, 11, 0, 11, 30, "Paper Toss" );
						break;
					case 9:
						insertEvent(9, 17, 11, 00, 11, 30, "Taboo" );
						break;
					case 10:
						insertEvent(9, 18, 11, 0, 11, 30, "Tabletennis" );
						break;
					case 11:
						insertEvent(9, 18, 11, 0, 16, 00, "Street Basketball" );
						break;
					case 12:
						insertEvent(9, 18, 11, 0, 16, 00, "Street Cricket" );
						break;
					case 13:
						insertEvent(9, 17, 12, 00, 12, 30, "Housie" );
						break;
					case 14:
						insertEvent(9, 18, 12, 00, 14, 00, "Debate" );
						break;
					case 15:
						insertEvent(9, 18, 12, 30, 15, 30, "Cooking Without Flame" );
						break;
					case 16:
						insertEvent(9, 18, 12, 00, 14, 00, "Mad-Ads" );
						break;
					case 17:
						insertEvent(9, 17, 12, 30, 15, 00, "JAM" );
						break;
					case 18:
						insertEvent(9, 18, 13, 0, 13, 30, "Connect-it" );
						break;
					case 19:
						insertEvent(9, 18, 12, 30, 14, 00, "Treasure Hunt" );
						break;
					case 20:
						insertEvent(9, 18, 13, 30, 16, 00, "Collage" );
						break;
					case 21:
						insertEvent(9, 18, 14, 00, 16, 00, "Street Dance" );
						break;
					case 22:
						insertEvent(9, 17, 16, 00, 19, 00, "Cross Roads" );
						break;
					
					default:
						break;
				}
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.schedule, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	
	
	
	
}
