package cl.bastian.srinkquizz.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import cl.bastian.srinkquizz.views.CoolFragment;
import cl.bastian.srinkquizz.views.LuckyFragment;
import cl.bastian.srinkquizz.views.MatchFragment;
import cl.bastian.srinkquizz.R;

/**
 * Created by santo_000 on 19-10-2016.
 */

public class PagerAdapter extends FragmentPagerAdapter{

    private Context context;

    public PagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return CoolFragment.newInstance();
            case 1:
                return LuckyFragment.newInstance();
            case 2:
                return MatchFragment.newInstance();
            default:
                return CoolFragment.newInstance();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getString(R.string.Cool_Title);
            case 1:
                return context.getString(R.string.Lucky_Title);
            case 2:
                return context.getString(R.string.Match_Title);
            default:
                return context.getString(R.string.Cool_Title);
        }

    }

    @Override
    public int getCount() {
        return 3;
    }
}
