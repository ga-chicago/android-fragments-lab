package ly.generalassemb.drewmahrt.userinfotabs;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by drewmahrt on 2/18/16.
 */
public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                PictureFragment tab1 = new PictureFragment();
                return tab1;
            case 1:
                InfoFragment tab2 = new InfoFragment();
                return tab2;
            case 2:
                ContactFragment tab3 = new ContactFragment();
                return tab3;
            case 3:
                HobbiesFragment tab4 = new HobbiesFragment();
                return tab4;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
