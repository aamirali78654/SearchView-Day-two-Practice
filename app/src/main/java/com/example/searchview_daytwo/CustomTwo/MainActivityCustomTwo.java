package com.example.searchview_daytwo.CustomTwo;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SearchView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.searchview_daytwo.R;

import java.util.ArrayList;

public class MainActivityCustomTwo extends AppCompatActivity {

    ListView list_viewTwo;
    SearchView search_viewTwo;
    ArrayList names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_custom_two);
        list_viewTwo= (ListView) findViewById(R.id.list_viewTwo);
        search_viewTwo = (SearchView) findViewById(R.id.search_viewTwo);

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

        CustomSearchTwo cSearchtwo = new CustomSearchTwo(MainActivityCustomTwo.this , names);
        list_viewTwo.setAdapter(cSearchtwo);


        search_viewTwo.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                cSearchtwo.MyFilter(s);
                return false;
            }
        });
    }
}