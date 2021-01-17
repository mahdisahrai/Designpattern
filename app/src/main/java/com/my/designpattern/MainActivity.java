package com.my.designpattern;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;

import com.my.designpattern.databinding.ActivityMainBinding;
import com.my.designpattern.model.Model1;
import com.my.designpattern.viewmodel.Viewmodel1;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        //--------------Casting------------------------------------------





        //---------Clicks with ClickListener------------
        binding.setModelMainClick(new ClickEvent() {
            @Override
            public void ClickListener1() {
                startActivity(new Intent(MainActivity.this,singletonActivity.class));
            }

            @Override
            public void ClickListener2() {
                startActivity(new Intent(MainActivity.this,BuilderActivity.class));
            }

            @Override
            public void ClickListener3() {
                startActivity(new Intent(MainActivity.this,PrototypeActivity.class));
            }

            @Override
            public void ClickListener4() {
                startActivity(new Intent(MainActivity.this,AbstractFactoryActivity.class));
            }
        });



    }
}