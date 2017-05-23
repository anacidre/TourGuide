package com.example.android.sanxenxo_tourguide;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by ana on 16/05/2017.
 */

class CategoryAdapter extends FragmentPagerAdapter {


    private final Context mContext;


    CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }


    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        if (position == 0) {
            return new TodoFragment();
        } else if (position == 1) {
            return new FoodFragment();
        } else if (position == 2) {
            return new StayFragment();
        } else {
            return new TipsFragment();
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.todo_tab_name);
            case 1:
                return mContext.getString(R.string.food_tab_name);
            case 2:
                return mContext.getString(R.string.stay_tab_name);
            case 3:
                return mContext.getString(R.string.tips_tab_name);
        }
        return null;
    }
}