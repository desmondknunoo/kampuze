package com.ndk.kampuze;


import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.widget.TextView;

public class Notification extends Activity {
	
	TextView tv1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.notification);
		ActionBarCompat.setDisplayHomeAsUpEnabled(this, true);       {

		
		tv1=(TextView)findViewById(R.id.textView1);
		
		Typeface face= Typeface.createFromAsset(getAssets(), "fonts/GrilledCheese BTN Toasted.ttf");
		tv1.setTypeface(face);
		}
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            NavUtils.navigateUpFromSameTask(this);
            return true;
        }
        return super.onOptionsItemSelected(item);
 
}
@Override
protected void onStart() {
super.onStart();
}

/** Called when the activity has become visible. */
@Override
protected void onResume() {
super.onResume();
}

/** Called when another activity is taking focus. */
@Override
protected void onPause() {
super.onPause();

}
/** Called when the activity is no longer visible. */
@Override
protected void onStop() {
super.onStop();

}
/** Called just before the activity is destroyed. */
@Override
public void onDestroy() {
super.onDestroy();

}}