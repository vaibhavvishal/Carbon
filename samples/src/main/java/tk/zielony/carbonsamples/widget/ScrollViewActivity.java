package tk.zielony.carbonsamples.widget;

import tk.zielony.carbonsamples.SamplesActivity;
import android.os.Bundle;

import carbon.widget.ScrollView;
import tk.zielony.carbonsamples.R;

/**
 * Created by Marcin on 2015-05-16.
 */
public class ScrollViewActivity extends SamplesActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrollview);

        ScrollView scrollView = (ScrollView) findViewById(R.id.scrollView);
        scrollView.setHeader(R.layout.header_scrollview);
    }
}
