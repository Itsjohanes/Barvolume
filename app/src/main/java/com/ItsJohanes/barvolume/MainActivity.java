package com.ItsJohanes.barvolume;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
Button btnHitung;
EditText angka1;
EditText angka2;
EditText angka3;
TextView txtHasil;
int hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnHitung = (Button) findViewById(R.id.btnHitung);
        angka1 = (EditText) findViewById(R.id.editTextNumber);
        angka2 = (EditText) findViewById(R.id.editTextNumber2);
        angka3 =  (EditText) findViewById(R.id.editTextNumber4);
        txtHasil = (TextView) findViewById(R.id.textView7);
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    hasil = eksekusi();

                    txtHasil.setText(Integer.toString(hasil));

            }
        });


    }
    public int eksekusi(){
        int angkaPanjang = Integer.parseInt(angka1.getText().toString());
        int angkaLebar = Integer.parseInt(angka2.getText().toString());
        int angkaTinggi = Integer.parseInt(angka3.getText().toString());
        return angkaPanjang * angkaLebar * angkaTinggi;
    }

}