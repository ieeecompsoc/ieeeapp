package in.msit.ieee.fragments;


import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import in.msit.ieee.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ExecutiveCommitteeFragment extends Fragment {

    public ExecutiveCommitteeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View  view = inflater.inflate(R.layout.page_executive_committee, container, false);

        ButterKnife.bind(this, view);

        return view;
    }

    @OnClick(R.id.gmail1)
    public void gmail1() {
        openGmail("ayush.g.girdhar@ieee.org");
    }

    @OnClick(R.id.fb1)
    public void fb1() {
        openFaceBook("https://www.facebook.com/ayush.girdhar");
    }

    @OnClick(R.id.in1)
    public void in1() {
        openLinkedIn("https://www.linkedin.com/in/ayushgirdhar");
    }


    @OnClick(R.id.gmail2)
    public void gmail2() {
     openGmail("nakuladhikari.in.96@ieee.org");
    }

    @OnClick(R.id.fb2)
    public void fb2() {
     openFaceBook("https://www.facebook.com/nakul.adhikari.96");
    }

    @OnClick(R.id.in2)
    public void in2() {
        openLinkedIn("https://www.linkedin.com/in/nakul-adhikari-765b50104");
    }


    @OnClick(R.id.gmail3)
    public void gmail3() {
     openGmail("sarthakagarwal22@gmail.com");
    }

    @OnClick(R.id.fb3)
    public void fb3() {
        openFaceBook("https://www.facebook.com/sarthakagarwal22");
    }

    @OnClick(R.id.in3)
    public void in3() {
     openLinkedIn("https://www.linkedin.com/in/sarthakagarwal22");
    }


    @OnClick(R.id.gmail4)
    public void gmail4() {
      openGmail("rashikamann01@gmail.com");
    }

    @OnClick(R.id.fb4)
    public void fb4() {
        Toast.makeText(getContext(), "Not available at the moment!", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.in4)
    public void in4() {
      openLinkedIn("https://www.linkedin.com/in/rashika-mann-156235142/");
    }


    @OnClick(R.id.gmail5)
    public void gmail5() {
       openGmail("rishabh2408@gmail.com");
    }

    @OnClick(R.id.fb5)
    public void fb5() {
      openFaceBook("https://www.facebook.com/rishabh.jain.10485546");
    }

    @OnClick(R.id.in5)
    public void in5() {
      openLinkedIn("https://www.facebook.com/rishabh.jain.10485546");
    }


    @OnClick(R.id.gmail6)
    public void gmail6() {
        openGmail("21aashish.ieeemsit@gmail.com");
    }

    @OnClick(R.id.fb6)
    public void fb6() {
        openFaceBook("https://www.facebook.com/aashish.kapoor.50999");
    }

    @OnClick(R.id.in6)
    public void in6() {
        Toast.makeText(getContext(), "Not available at the moment!", Toast.LENGTH_SHORT).show();
    }


    @OnClick(R.id.gmail7)
    public void gmail7() {
        openGmail("ayushmakkar174@gmail.com");
    }

    @OnClick(R.id.fb7)
    public void fb7() {
        openFaceBook("https://www.facebook.com/ayush.makkar.50");
    }

    @OnClick(R.id.in7)
    public void in7() {
        Toast.makeText(getContext(), "Not available at the moment!", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.gmail8)
    public void gmail8() {
        openGmail("shivamsehgal019@gmail.com");
    }

    @OnClick(R.id.fb8)
    public void fb8() {
        openFaceBook("https://www.facebook.com/shivam.sehgal.19");
    }

    @OnClick(R.id.in8)
    public void in8() {
        openLinkedIn("https://www.linkedin.com/in/shivam-sehgal-13a11813a");
    }


    @OnClick(R.id.gmail9)
    public void gmail9() {
        openGmail("kshtjtomar40@gmail.com");
    }

    @OnClick(R.id.fb9)
    public void fb9() {
        openFaceBook("https://www.facebook.com/kshitij.tomar.14");
    }

    @OnClick(R.id.in9)
    public void in9() {
        openLinkedIn("https://www.linkedin.com/in/kshitij-tomar");
    }

    private void openGmail(String email) {
        Toast.makeText(getContext(), "Opening Gmail...", Toast.LENGTH_SHORT).show();
        Intent sendIntent = new Intent(android.content.Intent.ACTION_SEND);
        sendIntent.setType("text/plain");
        sendIntent.putExtra(Intent.EXTRA_EMAIL, new String[] { email });
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
}
