package mr_auspicious.shivam_kr_shiv.com.fragments4;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.BaseAdapter;

/**
 * Created by shivam on 13-03-2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter{

    private Context mContext;

    public CategoryAdapter(Context context,FragmentManager fm){ //Constructor
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) { //getting the fragment at required position..
        if (position == 0) {
            return new BlankFragment();
        } else if (position == 1) {
            return new Fragment2();
        } else {
            return new Fragment3();
        }
    }

    @Override
    public int getCount() { //getting the total no of item..
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) { //Getting the page title
        if (position == 0) {
            return mContext.getString(R.string.category_blank_fragment);
        } else if (position == 1) {
            return mContext.getString(R.string.category_fragment_1);
        } else {
            return mContext.getString(R.string.category_fragment_2);
        }
    }
}
