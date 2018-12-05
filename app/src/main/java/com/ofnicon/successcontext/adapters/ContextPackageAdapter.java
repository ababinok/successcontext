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
import com.ofnicon.successcontext.objects.ContextPackage;

import java.util.ArrayList;

public class ContextPackageAdapter extends ArrayAdapter<ContextPackage> {

    public ContextPackageAdapter(Context context, ArrayList<ContextPackage> objects) {
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

        ContextPackage currentContextPackage = getItem(position);

        CheckedTextView titleTV = listItemView.findViewById(R.id.package_title);
        TextView descriptionTV = listItemView.findViewById(R.id.package_description);

        titleTV.setText(currentContextPackage != null ? currentContextPackage.getTitle() : "");
        descriptionTV.setText(currentContextPackage != null ? currentContextPackage.getDescription() : "");
        titleTV.setChecked(currentContextPackage != null && currentContextPackage.isChecked());

        return listItemView;

    }
}
