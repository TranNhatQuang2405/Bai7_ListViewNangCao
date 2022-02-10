package com.example.bai7_listviewnangcao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listViewFruit;
    ArrayList<Fruit> arrayFruit;
    FruitAdapter fruitAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        fruitAdapter = new FruitAdapter(this, R.layout.line_fruit, arrayFruit);
        listViewFruit.setAdapter(fruitAdapter);
    }

    private void AnhXa(){
        listViewFruit = (ListView) findViewById(R.id.listViewFruit);
        arrayFruit = new ArrayList<>();
        arrayFruit.add(new Fruit("Chuối", "Món Ăn Nhiệt Đới Nhiều Phụ Nữ Mê", R.drawable.chuoi));
        arrayFruit.add(new Fruit("Táo", "Bạch Tuyết Hay Ăn", R.drawable.tao));
        arrayFruit.add(new Fruit("Nho", "Chùm nho xinh xinh", R.drawable.nho));

        arrayFruit.add(new Fruit("Chuối", "Món Ăn Nhiệt Đới Nhiều Phụ Nữ Mê", R.drawable.chuoi));
        arrayFruit.add(new Fruit("Táo", "Bạch Tuyết Hay Ăn", R.drawable.tao));
        arrayFruit.add(new Fruit("Nho", "Chùm nho xinh xinh", R.drawable.nho));

        arrayFruit.add(new Fruit("Chuối", "Món Ăn Nhiệt Đới Nhiều Phụ Nữ Mê", R.drawable.chuoi));
        arrayFruit.add(new Fruit("Táo", "Bạch Tuyết Hay Ăn", R.drawable.tao));
        arrayFruit.add(new Fruit("Nho", "Chùm nho xinh xinh", R.drawable.nho));
    }
}