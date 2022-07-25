package com.ndk.kampuze;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.TextView;

public class Splash extends Activity {

    private Thread mSplashThread;
    TextView tv1,tv2;
 

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

       setContentView(R.layout.splash); 
        //ActionBar actionBar = getActionBar();
        //actionBar.hide();
    	   tv1=(TextView)findViewById(R.id.textView1);
    	   tv2=(TextView)findViewById(R.id.textView2);
    	   Typeface face= Typeface.createFromAsset(getAssets(), "fonts/GrilledCheese BTN Toasted.ttf");
    	   tv1.setTypeface(face);
    	   Typeface face1= Typeface.createFromAsset(getAssets(), "fonts/Helvetica LT Light.ttf");
    	   tv2.setTypeface(face1);
    	   
    	 

        final Splash SPlashScreen = this;

 

            mSplashThread =  new Thread(){

            @Override

            public void run(){

                try {

                    synchronized(this){

 

                        wait(3500);

                    }

                }

                catch(InterruptedException ex){

                }

 

                finish();

 

                Intent intent = new Intent();

                intent.setClass(SPlashScreen, MainActivity.class);

                startActivity(intent);

 

            }

        };

 

        mSplashThread.start();

    }

 

 

    @Override

 

    public boolean onTouchEvent(MotionEvent evt)

    {

        if(evt.getAction() == MotionEvent.ACTION_DOWN)

        {

            synchronized(mSplashThread){

                mSplashThread.notifyAll();

            }

        }

        return true;

    }}

