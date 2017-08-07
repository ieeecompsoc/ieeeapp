package in.msit.ieee.fragments;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import in.msit.ieee.R;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;

public class WelcomeFragment extends Fragment {

    @BindView(R.id.info_container)
    FrameLayout infoContainer;

    public WelcomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.page_welcome, container, false);

        ButterKnife.bind(this, view);

        return view;
    }


    @OnClick(R.id.join_ieee_button)
    public void joinIeee() {
        Uri uri = Uri.parse("https://goo.gl/q77xGJ");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    @OnClick(R.id.follow_fb_button)
    public void followFb() {
        Uri uri = Uri.parse("https://goo.gl/K9jTCG");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

}
