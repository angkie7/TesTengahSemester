package com.example.testengahsemester.Model;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.testengahsemester.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        ImageButton btnDataAdmin = (ImageButton)findViewById( R.id.btnDataAdmin );
        btnDataAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
            Intent intent = new Intent( MainActivity.this, DataAdmin.class );
            startActivity( intent );
        }

        });

        ImageButton btnDosen = (ImageButton)findViewById( R.id.btnDosen );
        btnDosen.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( MainActivity )
            }
        } );
    }
}
