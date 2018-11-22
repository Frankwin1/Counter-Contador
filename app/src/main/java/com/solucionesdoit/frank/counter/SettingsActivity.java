package com.solucionesdoit.frank.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

    }
    int conteo = 0;
    public void reset2 (View view){
        conteo = 0;
        display(conteo);

    }

    public void display(int number) {
        TextView eltexto = (TextView) findViewById(R.id.el_texto);
        eltexto.setText("" + number);
    }
}
