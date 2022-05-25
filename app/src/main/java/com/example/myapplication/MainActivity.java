package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {


    private HashMap<String, String> map;
    private ArrayList<String> celebName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int index = 5;

        ArrayList<String> list = new ArrayList<>();
    }
    private void celeb() {
        ArrayList<String> celebNames = new ArrayList<>();
        celebNames.add(" ");
        celebNames.add(" ");
        celebNames.add(" ");
        celebNames.add(" ");
        celebNames.add(" ");
        celebNames.add(" ");
        celebNames.add(" ");
        HashMap<String, String> map = new HashMap<>();
        map.put(celebNames.get(0), " ");
        map.put(celebNames.get(1), " ");
        map.put(celebNames.get(2), " ");
        map.put(celebNames.get(3), " ");
        map.put(celebNames.get(4), " ");
        map.put(celebNames.get(5), "  ");
        map.put(celebNames.get(6), " ");
    }



    private void generateQuestions(HashMap<String, String> map, ArrayList<String> celebName) {
        this.map = map;
        this.celebName = celebName;

    }
}