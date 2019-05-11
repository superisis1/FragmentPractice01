package kr.insungjung.fragmentpractice01.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import kr.insungjung.fragmentpractice01.fragments.FragmentOne;
import kr.insungjung.fragmentpractice01.fragments.FragmentThree;
import kr.insungjung.fragmentpractice01.fragments.FragmentTwo;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNumOfTabs;

    Fragment frag1, frag2, frag3;

    public PagerAdapter(FragmentManager fragmentManager, int numOfTabs) {
        super(fragmentManager);
        mNumOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int i) {

        Fragment fragment = null;

        if (i == 0) {
            // 재사용성을 위해 Null 일 때만 객채화한다.
            if (frag1 == null) {
                frag1 = new FragmentOne();
            }
            fragment = frag1;
        }
        else if (i == 1) {
            if (frag2 == null) {
                frag2 = new FragmentTwo();
            }
            fragment = frag2;
        }
        else if (i == 2) {
            if (frag3 == null) {
                frag3 = new FragmentThree();
            }
            fragment = frag3;
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
