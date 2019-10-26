package com.example.testengahsemester.Model;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testengahsemester.Adapter.AdapterKelas;
import com.example.testengahsemester.Model.Kelas;
import com.example.testengahsemester.R;

import java.util.ArrayList;

public class RecyclerLihatKelas extends AppCompatActivity {
    private RecyclerView recyclerView;
    private AdpaterKelas adapterKelas;
    private ArrayList<kelas> kelasList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_recycler_lihat_kelas );

        this.setTitle("Sistem Informasi KRS - Holla Gess");

        tambahData ();
        recyclerView = findViewById( R.id.recviKelas );
        adapterKelas = new adapt(kelasList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager( RecyclerLihatKelas.this );
        recyclerView.setLayoutManager( layoutManager );
        recyclerView.setAdapter( adapt );
    }
}
