package com.appslabz.event;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class Theatre extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theatre);
		//Initialize the listview
		final ListView lv = (ListView) findViewById(R.id.listView7);

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
						Intent i2 = new Intent(Theatre.this, MadAds.class);
						startActivity(i2);
						break;
					case 1:
						i2 = new Intent(Theatre.this, Personality.class);
						startActivity(i2);
						break;
					case 2:
						i2 = new Intent(Theatre.this, AirCraft.class);
						startActivity(i2);
						break;
					case 3:
						i2 = new Intent(Theatre.this, MockRock.class);
						startActivity(i2);
						break;
					case 4:
						i2 = new Intent(Theatre.this, Bluffmaster.class);
						startActivity(i2);
						break;
					case 5:
						i2 = new Intent(Theatre.this, StreetPlay.class);
						startActivity(i2);
						break;
					case 6:
						i2 = new Intent(Theatre.this, DumbCharades.class);
						startActivity(i2);
						break;
					
				}
			}
			
		});
	}

	
}