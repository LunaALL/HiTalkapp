package com.company.wooju.hitalkapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.company.wooju.hitalkapp.fragment.PeopleFragment;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getFragmentManager().beginTransaction().replace(R.id.mainactivity_framelayout,new PeopleFragment()).commit();
    }
}
