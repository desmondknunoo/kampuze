package com.ndk.kampuze;

import android.graphics.Typeface;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MenuActivity extends PreferenceActivity {
	
	Button button;
	
@Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	ActionBarCompat.setDisplayHomeAsUpEnabled(this, true);       {
getFragmentManager().beginTransaction().replace(android.R.id.content, new MenuFragment()).commit();
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
public static class MenuFragment extends PreferenceFragment
{
	@Override
	public void onCreate(final Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.preferences);
		
		//findPreference("about");
		//Preference aboutApp = (Preference) findPreference("about");
		//aboutApp.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			
		//	@Override
		//	public boolean onPreferenceClick(Preference preference) {
				// TODO Auto-generated method stub
		//		return false;
			//}
		//});
	}
 
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