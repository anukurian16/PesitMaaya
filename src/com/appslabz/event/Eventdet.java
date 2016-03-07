package com.appslabz.event;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;


public class Eventdet extends ActionBarActivity
 {

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_eventdet);
		
		//Initialize the listview
		final ListView lv = (ListView) findViewById(R.id.listView1);

		//call set on item click listener.
		lv.setOnItemClickListener(new OnItemClickListener() 
		{

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) 
			{
				// TODO Auto-generated method stub
				//Toast.makeText(getApplicationContext(), (String) lv.getItemAtPosition(position), Toast.LENGTH_LONG).show();
				switch(position)
				{
					case 0:
						Intent i2 = new Intent(Eventdet.this, CulturalEvents.class);
						startActivity(i2);
						break;
					case 1:
						i2 = new Intent(Eventdet.this, FieldEvents.class);
						startActivity(i2);
						break;
					case 2:
						i2 = new Intent(Eventdet.this, FineArts.class);
						startActivity(i2);
						break;
					case 3:
						i2 = new Intent(Eventdet.this, InformalEvents.class);
						startActivity(i2);
						break;
					case 4:
						i2 = new Intent(Eventdet.this, LiteraryEvents.class);
						startActivity(i2);
						break;
					case 5:
						i2 = new Intent(Eventdet.this, Theatre.class);
						startActivity(i2);
						break;
					case 6:
						i2 = new Intent(Eventdet.this, Gaming.class);
						startActivity(i2);
						break;
					case 7:
						i2 = new Intent(Eventdet.this, Technical.class);
						startActivity(i2);
						break;
				}
			}
			
		});
	}

	/*@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		Toast.makeText(this, "Anu's onCreate", Toast.LENGTH_SHORT).show();
		getMenuInflater().inflate(R.menu.eventdet, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		Toast.makeText(this, "Anu's Schedule", Toast.LENGTH_SHORT).show();
		Intent i = new Intent(this, FineArts.class);
		startActivity(i);
		//if (id == R.id.action_settings) {
		//	return true;
		//}
		// return super.onOptionsItemSelected(item);
		return true;
	}*/
	
}