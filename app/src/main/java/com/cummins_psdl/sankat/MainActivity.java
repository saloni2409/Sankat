package com.cummins_psdl.sankat;


import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1);
	}

	public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
		switch (requestCode) {
			case 1: {
				// If request is cancelled, the result arrays are empty.
				if (grantResults.length > 0
						&& grantResults[0] == PackageManager.PERMISSION_GRANTED) {

				} else {
					// permission denied, boo! Disable the
					// functionality that depends on this permission.
				}
				return;
			}
			// other 'case' lines to check for other
			// permissions this app might request
		}
	}
	public void register(View v) {
		Intent i_register=new Intent(MainActivity.this,Register.class);
		startActivity(i_register);
		
	}
	
public void display_no(View v) {
	Intent i_view=new Intent(MainActivity.this,Display.class);
	startActivity(i_view);
		
	}

public void instruct(View v) {	
	Intent i_help=new Intent(MainActivity.this,Instructions.class);
    startActivity(i_help);
}

public void verify(View v) {	
	Intent i_verify=new Intent(MainActivity.this,Verify.class);
    startActivity(i_verify);
}
}
