package ly.generalassemb.drewmahrt.userinfotabs;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("Photo"));
        tabLayout.addTab(tabLayout.newTab().setText("About Me"));
        tabLayout.addTab(tabLayout.newTab().setText("Contact"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);


        PhotoFragment newFragment = new PhotoFragment();
        Bundle args = new Bundle();
        //  args.putInt(PhotoFragment.newInstance(), tabLayout);
        newFragment.setArguments(args);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        // ft.replace(R.id.tab_layout,newFragment);
        // ft.addToBackStack(null);
        // ft.commit();

        PhotoFragment photo = new PhotoFragment();
        Bundle photoBundle = new Bundle();
        String photoName = getResources().getString(R.string.photo_text);
        photoBundle.putString("PHOTO", photoName);
        photo.setArguments(photoBundle);
        ft.add(R.id.tab_layout,photo);
        ft.commit();

        FragmentTransaction ftx = fm.beginTransaction();
        InfoFragment info = new InfoFragment();
        Bundle infoBundle = new Bundle();
        String infoName = getResources().getString(R.string.info_text);
        infoBundle.putString("INFO", infoName);
        info.setArguments(photoBundle);
        ftx.add(R.id.tab_layout,info);
        ftx.commit();

        FragmentTransaction ftz = fm.beginTransaction();
        ContactFragment contact = new ContactFragment();
        Bundle contactBundle = new Bundle();
        String contactName = getResources().getString(R.string.contact);
        contactBundle.putString("INFO", contactName);
        contact.setArguments(contactBundle);
        ftz.add(R.id.tab_layout,contact);
        ftz.commit();


        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        final PagerAdapter adapter = new PagerAdapter
                (getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
//                PhotoFragment photoFrag = (PhotoFragment);
//                InfoFragment infoFrag = (InfoFragment);
//                ContactFragment contactFrag = (ContactFragment);
//                getSupportFragmentManager().findFragmentById(R.id.pager);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }   //end braces for onCreate method is here :)
}
