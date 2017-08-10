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
public class InfoPESFragment extends Fragment {


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

    public InfoPESFragment() {
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
        View view = inflater.inflate(R.layout.info_content_pes, container, false);

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
        openGmail("shayari.bhattacharjee.IN@ieee.org");
    }

    @OnClick(R.id.fb1)
    public void fb1() {
        openFaceBook("https://www.facebook.com/shayari.bhattacharjee");
    }

    @OnClick(R.id.in1)
    public void in1() {
        openLinkedIn("https://www.linkedin.com/in/shayari-bhattacharjee-2bb831114/");
    }


    @OnClick(R.id.gmail2)
    public void gmail2() {
        openGmail("saouvik01@gmail.com");
    }

    @OnClick(R.id.fb2)
    public void fb2() {
        openFaceBook("https://www.facebook.com/saouvik01");
    }

    @OnClick(R.id.in2)
    public void in2() {
        openLinkedIn("https://www.linkedin.com/in/souvik-banerjee-66533153");
    }


    @OnClick(R.id.gmail3)
    public void gmail3() {
        openGmail("sehrawat.devansh@ieee.org");
    }

    @OnClick(R.id.fb3)
    public void fb3() {
        openFaceBook("https://www.facebook.com/Devansh.sehrawat");
    }

    @OnClick(R.id.in3)
    public void in3() {
        openLinkedIn("https://www.linkedin.com/in/devansh-sehrawat-5aa415118/");
    }


    @OnClick(R.id.gmail4)
    public void gmail4() {
        openGmail("vamika96rastogi@gmail.com");
    }

    @OnClick(R.id.fb4)
    public void fb4() {
       openFaceBook(" https://www.facebook.com/vamika.rastogi");
    }

    @OnClick(R.id.in4)
    public void in4() {
        Toast.makeText(getContext(), "Not available at the moment!", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.gmail5)
    public void gmail5() {
        openGmail("avamishra28@gmail.com");
    }

    @OnClick(R.id.fb5)
    public void fb5() {
        openFaceBook("https://www.facebook.com/avantika.mishra.5249");
    }

    @OnClick(R.id.in5)
    public void in5() {
        Toast.makeText(getContext(), "Not available at the moment!", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.gmail6)
    public void gmail6() {
        openGmail("vikrantthakur97@gmail.com");
    }

    @OnClick(R.id.fb6)
    public void fb6() {
        openFaceBook("https://www.facebook.com/vikrant.thakur.792");
    }

    @OnClick(R.id.in6)
    public void in6() {
        openLinkedIn("https://www.linkedin.com/in/vikrant-thakur-b5125112a");
    }

    @OnClick(R.id.gmail7)
    public void gmail7() {
        openGmail("garimasaluja160@gmail.com");
    }

    @OnClick(R.id.fb7)
    public void fb7() {
        openFaceBook("https://www.facebook.com/profile.php?id=100013171007540");
    }

    @OnClick(R.id.in7)
    public void in7() {
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
        q1h.setText(getString(R.string.q1, "PES"));
        a1h.setText(Html.fromHtml(getString(R.string.a1pes)));

        q2h.setText(getString(R.string.q2, "PES"));
        a2h.setText(Html.fromHtml(getString(R.string.a2pes)));

        q3h.setText(getString(R.string.q3, "PES"));
        a3h.setText(Html.fromHtml(getString(R.string.a3pes)));
//        a3h.setMovementMethod(LinkMovementMethod.getInstance());
        a5h.setText(Html.fromHtml(getString(R.string.a5pes)));
        a6h.setText(Html.fromHtml(getString(R.string.a6pes)));
        a7h.setText(Html.fromHtml(getString(R.string.a7pes)));

        q8h.setText(getString(R.string.q8, "PES"));
        a8h.setText(Html.fromHtml(getString(R.string.a8pes)));
    }

}
