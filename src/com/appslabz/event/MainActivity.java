package com.appslabz.event;

import android.support.v7.app.ActionBarActivity;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.view.View.OnClickListener;


public class MainActivity extends ActionBarActivity {
	TextView tv;
	MyGridView grid;
	  String[] web = {
	      "Schedule",
	      "Event Details",
	      "Workshops",
	      "News",
	      "Contact Us"
	  } ;
	  int[] imageId = {
	      R.drawable.schedule,
	      R.drawable.event,
	      R.drawable.workshop,
	      R.drawable.news,
	      R.drawable.contact,
	  };
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		getActionBar().hide();
		//Start Timer
		//tv = (TextView)findViewById(R.id.textViewTime);
		//tv.setText("00:03:00");
		//final CounterClass timer = new CounterClass(180000,1000);
		//timer.start();
		
		//Load Grid view
		CustomGrid adapter = new CustomGrid(MainActivity.this, web, imageId);
	    grid=(MyGridView)findViewById(R.id.grid);
	    grid.setAdapter(adapter);
	    grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
	    @Override
	    public void onItemClick(AdapterView<?> parent, View view,
	                                        int position, long id) {
	                    WebView mWebView;
	                    Intent i;
						//Toast.makeText(MainActivity .this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();
	                    switch (position){
	                          case 0: 	//Toast.makeText(MainActivity.this, "Anu's calender", Toast.LENGTH_SHORT).show();
	                          			i = new Intent(MainActivity.this,SchedMenu.class);
	                          			startActivity(i);
	                          		/*	mWebView=(WebView)findViewById(R.id.web);
	                          			mWebView.getSettings().setJavaScriptEnabled(true);
	                          			mWebView.loadUrl("https://docs.google.com/viewer?url="+ "https://docs.google.com/document/d/1RTEbffY19P_SGcdUCJZ-Q0eVSXcyom_xaAcKFzCDFYg/edit");
	                          		*/	break;
	                          case 1: 	//Toast.makeText(MainActivity.this, "Anu's Schedule", Toast.LENGTH_SHORT).show();
	                          			i = new Intent(MainActivity.this,Eventdet.class);
                    					startActivity(i);
                    					break;
	                          case 2: 	//Toast.makeText(MainActivity.this, "Anu's Schedule", Toast.LENGTH_SHORT).show();
          								i = new Intent(MainActivity.this,Workshops.class);
          								startActivity(i);
          								break;
	                          case 3: 	//Toast.makeText(MainActivity.this, "Anu's Schedule", Toast.LENGTH_SHORT).show();
    								// i = new Intent(MainActivity.this,News.class);
    								// startActivity(i);
	                        	  		i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maayafest.com"));
	                        	  		startActivity(i);
	                        	  		break;
	                          case 4: 	//Toast.makeText(MainActivity.this, "Anu's Schedule", Toast.LENGTH_SHORT).show();
          								i = new Intent(MainActivity.this,ContactUs.class);
          								startActivity(i);
          								break;
	                          default: 	Toast.makeText(MainActivity.this, "ERROR", Toast.LENGTH_SHORT).show();
                    					break;
	                    }
	                }
	            });
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}