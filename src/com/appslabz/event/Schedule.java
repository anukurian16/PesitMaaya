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

public class Schedule extends ActionBarActivity {

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
		setContentView(R.layout.activity_schedule);
		//Initialize the listview
		final ListView lv = (ListView) findViewById(R.id.listView11);

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
						insertEvent(9, 18, 9, 0, 10, 00, "Maaya Inaugration" );
						break;
					case 1:
						insertEvent(9, 17, 10, 00, 12, 30, "Maaya Idol" );
						break;
					case 2:
						insertEvent(9, 18, 10, 0, 13, 00, "Processing Workshop,Fun with science" );
						break;
					case 3:
						insertEvent(9, 18, 10, 30, 16, 30, "Theme related Photography,Short Movie Making" );
						break;
					case 4:
						insertEvent(9, 18, 10, 0, 12, 30, "Strip N Frame" );
						break;
					case 5:
						insertEvent(9, 17, 10, 30, 12, 00, "Mock Rock" );
						break;
					case 6:
						insertEvent(9, 18, 10, 30, 12, 00, "Street Play" );
						break;
					case 7:
						insertEvent(9, 18, 11, 0, 16, 30, "Mug to Mike" );
						break;
					case 8:
						insertEvent(9, 18, 11, 0, 14, 30, "DC, Face painting" );
						break;
					case 9:
						insertEvent(9, 17, 11, 00, 16, 00, "Cricket,Football" );
						break;
					case 10:
						insertEvent(9, 18, 11, 0, 12, 00, "Beg,Borrow,Steal" );
						break;
					case 11:
						insertEvent(9, 18, 12, 0, 13, 30, "Group singing" );
						break;
					case 12:
						insertEvent(9, 18, 12, 0, 14, 30, "Solo Dance" );
						break;
					case 13:
						insertEvent(9, 17, 12, 00, 13, 30, "Treasure Hunt" );
						break;
					case 14:
						insertEvent(9, 18, 12, 30, 14, 00, "Antakshari" );
						break;
					case 15:
						insertEvent(9, 18, 13, 30, 15, 30, "Personality" );
						break;
					case 16:
						insertEvent(9, 18, 1, 30, 2, 30, "Golgappa Eating" );
						break;
					case 17:
						insertEvent(9, 17, 14, 00, 15, 30, "Bluffmaster" );
						break;
					case 18:
						insertEvent(9, 18, 14, 0, 14, 30, "E-Quiz" );
						break;
					case 19:
						insertEvent(9, 18, 15, 30, 19, 00, "Cul-Nite" );
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
