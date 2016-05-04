package com.relferreira.myappportifolio;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnMovies;
    private Button btnStock;
    private Button btnBuildBigger;
    private Button btnMaterial;
    private Button btnUbiquitous;
    private Button btnCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findView();
        addListeners();
    }

    private void findView(){
        btnMovies = (Button) findViewById(R.id.btn_movies);
        btnStock = (Button) findViewById(R.id.btn_stock);
        btnBuildBigger = (Button) findViewById(R.id.btn_build_bigger);
        btnMaterial = (Button) findViewById(R.id.btn_material);
        btnUbiquitous = (Button) findViewById(R.id.btn_ubiquitous);
        btnCapstone = (Button) findViewById(R.id.btn_capstone);
    }

    private void addListeners(){

        Resources resources = getResources();
        btnMovies.setTag(resources.getString(R.string.main_popular_movies));
        btnMovies.setOnClickListener(btnClick);

        btnStock.setTag(resources.getString(R.string.main_stock_hawk));
        btnStock.setOnClickListener(btnClick);

        btnBuildBigger.setTag(resources.getString(R.string.main_build_bigger));
        btnBuildBigger.setOnClickListener(btnClick);

        btnMaterial.setTag(resources.getString(R.string.main_make_your_app_material));
        btnMaterial.setOnClickListener(btnClick);

        btnUbiquitous.setTag(resources.getString(R.string.main_go_ubiquitous));
        btnUbiquitous.setOnClickListener(btnClick);

        btnCapstone.setTag(resources.getString(R.string.main_capstone));
        btnCapstone.setOnClickListener(btnClick);
    }

    private View.OnClickListener btnClick = new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            String projectName = (String)v.getTag();
            Toast.makeText(MainActivity.this, String.format(getResources().getString(R.string.main_toast), projectName), Toast.LENGTH_SHORT).show();
        }
    };
}
