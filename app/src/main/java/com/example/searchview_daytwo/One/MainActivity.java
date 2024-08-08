package com.example.searchview_daytwo.One;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.searchview_daytwo.R;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    ListView list_view;
    SearchView search_view;
    ArrayList names;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        list_view = findViewById(R.id.list_view);
        search_view = findViewById(R.id.search_view);
        names = new ArrayList();
        names.add("Aamir");
        names.add("Ali");
        names.add("Razza");
        names.add("Azam");
        names.add("zia");
        names.add("Ahmed");
        names.add("Mansoor");
        names.add("Sajjad");
        names.add("Emii");
        names.add("Yasir");
        names.add("Zulfiqar");
        names.add("NazaKAT");
        names.add("Imran Khan");
        names.add("Zahid");
        names.add("sattar");
        names.add("shahbaz");
        names.add("mughal");
        names.add("sarkari");
        names.add("farhan");
        names.add("fahad");
        ArrayAdapter arr_adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,names);
        list_view.setAdapter(arr_adapter);
//------------------------SearchView Filteration ------------------------>>
        search_view.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                arr_adapter.getFilter().filter(s);
                return false;
            }
        });
    }
}