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

public class InformalEvents extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_informal_events);
		//Initialize the listview
		final ListView lv = (ListView) findViewById(R.id.listView5);

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
						Intent i2 = new Intent(InformalEvents.this,Beg.class);
						startActivity(i2);
						break;
					case 1:
						i2 = new Intent(InformalEvents.this, TreasureHunt.class);
						startActivity(i2);
						break;
					case 2:
						i2 = new Intent(InformalEvents.this, Golgappa.class);
						startActivity(i2);
						break;
					case 3:
						i2 = new Intent(InformalEvents.this, Chilly.class);
						startActivity(i2);
						break;
					case 4:
						i2 = new Intent(InformalEvents.this, Onlineth.class);
						startActivity(i2);
						break;
					case 5:
						i2 = new Intent(InformalEvents.this, Housie.class);
						startActivity(i2);
						break;
					case 6:
						i2 = new Intent(InformalEvents.this, Limbo.class);
						startActivity(i2);
						break;
					case 7:
						i2 = new Intent(InformalEvents.this, Papertoss.class);
						startActivity(i2);
						break;
				}
			}
			
		});
	}

	
}