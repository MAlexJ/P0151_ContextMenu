package com.example.alex.p0151_contextmenu;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import entity.Catalog;

/**
 * Created by Alex on 02.08.2015.
 */
public class SecondActivity extends Activity {

    private ArrayList<HashMap<String, Object>> catalogList;
    private HashMap<String, Object> tempMap;
    private static final String NAME = "name"; // Tекст
    private static final String ICON = "icon";  // Kартинка
    private ListView listView;
    private SimpleAdapter adapter;


    private static List<Catalog> productList;

    static {
        productList = new ArrayList<>();
        productList.add(new Catalog("Электронные сигареты", R.drawable.e_cigarettes));
        productList.add(new Catalog("Электронные кальяны", R.drawable.el_hookahs));
        productList.add(new Catalog("Атомайзеры", R.drawable.atomizer));
        productList.add(new Catalog("Аккумуляторы для электронных сигарет", R.drawable.batteries_cigarettes));
        productList.add(new Catalog("Комплектующие", R.drawable.accessories));
        productList.add(new Catalog("Жидкости для электронных сигарет и кальянов", R.drawable.fluid_cigarettes_hookahs));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);


        // ListView -> http://developer.alexanderklimov.ru/android/listview/icon_twotext_simpleadapter.php
        this.listView = (ListView) findViewById(R.id.list_view_second_activity);
        this.catalogList = new ArrayList<HashMap<String, Object>>();

        for (Catalog iter : this.productList) {
            tempMap = new HashMap<>();
            tempMap.put(NAME, iter.getName());
            tempMap.put(ICON, iter.getImage());
            catalogList.add(tempMap);
        }

        this.adapter = new SimpleAdapter(this, catalogList,
                R.layout.inem_lv_catalog, new String[]{ICON, NAME},
                new int[]{R.id.item_image,R.id.item_text});

        listView.setAdapter(adapter);
    }
}
