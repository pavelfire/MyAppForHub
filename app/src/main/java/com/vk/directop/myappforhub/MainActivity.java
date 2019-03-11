package com.vk.directop.myappforhub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User user1 = new User();
    }
    public int sunFrom1ToN(int n){
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + i;
        }
        return sum;
    }

}
