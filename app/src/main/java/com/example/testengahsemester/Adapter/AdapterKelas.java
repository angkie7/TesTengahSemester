package com.example.testengahsemester.Adapter;

import android.content.Context;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public abstract class AdapterKelas extends RecyclerView.Adapter<AdapterKelas.ViewHolder> {
    private ArrayList<Kelas> dataList;
    private Context context;
    public AdapterKelas (ArrayList<Kelas> dataList){
        this.dataList = dataList;
    }
}

}
