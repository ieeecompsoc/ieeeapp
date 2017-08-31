package in.msit.ieee.fragments;


import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.OnClick;
import in.msit.ieee.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AndroidTeamFragment extends Fragment {


    public AndroidTeamFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View  view = inflater.inflate(R.layout.page_android_team, container, false);

        ButterKnife.bind(this, view);

        return view;
    }

    @OnClick(R.id.gmail1)
    public void gmail1() {
        openGmail("aayush.ranaut@gmail.com");
    }

    @OnClick(R.id.fb1)
    public void fb1() {
        Toast.makeText(getContext(), "Not available at the moment!", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.in1)
    public void in1() {
        openLinkedIn("https://linkedin.com/in/PrathmeshRanaut");
    }

    @OnClick(R.id.gmail2)
    public void gmail2() {
        openGmail("shivam.ras304@gmail.com");
    }

    @OnClick(R.id.fb2)
    public void fb2() {
        openFaceBook("https://www.facebook.com/shivamras304");
    }

    @OnClick(R.id.in2)
    public void in2() {
        openLinkedIn("https://www.linkedin.com/in/shivamras304");
    }


    @OnClick(R.id.gmail3)
    public void gmail3() {
        openGmail("akankshajolly97@gmail.com");
    }

    @OnClick(R.id.fb3)
    public void fb3() {
        Toast.makeText(getContext(), "Not available at the moment!", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.in3)
    public void in3() {
        openLinkedIn("https://www.linkedin.com/in/akanksha-jolly-b811a7138");
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
