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

public class Workshops extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_workshops);
		//Initialize the listview
		final ListView lv = (ListView) findViewById(R.id.listView10);
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
						Intent i2 = new Intent(Workshops.this,SandCasting.class);
						startActivity(i2);
						break;
					case 1:
						i2 = new Intent(Workshops.this, MugMike.class);
						startActivity(i2);
						break;
					case 2:
						i2 = new Intent(Workshops.this, Maayantra.class);
						startActivity(i2);
						break;
					case 3:
						i2 = new Intent(Workshops.this, Secondprocess.class);
						startActivity(i2);
						break;
					
				}
			}
			
		});
	}

	
}