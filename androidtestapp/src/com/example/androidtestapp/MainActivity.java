package com.example.androidtestapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//changed for loop
		for(int i=0; i<10; i++){
			System.out.print(i + ": ");
			for(int j=0; j<i; j++){
				System.out.println(j);
			}
		}
		
		System.out.println("I added this line from git hubs editor");
		
	}

	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
     
}
