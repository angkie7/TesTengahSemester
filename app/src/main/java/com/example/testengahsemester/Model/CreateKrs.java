package com.example.testengahsemester.Model;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.testengahsemester.R;

public class CreateKrs extends AppCompatActivity {
    private Spinner spinnerI;
    private static final  String[] dosen = {"Umi", "Budi", "Yetli", "Jong Jek Siang", "Halim"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_create_krs );
        this.setTitle( "Sistem Informasi KRS - Hallo Gess" );

        spinnerI = (Spinner)findViewById( R.id.spnKrs );
        ArrayAdapter<String> adapter = new ArrayAdapter<>( CreateKrs.this,android.R.layout.simple_spinner_item,dosen );
        adapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item );
        spinnerI.setAdapter( adapter );

        Button btnSimpan = (Button)findViewById( R.id.btnSimpan );
        btnSimpan.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( CreateKrs.this, MainActivity.class );
                startActivity( intent );
            }
        } );
    }
}
