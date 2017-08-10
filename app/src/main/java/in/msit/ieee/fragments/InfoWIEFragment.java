package in.msit.ieee.fragments;


import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import in.msit.ieee.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class InfoWIEFragment extends Fragment {


    @BindView(R.id.q1h)
    TextView q1h;
    @BindView(R.id.q2h)
    TextView q2h;
    @BindView(R.id.q3h)
    TextView q3h;
    @BindView(R.id.q8h)
    TextView q8h;

    @BindView(R.id.a1h)
    TextView a1h;
    @BindView(R.id.a2h)
    TextView a2h;
    @BindView(R.id.a3h)
    TextView a3h;
    @BindView(R.id.a4h)
    LinearLayout a4h;
    @BindView(R.id.a5h)
    TextView a5h;
    @BindView(R.id.a6h)
    TextView a6h;
    @BindView(R.id.a7h)
    TextView a7h;
    @BindView(R.id.a8h)
    TextView a8h;

    public InfoWIEFragment() {
        // Required empty public constructor
    }

    @OnClick(R.id.q1header)
    public void showa1() {
        visibilityToggler(R.id.a1h);
    }

    @OnClick(R.id.q2header)
    public void showa2() {
        visibilityToggler(R.id.a2h);
    }

    @OnClick(R.id.q3header)
    public void showa3() {
        visibilityToggler(R.id.a3h);
    }

    @OnClick(R.id.q4header)
    public void showa4() {
        visibilityToggler(R.id.a4h);
    }

    @OnClick(R.id.q5header)
    public void showa5() {
        visibilityToggler(R.id.a5h);
    }

    @OnClick(R.id.q6header)
    public void showa6() {
        visibilityToggler(R.id.a6h);
    }

    @OnClick(R.id.q7header)
    public void showa7() {
        visibilityToggler(R.id.a7h);
    }

    @OnClick(R.id.q8header)
    public void showa8() {
        visibilityToggler(R.id.a8h);
    }


    public void visibilityToggler(int id) {

        switch (id) {
            case R.id.a1h: {
                if (a1h.getVisibility() == View.GONE) {
                    a1h.setVisibility(View.VISIBLE);
                } else {
                    a1h.setVisibility(View.GONE);
                }
                a2h.setVisibility(View.GONE);
                a3h.setVisibility(View.GONE);
                a4h.setVisibility(View.GONE);
                a5h.setVisibility(View.GONE);
                a6h.setVisibility(View.GONE);
                a7h.setVisibility(View.GONE);
                a8h.setVisibility(View.GONE);
                break;
            }
            case R.id.a2h: {
                if (a2h.getVisibility() == View.GONE) {
                    a2h.setVisibility(View.VISIBLE);
                } else {
                    a2h.setVisibility(View.GONE);
                }
                a1h.setVisibility(View.GONE);
                a3h.setVisibility(View.GONE);
                a4h.setVisibility(View.GONE);
                a5h.setVisibility(View.GONE);
                a6h.setVisibility(View.GONE);
                a7h.setVisibility(View.GONE);
                a8h.setVisibility(View.GONE);
                break;
            }
            case R.id.a3h: {
                if (a3h.getVisibility() == View.GONE) {
                    a3h.setVisibility(View.VISIBLE);
                } else {
                    a3h.setVisibility(View.GONE);
                }
                a1h.setVisibility(View.GONE);
                a2h.setVisibility(View.GONE);
                a4h.setVisibility(View.GONE);
                a5h.setVisibility(View.GONE);
                a6h.setVisibility(View.GONE);
                a7h.setVisibility(View.GONE);
                a8h.setVisibility(View.GONE);
                break;
            }
            case R.id.a4h: {
                if (a4h.getVisibility() == View.GONE) {
                    a4h.setVisibility(View.VISIBLE);
                } else {
                    a4h.setVisibility(View.GONE);
                }
                a1h.setVisibility(View.GONE);
                a2h.setVisibility(View.GONE);
                a3h.setVisibility(View.GONE);
                a5h.setVisibility(View.GONE);
                a6h.setVisibility(View.GONE);
                a7h.setVisibility(View.GONE);
                a8h.setVisibility(View.GONE);
                break;
            }
            case R.id.a5h: {
                if (a5h.getVisibility() == View.GONE) {
                    a5h.setVisibility(View.VISIBLE);
                } else {
                    a5h.setVisibility(View.GONE);
                }
                a1h.setVisibility(View.GONE);
                a2h.setVisibility(View.GONE);
                a3h.setVisibility(View.GONE);
                a4h.setVisibility(View.GONE);
                a6h.setVisibility(View.GONE);
                a7h.setVisibility(View.GONE);
                a8h.setVisibility(View.GONE);
                break;
            }
            case R.id.a6h: {
                if (a6h.getVisibility() == View.GONE) {
                    a6h.setVisibility(View.VISIBLE);
                } else {
                    a6h.setVisibility(View.GONE);
                }
                a1h.setVisibility(View.GONE);
                a2h.setVisibility(View.GONE);
                a3h.setVisibility(View.GONE);
                a4h.setVisibility(View.GONE);
                a5h.setVisibility(View.GONE);
                a7h.setVisibility(View.GONE);
                a8h.setVisibility(View.GONE);
                break;
            }
            case R.id.a7h: {
                if (a7h.getVisibility() == View.GONE) {
                    a7h.setVisibility(View.VISIBLE);
                } else {
                    a7h.setVisibility(View.GONE);
                }
                a1h.setVisibility(View.GONE);
                a2h.setVisibility(View.GONE);
                a3h.setVisibility(View.GONE);
                a4h.setVisibility(View.GONE);
                a5h.setVisibility(View.GONE);
                a6h.setVisibility(View.GONE);
                a8h.setVisibility(View.GONE);
                break;
            }
            case R.id.a8h: {
                if (a8h.getVisibility() == View.GONE) {
                    a8h.setVisibility(View.VISIBLE);
                } else {
                    a8h.setVisibility(View.GONE);
                }
                a1h.setVisibility(View.GONE);
                a2h.setVisibility(View.GONE);
                a3h.setVisibility(View.GONE);
                a4h.setVisibility(View.GONE);
                a5h.setVisibility(View.GONE);
                a6h.setVisibility(View.GONE);
                a7h.setVisibility(View.GONE);
                break;
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.info_content_wie, container, false);

        //todo show a spinner

        ButterKnife.bind(this, view);

        setData();

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //todo hide the spinner
    }

    @OnClick(R.id.gmail1)
    public void gmail1() {
        openGmail("deepalijn27@gmail.com");
    }

    @OnClick(R.id.fb1)
    public void fb1() {
        openFaceBook("https://www.facebook.com/deepali.jain.9231");
    }

    @OnClick(R.id.in1)
    public void in1() {
        openLinkedIn("https://www.linkedin.com/in/deepali-jain/");
    }


    @OnClick(R.id.gmail2)
    public void gmail2() {
        openGmail("shubhiakansha96@gmail.com");
    }

    @OnClick(R.id.fb2)
    public void fb2() {
        openFaceBook("https://m.facebook.com/akansha.agnihotri.9?ref=bookmarks");
    }

    @OnClick(R.id.in2)
    public void in2() {
        Toast.makeText(getContext(), "Not available at the moment!", Toast.LENGTH_SHORT).show();
    }


    @OnClick(R.id.gmail3)
    public void gmail3() {
        openGmail("dishamendiratta@gmail.com");
    }

    @OnClick(R.id.fb3)
    public void fb3() {
        openFaceBook("https://www.facebook.com/disha.mendiratta.5");
    }

    @OnClick(R.id.in3)
    public void in3() {
        Toast.makeText(getContext(), "Not available at the moment!", Toast.LENGTH_SHORT).show();
    }

    private void openGmail(String email) {
        Toast.makeText(getContext(), "Opening Gmail...", Toast.LENGTH_SHORT).show();
        Intent sendIntent = new Intent(android.content.Intent.ACTION_SEND);
        sendIntent.setType("text/plain");
        sendIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{email});
        final PackageManager pm = getActivity().getPackageManager();
        final List<ResolveInfo> matches = pm.queryIntentActivities(sendIntent, 0);
        ResolveInfo best = null;
        for (final ResolveInfo info : matches) {
            if (info.activityInfo.packageName.endsWith(".gm") || info.activityInfo.name.toLowerCase().contains("gmail")) {
                best = info;
            }
        }
        if (best != null)
            sendIntent.setClassName(best.activityInfo.packageName, best.activityInfo.name);

        startActivity(sendIntent);
    }

    private void openFaceBook(String fburl) {
        Toast.makeText(getContext(), "Opening Facebook...", Toast.LENGTH_SHORT).show();
        Uri uri = Uri.parse(fburl);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void openLinkedIn(String inurl) {
        Toast.makeText(getContext(), "Opening LinkedIn...", Toast.LENGTH_SHORT).show();
        Uri uri = Uri.parse(inurl);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void setData() {
        q1h.setText(getString(R.string.q1, "WIE"));
        a1h.setText(Html.fromHtml(getString(R.string.a1wie)));

        q2h.setText(getString(R.string.q2, "WIE"));
        a2h.setText(Html.fromHtml(getString(R.string.a2wie)));

        q3h.setText(getString(R.string.q3, "WIE"));
        a3h.setText(Html.fromHtml(getString(R.string.a3wie)));
        a7h.setText(Html.fromHtml(getString(R.string.a7wie)));

        q8h.setText(getString(R.string.q8, "WIE"));
    }
}
