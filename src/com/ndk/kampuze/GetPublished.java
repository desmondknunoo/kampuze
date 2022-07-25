package com.ndk.kampuze;




import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class GetPublished extends Activity {
	
	TextView tv1, tv2;
	ImageButton imagebutton;
	Button send;
	EditText getPublished;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.get_published);
		ActionBarCompat.setDisplayHomeAsUpEnabled(this, true);       {
			
			send=(Button) findViewById(R.id.Button1);
		getPublished=(EditText) findViewById(R.id.EditText01);

        send.setOnClickListener(new OnClickListener() {

		  @Override
		  public void onClick(View v) {
			  // TODO Auto-generated method stub

			  Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
			  emailIntent.setType("plain/text");
              emailIntent.putExtra(Intent.EXTRA_EMAIL,new String[]{"kampuze@gmail.com"});                             
              emailIntent.putExtra(Intent.EXTRA_SUBJECT,"Get Published: Kampuze app");
              emailIntent.putExtra(Intent.EXTRA_TEXT, getPublished.getText());
              GetPublished.this.startActivity(Intent.createChooser(emailIntent, "Send email using..."));
		  }});

		
		tv1=(TextView)findViewById(R.id.textView1z);
		tv2=(TextView)findViewById(R.id.TextView01v);
		
		Typeface face= Typeface.createFromAsset(getAssets(), "fonts/Helvetica LT Light.ttf");
		tv1.setTypeface(face);
		}
		Typeface face= Typeface.createFromAsset(getAssets(), "fonts/Trade Gothic LT Light.ttf");
		tv2.setTypeface(face);
		}
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            NavUtils.navigateUpFromSameTask(this);
            return true;
        }
    

imagebutton = (ImageButton) findViewById(R.id.ImageButton04); 
imagebutton.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View arg0) {
	


   Intent ig = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.instagram.com/urbanxtv/"));

   
  
   


try {
startActivity(Intent.createChooser(ig, "Open Instagram using..."));

}

catch (android.content.ActivityNotFoundException ex) {
Toast.makeText(getActivity(),
   "No browser available.",
   Toast.LENGTH_SHORT).show();
}


}

private Context getActivity() {
	// TODO Auto-generated method stub
	return null;
}});


imagebutton = (ImageButton) findViewById(R.id.ImageButton05); 
imagebutton.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View arg0) {
	


   Intent tw = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.twitter.com/urbanxtv/"));
   
   
  
   


try {
startActivity(Intent.createChooser(tw, "Open Twitter using..."));

}

catch (android.content.ActivityNotFoundException ex) {
Toast.makeText(getActivity(),
   "No browser available",
   Toast.LENGTH_SHORT).show();
}


}

private Context getActivity() {
	// TODO Auto-generated method stub
	return null;
}});


imagebutton = (ImageButton) findViewById(R.id.ImageButton06); 
imagebutton.setOnClickListener(new OnClickListener() {

       @Override
       public void onClick(View arg0) {
       	


    	   Intent fb = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.facebook.com/urbanxtv/"));
    	   
    	   
    	  
    	   
	

	try {
	startActivity(Intent.createChooser(fb, "Open Facebook using..."));

	}
   
catch (android.content.ActivityNotFoundException ex) {
   Toast.makeText(getActivity(),
           "No browser available.",
           Toast.LENGTH_SHORT).show();
}


}

		private Context getActivity() {
			// TODO Auto-generated method stub
			return null;
		}});
return false;
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