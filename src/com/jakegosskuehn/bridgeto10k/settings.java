
package com.jakegosskuehn.bridgeto10k;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class settings extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutorial);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        
        menu.add(1, 1, Menu.FIRST, "Tutorial");
     
        menu.add(1, 3, Menu.FIRST +3, "About");
        
        
        return true;
    }
    
    //returns 1 if there is an error
    public int getDay()
    {
        int valueint = 1;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            valueint = extras.getInt("current_day");
        }
        return valueint;
    }
    


    public void tutorialIntent() //toasts and takes you to the settings...
    {
//        Toast toast = Toast.makeText(context, text, duration);
//        TextView v = (TextView) toast.getView().findViewById(android.R.id.message);
//        v.setTextColor(Color.CYAN);
//        toast.show();
        
        Intent in = new Intent(settings.this, tutorial.class);
        
        startActivity(in);
        setResult(Activity.RESULT_OK);
        
    }
    
    public void feedbackIntent() //toasts and takes you to the settings...
    {
//        Toast toast = Toast.makeText(context, text, duration);
//        TextView v = (TextView) toast.getView().findViewById(android.R.id.message);
//        v.setTextColor(Color.CYAN);
//        toast.show();
        
        Intent in = new Intent(settings.this, feedback.class);
        
        startActivity(in);
        setResult(Activity.RESULT_OK);
        
    }

    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) { //since int IDS are 1-4
            case 1:
                tutorialIntent();
                return true;
            case 2: //clear
                tutorialIntent();
                return true;
            case 3:
                feedbackIntent();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}