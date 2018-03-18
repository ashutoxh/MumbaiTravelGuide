package com.example.ashu.mumbaitravelguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by ashu on 22/6/17.
 */

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position)
    {
        if (position == 0) {
            return new PlacesToVisitFragment();
        }
        else if (position == 1) {
            return new EateriesFragment();
        }
        else if(position == 2)
            return new MallsFragment();
        else
            return new CinemaFragment();
        }
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0)
            return mContext.getString(R.string.category_places);
        else if (position == 1)
            return mContext.getString(R.string.category_restaurants);
        else if(position == 2)
            return mContext.getString(R.string.category_malls);
        else
            return mContext.getString(R.string.category_cinema);
    }

}
