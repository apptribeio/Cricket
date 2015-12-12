package io.apptribe.cricket.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import io.apptribe.cricket.R;
import io.apptribe.cricket.fragment.FragmentCricketsList;

/**
 * Created by kerry on 12/12/15.
 */
public class CricketFragmentAdapter extends FragmentPagerAdapter{

    public CricketFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            default:
                return FragmentCricketsList.newInstance();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Crickets";
            case 1:
                return "Favorites";
            default:
                return super.getPageTitle(position);
        }
    }
}
