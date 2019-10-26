package com.example.testengahsemester.Model;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.testengahsemester.R;

public class CreateDosen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_create_dosen );
        this.setTitle( "Sistem Informasi KRS - Hallo Gess" );

        Button btnDaftarKrs =(Button)findViewById( R.id.btnSimpan );
        btnDaftarKrs.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent intent =new Intent( CreateDosen.this, MainActivity.class );
            startActivity( intent );
            }
        } );
    }
}
