package com.example.ashu.mumbaitravelguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ashu on 22/6/17.
 */

public class WordAdapter extends ArrayAdapter<Word>
{
    private  int mColorResourceId;

    public WordAdapter(@NonNull Activity context, @NonNull ArrayList<Word> words, int mColorResource) {
        super(context,0, words);
        mColorResourceId= mColorResource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        View listItemView = convertView;

        if (listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item ,parent ,false);
        }

        Word currentPlace = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentPlace.getNameOfPlace());

        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location_text_view);
        locationTextView.setText(currentPlace.getLocationOfPlace());

        TextView extraTextView = (TextView) listItemView.findViewById(R.id.extra_text_view);
        if(currentPlace.hasThirdText()) {
            extraTextView.setText(currentPlace.getExtraFieldOfPlace());
            extraTextView.setVisibility(View.VISIBLE);
        }
        else
        {
            extraTextView.setVisibility(View.GONE);
        }


        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageOfPlace);

        if(currentPlace.hasImage())
        {
            imageView.setImageResource(currentPlace.getImageOfPlace());
            imageView.setVisibility(View.VISIBLE);
        }
        else
        {
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        textContainer.setBackgroundColor(color);


        return listItemView;

    }
}
