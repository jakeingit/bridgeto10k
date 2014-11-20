
package com.jakegosskuehn.bridgeto10k;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class tutorial extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
 
        setContentView(R.layout.tutorial);
        
        final Button button26 = (Button) findViewById(R.id.returnButton);
        button26.setOnClickListener(new OnClickListener(){
           
           
            public void onClick(View view) {          
                //DO STUFF HERE
                finish();
                
                ;
                }
            });
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        
       
        menu.add(1, 2, Menu.FIRST +2, "Settings");
        menu.add(1, 3, Menu.FIRST +3, "About");
        
        return true;
    }
    
    public int getDay()
    {
        int valueint = 1;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            valueint = extras.getInt("current_day");
        }
        return valueint;
    }
    public void settingsIntent() //toasts and takes you to the settings...
    {   
        Intent in = new Intent(tutorial.this, settings.class);
        
        startActivity(in);
        setResult(Activity.RESULT_OK);
        
    }
    public void feedbackIntent() //toasts and takes you to the settings...
    {

        
        Intent in = new Intent(tutorial.this, feedback.class);
        
        startActivity(in);
        setResult(Activity.RESULT_OK);
        
    }
 

    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) { //since int IDS are 1-4
            case 1:
                settingsIntent();
                return true;
            case 2: //clear
                settingsIntent();
                return true;
            case 3:
                feedbackIntent();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}