package com.example.ashu.mumbaitravelguide;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

/**
 * Created by ashu on 22/6/17.
 */

public class Word
{
    private String nameOfPlace;
    private String locationOfPlace;

    private String NO_TEXT_PROVIDED = "-1";
    private String extraFieldOfPlace =NO_TEXT_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;
    private int imageOfThePlace = NO_IMAGE_PROVIDED;

    public Word(String nameOfPlace,String locationOfPlace,String extraFieldOfPlace, int imageOfThePlace)
    {
        this.nameOfPlace = nameOfPlace;
        this.locationOfPlace = locationOfPlace;
        this.extraFieldOfPlace = extraFieldOfPlace;
        this.imageOfThePlace = imageOfThePlace;
    }


    public String getNameOfPlace()
    {
        return nameOfPlace;
    }

    public String getLocationOfPlace()
    {
        return locationOfPlace;
    }

    public String getExtraFieldOfPlace()
    {
        return extraFieldOfPlace;
    }

    public int getImageOfPlace()
    {
        return imageOfThePlace ;
    }

    public boolean hasImage()
    {
        return imageOfThePlace != NO_IMAGE_PROVIDED;
    }

    public  boolean hasThirdText()
    {
        return extraFieldOfPlace != NO_TEXT_PROVIDED;
    }
}
