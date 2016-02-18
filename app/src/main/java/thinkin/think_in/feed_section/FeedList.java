package thinkin.think_in.feed_section;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import thinkin.think_in.R;
import thinkin.think_in.forum_section.ForumAdapter;

public class FeedList extends AppCompatActivity {
    private RecyclerView feedRecycler;
    private RecyclerView.Adapter feedAdapter;
    private RecyclerView.LayoutManager feedLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feed_list);
        feedRecycler = (RecyclerView)findViewById(R.id.feed_recycler_view);
        feedRecycler.setHasFixedSize(true);

        feedLayout = new LinearLayoutManager(this);
        feedRecycler.setLayoutManager(feedLayout);

        feedAdapter= new FeedAdapter();
        feedRecycler.setAdapter(feedAdapter);
    }
}
