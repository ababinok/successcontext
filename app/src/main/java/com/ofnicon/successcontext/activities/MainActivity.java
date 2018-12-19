package com.ofnicon.successcontext.activities;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;

import com.ofnicon.successcontext.R;
import com.ofnicon.successcontext.adapters.NoticePackageAdapter;
import com.ofnicon.successcontext.objects.NoticePackage;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        @SuppressLint("InflateParams") final View header = LayoutInflater.from(this).inflate(R.layout.package_header, null);

        ListView listView = findViewById(R.id.packages_list);
        listView.addHeaderView(header);

        ArrayList<NoticePackage> noticePackages = new ArrayList<>();
        noticePackages.add(new NoticePackage("Идеология лидера", "10 утверждений", true));
        noticePackages.add(new NoticePackage("Убеждения лидера", "5 фраз", false));

        NoticePackageAdapter noticePackageAdapter = new NoticePackageAdapter(this, noticePackages);

        listView.setAdapter(noticePackageAdapter);

    }
}
