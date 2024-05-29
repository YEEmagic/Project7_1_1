package com.example.project7_1_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout baseLayout;
    Button button1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("배경색 바꾸기");
        baseLayout = (LinearLayout) findViewById(R.id.baseLayout);
        button1 = (Button) findViewById(R.id.button1);
        registerForContextMenu(baseLayout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        menu.add(0,1,0,"배경색 (빨강)");
        menu.add(0,2,0,"배경색 (초록)");
        menu.add(0,3,0,"배경색 (파랑)");

        SubMenu sMenu = menu.addSubMenu("버튼 변경 >>");
        sMenu.add(0,4,0,"버튼 45도 회전");
        sMenu.add(0,5,0,"버튼 2배 확대");
        //        MenuInflater mInflater = getMenuInflater();
        //        mInflater.inflate(R.menu.menu1, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            // case R.id.itemRed:
            case 1:
                baseLayout.setBackgroundColor(Color.RED);
                return true;
            case 2:
            //case R.id.itemGreen:
                baseLayout.setBackgroundColor(Color.GREEN);
                return true;
            case 3:
            //case R.id.itemBlue:
                baseLayout.setBackgroundColor(Color.BLUE);
                return true;
            case 4:
            //case R.id.subRotate:
                button1.setRotation(45);
                return true;
            case 5:
            //case R.id.subSize:
                button1.setScaleX(2);
                return true;
            }
            return false;
        //  return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater mInflater = getMenuInflater();
        //if(v == 위젯1) {
        {
            mInflater.inflate(R.menu.menu1, menu);
        }
//        if (v == 위젯2) {
//            mInflater.inflate(R.menu.두번째메뉴XML파일, menu);
//        }
    }

}