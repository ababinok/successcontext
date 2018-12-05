package com.ofnicon.successcontext.activities;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;

import com.ofnicon.successcontext.R;
import com.ofnicon.successcontext.adapters.ContextPackageAdapter;
import com.ofnicon.successcontext.objects.ContextPackage;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        @SuppressLint("InflateParams") final View header = LayoutInflater.from(this).inflate(R.layout.package_header, null);

        ListView listView = findViewById(R.id.packages_list);
        listView.addHeaderView(header);

        ArrayList<ContextPackage> contextPackages = new ArrayList<>();
        contextPackages.add(new ContextPackage("Идеология лидера", "10 утверждений", true));
        contextPackages.add(new ContextPackage("Убеждения лидера", "5 фраз", false));

        ContextPackageAdapter contextPackageAdapter = new ContextPackageAdapter(this, contextPackages);

        listView.setAdapter(contextPackageAdapter);

    }
}
