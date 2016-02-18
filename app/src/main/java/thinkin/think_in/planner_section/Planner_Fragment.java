package thinkin.think_in.planner_section;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import thinkin.think_in.R;

/**
 * Created by Gourav Beura on 11-01-2016.
 */
public class Planner_Fragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_planner,container,false);
        return v;
    }
}