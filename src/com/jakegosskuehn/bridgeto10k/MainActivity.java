
package com.jakegosskuehn.bridgeto10k;


import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
       ///////////////////////////////////////
        
        final Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new OnClickListener(){
           
           
            public void onClick(View view) {          
                startWork(1);
                }
            });
         ///////////////////////////////////////
       ///////////////////////////////////////
        
        final Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new OnClickListener(){
           
           
            public void onClick(View view) {          
                startWork(2);
                }
            });
         ///////////////////////////////////////    
       ///////////////////////////////////////
        
        final Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new OnClickListener(){
           
           
            public void onClick(View view) {          
                startWork(3);
                }
            });
         ///////////////////////////////////////
       ///////////////////////////////////////
        
        final Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new OnClickListener(){
           
           
            public void onClick(View view) {          
                startWork(4);
                }
            });
         ///////////////////////////////////////
       ///////////////////////////////////////
        
        final Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new OnClickListener(){
           
           
            public void onClick(View view) {          
                startWork(5);
                }
            });
         ///////////////////////////////////////
       ///////////////////////////////////////
        
        final Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new OnClickListener(){
           
           
            public void onClick(View view) {          
                startWork(6);
                }
            });
         ///////////////////////////////////////
       ///////////////////////////////////////
        
        final Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new OnClickListener(){
           
           
            public void onClick(View view) {          
                startWork(7);
                }
            });
         ///////////////////////////////////////
       ///////////////////////////////////////
        
        final Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new OnClickListener(){
           
           
            public void onClick(View view) {          
                startWork(8);
                }
            });
         ///////////////////////////////////////
       ///////////////////////////////////////
        
        final Button button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new OnClickListener(){
           
           
            public void onClick(View view) {          
                startWork(9);
                }
            });
         ///////////////////////////////////////
       ///////////////////////////////////////
        
        final Button button10 = (Button) findViewById(R.id.button10);
        button10.setOnClickListener(new OnClickListener(){
           
           
            public void onClick(View view) {          
                startWork(10);
                }
            });
         ///////////////////////////////////////
       ///////////////////////////////////////
        
        final Button button11 = (Button) findViewById(R.id.button11);
        button11.setOnClickListener(new OnClickListener(){
           
           
            public void onClick(View view) {          
                startWork(11);
                }
            });
         ///////////////////////////////////////
       ///////////////////////////////////////
        
        final Button button12 = (Button) findViewById(R.id.button12);
        button12.setOnClickListener(new OnClickListener(){
           
           
            public void onClick(View view) {          
                startWork(12);
                }
            });
         ///////////////////////////////////////
       ///////////////////////////////////////
        
        final Button button13 = (Button) findViewById(R.id.button13);
        button13.setOnClickListener(new OnClickListener(){
           
           
            public void onClick(View view) {          
                startWork(13);
                }
            });
         ///////////////////////////////////////
       ///////////////////////////////////////
        
        final Button button14 = (Button) findViewById(R.id.button14);
        button14.setOnClickListener(new OnClickListener(){
           
           
            public void onClick(View view) {          
                startWork(14);
                }
            });
         ///////////////////////////////////////
       ///////////////////////////////////////
        
        final Button button15 = (Button) findViewById(R.id.button15);
        button15.setOnClickListener(new OnClickListener(){
           
           
            public void onClick(View view) {          
                startWork(15);
                }
            });
         ///////////////////////////////////////
       ///////////////////////////////////////
        
        final Button button16 = (Button) findViewById(R.id.button16);
        button16.setOnClickListener(new OnClickListener(){
           
           
            public void onClick(View view) {          
                startWork(16);
                }
            });
         ///////////////////////////////////////
       ///////////////////////////////////////
        
        final Button button17 = (Button) findViewById(R.id.button17);
        button17.setOnClickListener(new OnClickListener(){
           
           
            public void onClick(View view) {          
                startWork(17);
                }
            });
         ///////////////////////////////////////
       ///////////////////////////////////////
        
        final Button button18 = (Button) findViewById(R.id.button18);
        button18.setOnClickListener(new OnClickListener(){
           
           
            public void onClick(View view) {          
                startWork(18);
                }
            });
         ///////////////////////////////////////
       ///////////////////////////////////////
        
        final Button buttonwarmup = (Button) findViewById(R.id.warmup_button);
        buttonwarmup.setOnClickListener(new OnClickListener(){
           
           
            public void onClick(View view) {          
                startWork(20);
                }
            });
        }   
        
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        
        menu.add(1, 1, Menu.FIRST, "Tutorial");
        menu.add(1, 3, Menu.FIRST +3, "About");
        
        return true;
    }
    
    public void startWork(int day)
    {
        Intent i = new Intent(getApplicationContext(), daybuzzer.class);
        i.putExtra("current_day", day);
        startActivity(i);
    }
    
    public void settingsIntent() //toasts and takes you to the settings...
    {
//        Toast toast = Toast.makeText(context, text, duration);
//        TextView v = (TextView) toast.getView().findViewById(android.R.id.message);
//        v.setTextColor(Color.CYAN);
//        toast.show();
        
        Intent in = new Intent(MainActivity.this, settings.class);
        
        startActivity(in);
        setResult(Activity.RESULT_OK);
        
    }
    
    public void aboutIntent()
    {
        Intent in = new Intent(MainActivity.this, feedback.class);
        
        startActivity(in);
        setResult(Activity.RESULT_OK);
    }

    public void tutorialIntent() //toasts and takes you to the settings...
    {
//        Toast toast = Toast.makeText(context, text, duration);
//        TextView v = (TextView) toast.getView().findViewById(android.R.id.message);
//        v.setTextColor(Color.CYAN);
//        toast.show();
        
        Log.e("tutorialintent I", "It got this far");
        
        Intent in = new Intent(MainActivity.this, tutorial.class);
        
        startActivity(in);
        setResult(Activity.RESULT_OK);
        
    }

    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) { //since int IDS are 1-4
            case 1:
                Log.e("test", "tutorial intent pressed");
                tutorialIntent();
                return true;
            case 2: //clear
                settingsIntent();
                return true;
            case 3:
                aboutIntent();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    
    public void setButtons()
    {
        Button butt1 = (Button)findViewById(R.id.button1);
        Button butt2 = (Button)findViewById(R.id.button2);
        Button butt3 = (Button)findViewById(R.id.button3);
        Button butt4 = (Button)findViewById(R.id.button4);
        Button butt5 = (Button)findViewById(R.id.button5);
        Button butt6 = (Button)findViewById(R.id.button6);
        Button butt7 = (Button)findViewById(R.id.button7);
        Button butt8 = (Button)findViewById(R.id.button8);
        Button butt9 = (Button)findViewById(R.id.button9);
        Button butt10 = (Button)findViewById(R.id.button10);
        Button butt11 = (Button)findViewById(R.id.button11);
        Button butt12 = (Button)findViewById(R.id.button12);
        Button butt13 = (Button)findViewById(R.id.button13);
        Button butt14 = (Button)findViewById(R.id.button14);
        Button butt15 = (Button)findViewById(R.id.button15);
        Button butt16 = (Button)findViewById(R.id.button16);
        Button butt17 = (Button)findViewById(R.id.button17);
        Button butt18 = (Button)findViewById(R.id.button18);

        
        butt1.setText("1");
        butt2.setText("1");
        butt3.setText("1");
        butt4.setText("1");
        butt5.setText("1");
        butt6.setText("1");
        butt7.setText("1");
        butt8.setText("1");
        butt9.setText("1");
        butt10.setText("1");
        butt11.setText("1");
        butt12.setText("1");
        butt13.setText("1");
        butt14.setText("1");
        butt15.setText("1");
        butt16.setText("1");
        butt17.setText("1");
        butt18.setText("1");

        
    }
    
}
