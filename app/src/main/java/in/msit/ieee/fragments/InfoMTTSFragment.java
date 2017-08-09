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
public class InfoMTTSFragment extends Fragment {


    public InfoMTTSFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.info_content_mtts, container, false);
    }

}
