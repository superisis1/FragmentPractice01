package kr.insungjung.fragmentpractice01.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import kr.insungjung.fragmentpractice01.fragments.FragmentOne;
import kr.insungjung.fragmentpractice01.fragments.FragmentThree;
import kr.insungjung.fragmentpractice01.fragments.FragmentTwo;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNumOfTabs;

    public PagerAdapter(FragmentManager fragmentManager, int numOfTabs) {
        super(fragmentManager);
        mNumOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int i) {

        Fragment fragment = null;

        if (i == 0) {
            FragmentOne frag1 = new FragmentOne();
            fragment = frag1;
        } else if (i == 1) {
            FragmentTwo frag2 = new FragmentTwo();
            fragment = frag2;
        } else if (i == 2) {
            FragmentThree frag3 = new FragmentThree();
            fragment = frag3;
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
