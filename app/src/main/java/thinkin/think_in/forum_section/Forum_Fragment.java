package thinkin.think_in.forum_section;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import thinkin.think_in.R;

/**
 * Created by Gourav Beura on 11-01-2016.
 */
public class Forum_Fragment extends Fragment {
    private RecyclerView forumRecycler;
    private RecyclerView.Adapter forumAdapter;
    private RecyclerView.LayoutManager forumLayout;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.fragment_forum,container,false);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        forumRecycler = (RecyclerView)getActivity().findViewById(R.id.forum_recycler_view);
        forumRecycler.setHasFixedSize(true);

        forumLayout = new LinearLayoutManager(getActivity());
        forumRecycler.setLayoutManager(forumLayout);

        forumAdapter= new ForumAdapter();
        forumRecycler.setAdapter(forumAdapter);

    }
}
