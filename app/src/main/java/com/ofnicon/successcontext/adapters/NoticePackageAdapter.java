package com.ofnicon.successcontext.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.TextView;

import com.ofnicon.successcontext.R;
import com.ofnicon.successcontext.objects.NoticePackage;

import java.util.ArrayList;

public class NoticePackageAdapter extends ArrayAdapter<NoticePackage> {

    public NoticePackageAdapter(Context context, ArrayList<NoticePackage> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.package_item, parent, false);
        }

        NoticePackage currentNoticePackage = getItem(position);

        CheckedTextView titleTV = listItemView.findViewById(R.id.package_title);
        TextView descriptionTV = listItemView.findViewById(R.id.package_description);

        titleTV.setText(currentNoticePackage != null ? currentNoticePackage.getTitle() : "");
        descriptionTV.setText(currentNoticePackage != null ? currentNoticePackage.getDescription() : "");
        titleTV.setChecked(currentNoticePackage != null && currentNoticePackage.isChecked());

        return listItemView;

    }
}
