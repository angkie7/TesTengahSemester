package com.example.testengahsemester.Model;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.testengahsemester.R;

public class CreateMatkul extends AppCompatActivity {
    private Spinner spinnerI, spinnerII;
    private static final String[] hari = {"Monday","Thusday","Wednesday","Thursday","Friday"};
    private static final String[] sesi = {"I","II","III","IV"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_create_matkul );

        spinnerI = (Spinner)findViewById( R.id.spn1 );
        ArrayAdapter<String>adapter = new ArrayAdapter<>( CreateMatkul.this,android.R.layout.simple_spinner_item,hari );
        adapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item );
        spinnerI.setAdapter( adapter );

        spinnerII = (Spinner)findViewById( R.id.spn1 );
        ArrayAdapter<String>adapter2 = new ArrayAdapter<>( CreateMatkul.this,android.R.layout.simple_spinner_item,sesi );
        adapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item );
        spinnerII.setAdapter( adapter2 );

        Button btnSimpanMatkul = (Button)findViewById( R.id.btnSimpan );
        btnSimpanMatkul.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CreateMatkul.this, MainActivity.class);
                startActivity(intent);
            }
        } );
    }
}
