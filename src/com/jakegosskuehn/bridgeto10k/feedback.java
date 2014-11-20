package com.jakegosskuehn.bridgeto10k;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class feedback extends Activity {
    final Context context = this;
    public View view;
    public SharedPreferences sp;
    public SharedPreferences.Editor e;
    public boolean autosms;
    public boolean showbox;
    
    public void thanks() //toasts and takes you to the settings...
    {
        Context context = getApplicationContext();
        CharSequence text = "creating the feedback text, thanks!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        TextView v = (TextView) toast.getView().findViewById(android.R.id.message);
        v.setTextColor(Color.CYAN);
        toast.show();
    }
    
    public void save(View view)
    {
        //THINGS HAPPEN HERE WITH SHARED PREFERENCES :(
        
        
        this.finish();
        return;
    }
    
    public void help(View view)
    {
        this.finish();
        return;
    }
    
    public void cancel(View view)
    {
        this.finish();
        return;
    }
    
public void sendText(View view) {
       
        String uri = "smsto:" + "9524546271";
        Intent smsIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse(uri));
        smsIntent.putExtra("compose_mode", true);
        
        
        EditText user_feedback = (EditText) findViewById(R.id.settings_checkboxbody_description_hint);
        String user_feedback_String = user_feedback.getText().toString();
        
        
        smsIntent.putExtra("sms_body", user_feedback_String); //obvi the message
       // smsIntent.putExtra("address", "9524546271"); //obvi the number, replace usernumberstring
       // smsIntent.setType("vnd.android-dir/mms-sms"); // guess i leave this alone
        startActivity(smsIntent);
}

    
    
    public void alert(){
        new AlertDialog.Builder(this)
        .setTitle("About Me")
        .setMessage("Hello! I am a university student that programs in my spare time, check out my other apps!. I've made this app primarly for those kinds of people" +
                " that enjoy running. This feedback page is also used for you to send me" +
                " direct feedback about the app." +
                "\n \n" +
                "I made this feedback a part of the user experience because I want to help you, the user, accomplish amazingness in the field." +
                " So if you have any sort of ideas to add onto this app or any new app ideas, feel free to share them with me so I can make that" +
                " a reality for you and potentially other people" +
                "\n \n" +
                "Feel free to check out my blog at jakegosskuehn.com, take care!")
        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) { 
                // continue with delete
            }
         })
//        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
//            public void onClick(DialogInterface dialog, int which) { 
//                // do nothing
//            }
//         })
       // .setIcon(R.drawable.ic_dialog_alert)
         .show();
    }
    
    
    
    
    
   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.feedback);
        
        //SP
        //sp = PreferenceManager.getDefaultSharedPreferences(getApplicationContext()); // forget about
        sp = getSharedPreferences("contactapp", 0);
        // named preferences - get the default ones and finish with it
        e = sp.edit();
        
        Button tt = (Button)findViewById(R.id.savebutton);
        tt.setOnClickListener(new View.OnClickListener() { 
            @Override
            public void onClick(View v) {
                thanks();
                sendText(view);
                
                //save(view);
                        //ADD INTENT TO SEND MESSAGE TO FEEDBACK
            }
        });
        
        Button tt2 = (Button)findViewById(R.id.helpButton);
        tt2.setOnClickListener(new View.OnClickListener() { 
            @Override
            public void onClick(View v) {
                alert();
                        
            }
        });
        
        Button tt3 = (Button)findViewById(R.id.cancelButton);
        tt3.setOnClickListener(new View.OnClickListener() { 
            @Override
            public void onClick(View v) {
                    finish();
                        
            }
        });
        
        
        
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // three lines below are default
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
        
        // Make MenuInflater
        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.menu, menu); //MENU.MENU DOESNT EXIST?
        inflater.inflate(R.menu.main, menu);
        SharedPreferences settings = getSharedPreferences("prefs", 0);
        //MENU//
        
        menu.add(1, 1, Menu.FIRST, "Tutorial");
        menu.add(1, 2, Menu.FIRST +2, "Settings");
        menu.add(1, 3, Menu.FIRST +3, "About");
        
        
        boolean firstRun = settings.getBoolean("firstRun", true);
        //lol
        if ( firstRun ){
          settings.edit().putBoolean("firstRun", false).commit();
            AlertDialog.Builder ad = new AlertDialog.Builder(this);  
            ad.setTitle("Hey there new user!");  
            ad.setMessage("- Thanks for considering to send me feedback! \n - Since you're a paid user, I cater to your needs. Send me what you'd like to see in future updates. \n Thanks for the feedback, and good luck with the app!"); 
            ad.setNegativeButton("OK", new DialogInterface.OnClickListener() {  
               public void onClick(DialogInterface dialog, int id) {  
                 dialog.dismiss(); 
            }  
            });  
            ad.show();
        }
    // Return True
    return true;
    }
    
}
