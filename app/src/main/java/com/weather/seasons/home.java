package com.weather.seasons;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class home extends AppCompatActivity {

    English_wether_info english_wether_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
       // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
       // setSupportActionBar(toolbar);

        final EditText editText = (EditText) findViewById(R.id.edit_message );
        String input = editText.getText().toString() ;

        Button b1 = (Button) findViewById(R.id.btnhome);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = editText.getText().toString() ;
                if (input != null)
                {
                    if (input.equals("1"))
                    {
                        Intent intent= new Intent(home.this,English_default .class);
                        startActivity(intent);

                    }
                    else if (input.equals("2"))
                    {
                        Intent intent= new Intent(home.this,Luganda_crop.class);
                        startActivity(intent);
                    }

                    else
                    {
                        Toast toast=Toast.makeText(getApplicationContext(),"Please enter 1 or 2 ",Toast.LENGTH_SHORT);
                        toast.setMargin(50,50);
                        toast.show();



                    }
                }
                else
                {
                    Toast toast=Toast.makeText(getApplicationContext(),"Please enter a number ",Toast.LENGTH_SHORT);
                    toast.setMargin(50,50);
                    toast.show();
                }



            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
