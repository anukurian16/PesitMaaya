package com.appslabz.event;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class CulturalEvents extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cultural_events);
		//Initialize the listview
				final ListView lv = (ListView) findViewById(R.id.listView2);
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
								Intent i2 = new Intent(CulturalEvents.this,GroupSinging.class);
								startActivity(i2);
								break;
							case 1:
								i2 = new Intent(CulturalEvents.this, MaayaIdol.class);
								startActivity(i2);
								break;
							case 2:
								i2 = new Intent(CulturalEvents.this, ContemporaryDance.class);
								startActivity(i2);
								break;
							case 3:
								i2 = new Intent(CulturalEvents.this, Antakshari.class);
								startActivity(i2);
								break;
							case 4:
								i2 = new Intent(CulturalEvents.this, StreetDance.class);
								startActivity(i2);
								break;
							case 5:
								i2 = new Intent(CulturalEvents.this, WesternDance.class);
								startActivity(i2);
								break;
							case 6:
								i2 = new Intent(CulturalEvents.this, Bollywood.class);
								startActivity(i2);
								break;
							
							case 7:
								i2 = new Intent(CulturalEvents.this, SoloDance.class);
								startActivity(i2);
								break;
						}
					}
					
				});
			}

			
		}