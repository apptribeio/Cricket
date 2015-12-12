package io.apptribe.cricket;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.apptribe.cricket.adapter.CricketFragmentAdapter;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.cricket_image)
    ImageView cricketImage;
    @Bind(R.id.tabs)
    TabLayout tabs;
    @Bind(R.id.tab_content)
    ViewPager tabContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        CricketFragmentAdapter adapter = new CricketFragmentAdapter(getSupportFragmentManager());

        tabContent.setAdapter(adapter);
        tabs.setupWithViewPager(tabContent);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}