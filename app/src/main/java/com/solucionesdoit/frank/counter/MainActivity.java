package com.solucionesdoit.frank.counter;

import android.content.Intent;
import android.preference.EditTextPreference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.autofill.AutofillValue;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int conteo = 0;
    EditText new_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new_number = (EditText)  findViewById(R.id.new_number);
    }

    public void incrementa(View view) {
        conteo = conteo + 1;
        display(conteo);
    }

    public void decrementa(View view) {
        conteo = conteo - 1;
        display(conteo);
    }

    public void display(int number) {
        TextView eltexto = (TextView) findViewById(R.id.el_texto);
        eltexto.setText("" + number);
    }
    public void reset2 (View view){
        conteo = 0;
        display(conteo);
    }
    public void reset3 (MenuItem Item){
        conteo = 0;
        display(conteo);
        }


    public void new_number (MenuItem Item){
        Toast.makeText(this,"hola",Toast.LENGTH_LONG).show();
    }



    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection

        int id =item.getItemId();
            if(id == R.id.new_number) {
                return true;

            }
                return super.onOptionsItemSelected(item);

    }


}
