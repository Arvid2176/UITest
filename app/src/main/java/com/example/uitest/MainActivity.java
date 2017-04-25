package com.example.uitest;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.uitest.entity.Fruit;
import com.example.uitest.util.FruitAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private List<Fruit> fruitList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initFruitList();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null)
            actionBar.hide();
        FruitAdapter fruitAdapter=new FruitAdapter(MainActivity.this,R.layout.fruit_item,fruitList);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(fruitAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit=fruitList.get(position);
                Toast.makeText(MainActivity.this,fruit.getName(),Toast.LENGTH_SHORT).show();
            }
        });
    }
private void initFruitList(){
    for(int i=0;i<2;i++){
        Fruit apple=new Fruit();
        apple.setImgID(R.drawable.apple);
        apple.setName("apple");
        fruitList.add(apple);
        Fruit banana=new Fruit();
        banana.setName("banana");
        banana.setImgID(R.drawable.banana);
        fruitList.add(banana);
        Fruit orange =new Fruit();
        orange.setImgID(R.drawable.orange);
        orange.setName("orange");
        fruitList.add(orange);
        Fruit watermelon=new Fruit();
        watermelon.setName("watermelon");
        watermelon.setImgID(R.drawable.watermelon);
        fruitList.add(watermelon);
        Fruit pear=new Fruit();
        pear.setImgID(R.drawable.pear);
        pear.setName("pear");
        fruitList.add(pear);
        Fruit grape= new Fruit();
        grape.setName("grape");
        grape.setImgID(R.drawable.grape);
        fruitList.add(grape);
        Fruit pineapple =new Fruit();
        pineapple.setImgID(R.drawable.pineapple);
        pineapple.setName("pineapple");
        fruitList.add(pineapple);
        Fruit strawberry=new Fruit();
        strawberry.setName("strawberry");
        strawberry.setImgID(R.drawable.strawberry);
        fruitList.add(strawberry);
        Fruit kiwifruit=new Fruit();
        kiwifruit.setImgID(R.drawable.kiwifruit);
        kiwifruit.setName("kiwifruit");
        fruitList.add(kiwifruit);
    }
}

}
