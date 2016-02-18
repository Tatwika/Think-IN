package thinkin.think_in.feed_section;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import thinkin.think_in.R;


public class Feed_Fragment extends Fragment {
    private Button btn_section,btn_branch,btn_year;
    public static final String COLOR_GREEN = "#00C800";
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_feed,container,false);
        return v;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        btn_section= (Button) getActivity().findViewById(R.id.btn_feed_section);
        btn_section.setTextColor(Color.parseColor(COLOR_GREEN));
        btn_section.requestFocus();
        btn_section.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().startActivity(new Intent(getActivity(), FeedList.class));
            }
        });

        btn_branch= (Button) getActivity().findViewById(R.id.btn_feed_branch);
        btn_branch.setTextColor(Color.parseColor(COLOR_GREEN));
        btn_branch.requestFocus();
        btn_branch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().startActivity(new Intent(getActivity(),FeedList.class));
            }
        });

        btn_year= (Button) getActivity().findViewById(R.id.btn_feed_year);
        btn_year.setTextColor(Color.parseColor(COLOR_GREEN));
        btn_year.requestFocus();
        btn_year.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().startActivity(new Intent(getActivity(),FeedList.class));
            }
        });



    }
}