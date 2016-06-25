package com.weather.seasons;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class English_default extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.english_default);

        final EditText editText = (EditText) findViewById(R.id.edit_message1  );
        String input = editText.getText().toString() ;

        Button b1 = (Button) findViewById(R.id.btnEngDft );
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = editText.getText().toString() ;
                if (input != null)
                {
                    if (input.equals("1"))
                    {
                        Intent intent= new Intent(English_default.this, English_wether_info  .class);
                        startActivity(intent);

                    }
                    else if (input.equals("2"))
                    {
                        Intent intent= new Intent(English_default.this,  english_crop_rec.class);
                        startActivity(intent);
                    }
                    else if (input.equals("3"))
                    {
                        Intent intent= new Intent(English_default.this,  english_audio_cast .class);
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

}
