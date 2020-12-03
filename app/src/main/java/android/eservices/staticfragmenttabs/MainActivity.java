package android.eservices.staticfragmenttabs;

import android.os.Bundle;
import android.widget.TextView;

import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends FragmentActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    private int currentCounter;
    private TextView counterTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currentCounter = 0;
        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.tab_viewpager);

        setupViewPagerAndTabs();

        
    }

    //TODO fill the method to get view references and initialize viewpager to display our fragments
    private void setupViewPagerAndTabs() {

        //TODO we want two fragments with layouts : fragment_one, fragment_two.
        //TODO set adapter to viewpager and handle tragment change inside
        viewPager.setAdapter(new SectionsPagerAdapter(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);
        //TabLayoutMediator tabLayoutMediator...
    }

    //TODO : increment and decrement counter, use the already provided String ressource (see strings.xml)
}
