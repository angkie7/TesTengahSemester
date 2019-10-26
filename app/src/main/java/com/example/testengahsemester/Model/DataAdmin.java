package com.example.testengahsemester.Model;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.testengahsemester.R;

public class DataAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_data_admin );
        this.setTitle( "Sistem Informasi KRS - Hallo Gess " );

        Button btnSimpan = (Button)findViewById( R.id.btnSimpan );
        btnSimpan.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( DataAdmin.this, MainActivity.class ) ;
                startActivity( intent );

            }
        } );

    }
}
