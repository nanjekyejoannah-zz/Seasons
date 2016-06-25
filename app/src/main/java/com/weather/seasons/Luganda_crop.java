package com.weather.seasons;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Luganda_crop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.luganda_default);

        final EditText editText = (EditText) findViewById(R.id.edit_message5  );
        String input = editText.getText().toString() ;

        Button b1 = (Button) findViewById(R.id.btnEngLDft );
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = editText.getText().toString() ;
                if (input != null)
                {
                    if (input.equals("1"))
                    {
                        Intent intent= new Intent(Luganda_crop.this, luganda_wether_info  .class);
                        startActivity(intent);

                    }
                    else if (input.equals("2"))
                    {
                        Intent intent= new Intent(Luganda_crop.this,  luganda_crop_rec.class);
                        startActivity(intent);
                    }
                    else if (input.equals("3"))
                    {
                        Intent intent= new Intent(Luganda_crop.this,  luganda_audio_cast .class);
                        startActivity(intent);
                    }

                    else
                    {
                        Toast toast=Toast.makeText(getApplicationContext(),"nyiga 1 or 2 ",Toast.LENGTH_SHORT);
                        toast.setMargin(50,50);
                        toast.show();



                    }
                }
                else
                {
                    Toast toast=Toast.makeText(getApplicationContext(),"nyiga ",Toast.LENGTH_SHORT);
                    toast.setMargin(50,50);
                    toast.show();
                }



            }
        });






    }

}
