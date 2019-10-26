package com.example.testengahsemester.Model;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.testengahsemester.R;


public class DataDosen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_data_dosen );
        this.setTitle( "Sistem Informasi KRS - Hello Gess" );

        Button btnSimpanDsn = (Button)findViewById(R.id.btnSimpan);
        btnSimpanDsn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DataDosen.this, DosenUtama.class);
                startActivity(intent);
            }
        } );
    }
}
