package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Hero> herolist;

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        herolist = new ArrayList<>();
        listView = (ListView) findViewById(R.id.listView);

        herolist.add(new Hero(R.drawable.spiderman, "Spiderman", "Avengers"));
        herolist.add(new Hero(R.drawable.joker, "Joker", "Injustice Gang"));
        herolist.add(new Hero(R.drawable.ironman, "Iron Man", "Avengers"));
        herolist.add(new Hero(R.drawable.doctorstrange, "Doctor Strange", "Avengers"));
        herolist.add(new Hero(R.drawable.captainamerica, "Captain America", "Avengers"));
        herolist.add(new Hero(R.drawable.batman, "Batmans", "Justice League"));

        MyListAdapter adapter = new MyListAdapter(this, R.layout.my_custom_list,herolist);

        listView.setAdapter(adapter);
    }
}
