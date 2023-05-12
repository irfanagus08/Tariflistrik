package com.example.tariflistrik;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ednama,edtypemeteran,edbulanlalu,edbulanini,edpemakaian,edpembayaran;
    Button bthitung;
    Double vbulanlalu,vbulanini,vpemakaian,vpembayaran;
    String vnama,vtypemeteran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ednama = (EditText) findViewById(R.id.ednama);
        edtypemeteran = (EditText) findViewById(R.id.edtypemeteran);
        edbulanlalu = (EditText) findViewById(R.id.edbulanlalu);
        edbulanini = (EditText) findViewById(R.id.edbulanini);
        edpemakaian = (EditText) findViewById(R.id.edpemakaian);
        edpembayaran = (EditText) findViewById(R.id.edpembayaran);
        bthitung = (Button) findViewById(R.id.bthitung);
    }

    public void hitung(View view) {
        vbulanlalu = Double.parseDouble(edbulanlalu.getText().toString());
        vbulanini = Double.parseDouble(edbulanini.getText().toString());
        vtypemeteran = edtypemeteran.getText().toString();

        vpemakaian = vbulanini - vbulanlalu;

        if (vtypemeteran.equals("R1")) {
            vpembayaran = (vpemakaian*300)+20000;
        }
        else if (vtypemeteran.equals("R2")) {
            vpembayaran = (vpemakaian*450)+25000;
        }
        else if (vtypemeteran.equals("R3")) {
            vpembayaran = (vpemakaian*600)+30000;
        }
        else {
            vpembayaran = (vpemakaian*800)+40000;
        }
        edpemakaian.setText(""+vpemakaian);
        edpembayaran.setText(""+vpembayaran);
    }
}