package com.example.testengahsemester.Model;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.testengahsemester.R;

public class AdaLayarUtama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_ada_layar_utama );
        this.getSupportActionBar ().hide();

        Button btnAdmin = (Button)findViewById( R.id.btnAdmin );
        btnAdmin.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdaLayarUtama.this, MainActivity.class);
                startActivity(intent);
            }
        } );

        Button btnDosen = (Button)findViewById( R.id.btnDosen );
        btnDosen.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (AdaLayarUtama.this, MainActivity.class);
                startActivity( intent );
            }
        } );
    }
}
