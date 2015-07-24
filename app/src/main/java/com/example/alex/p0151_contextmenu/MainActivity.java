package com.example.alex.p0151_contextmenu;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {
    private TextView tv_01;
    private TextView tv_02;
    private TextView tv_03;
    private TextView tv_04;
    private final int INFO = 1;
    private final int DELETE = 2;
    private ImageView imageNextActiv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_01 = (TextView) findViewById(R.id.tv_catalog_01);
        tv_02 = (TextView) findViewById(R.id.tv_catalog_02);
        tv_03 = (TextView) findViewById(R.id.tv_catalog_03);
        tv_04 = (TextView) findViewById(R.id.tv_catalog_04);

        imageNextActiv = (ImageView) findViewById(R.id.next_act);


        imageNextActiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int num = (int) (Math.random() * 10);

                switch (num) {
                    case 0:
                        tv_01.setTextColor(Color.WHITE);
                        break;
                    case 1:
                        tv_01.setTextColor(Color.TRANSPARENT);
                        break;
                    case 2:
                        tv_01.setTextColor(Color.LTGRAY);
                        break;
                    case 3:
                        tv_01.setTextColor(Color.DKGRAY);
                        break;
                    case 4:
                        tv_01.setTextColor(Color.MAGENTA);
                        break;
                    case 5:
                        tv_01.setTextColor(Color.CYAN);
                        break;
                    case 6:
                        tv_01.setTextColor(Color.RED);
                        break;
                    case 7:
                        tv_01.setTextColor(Color.YELLOW);
                        break;
                    default:
                        tv_01.setTextColor(Color.BLACK);
                        break;
                }


            }
        });

        registerForContextMenu(tv_01);
        registerForContextMenu(tv_02);
        registerForContextMenu(tv_03);
        registerForContextMenu(tv_04);
    }

    //* Called when a context menu for the view is about to be shown.
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        switch (v.getId()) {
            case R.id.tv_catalog_01:
                //  menu.add()
                menu.add(0, INFO, 0, "Info");
                menu.add(0, DELETE, 0, "Delete");
                break;
            case R.id.tv_catalog_02:
                menu.add(0, INFO, 0, "Info");
                menu.add(0, DELETE, 0, "Delete");
                break;
            case R.id.tv_catalog_03:
                menu.add(0, INFO, 0, "Info");
                menu.add(0, DELETE, 0, "Delete");
                break;
            case R.id.tv_catalog_04:
                menu.add(0, INFO, 0, "Info");
                menu.add(0, DELETE, 0, "Delete");
                break;
        }
    }

    //This hook is called whenever an item in a context menu is selected.
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case INFO:
                Toast.makeText(this, "INFO Product", Toast.LENGTH_SHORT).show();
                break;
            case DELETE:
                Toast.makeText(this, "DELETE Product", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onContextItemSelected(item);
    }


}
