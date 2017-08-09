package in.msit.ieee.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import in.msit.ieee.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class InfoICSFragment extends Fragment {


    public InfoICSFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.info_content_ics, container, false);
    }

}
