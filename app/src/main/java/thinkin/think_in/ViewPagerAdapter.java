package thinkin.think_in;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import thinkin.think_in.feed_section.Feed_Fragment;
import thinkin.think_in.forum_section.Forum_Fragment;
import thinkin.think_in.planner_section.Planner_Fragment;

/**
 * Created by Gourav Beura on 11-01-2016.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    CharSequence Titles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created



    // Build a Constructor and assign the passed Values to appropriate values in the class
    public ViewPagerAdapter(FragmentManager fm,CharSequence mTitles[]) {
        super(fm);

        this.Titles = mTitles;


    }
    Fragment fragment;
    //This method return the fragment for the every position in the View Pager
    @Override
    public Fragment getItem(int position) {


        if (position == 0) // if the position is 0 we are returning the First tab
        {
            fragment = new Forum_Fragment();
        } else if (position == 1)             // As we are having 2 tabs if the position is now 0 it must be 1 so we are returning second tab
        {
            fragment = new Feed_Fragment();
        } else if (position == 2)
        {
            fragment = new Planner_Fragment();
        }
        return fragment;
    }

    // This method return the titles for the Tabs in the Tab Strip

    @Override
    public CharSequence getPageTitle(int position) {
        return Titles[position];
    }

    // This method return the Number of tabs for the tabs Strip

    @Override
    public int getCount() {
        return 3;
    }
}
