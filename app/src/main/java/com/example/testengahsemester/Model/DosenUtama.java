package com.example.testengahsemester.Model;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.testengahsemester.R;

public class DosenUtama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_dosen_utama );
        this.setTitle( "Sistem Informasi KRS - Hello Gess" );

        ImageButton btnDosen =(ImageButton)findViewById( R.id.btnDosen );
        btnDosen.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( DosenUtama.this, DataDosen.class );
                startActivity( intent );
            }
        } );

        ImageButton btnKrs = (ImageButton)findViewById( R.id.btnKrs );
        btnKrs.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (DosenUtama.this, DataDosen.class);
                startActivity( intent );
            }
        } );

        ImageButton btnKelas = (ImageButton)findViewById( R.id.btnKelas );
        btnKelas.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( DosenUtama.this, DataDosen.class );
                startActivity( intent );
            }
        } );
    }
}
