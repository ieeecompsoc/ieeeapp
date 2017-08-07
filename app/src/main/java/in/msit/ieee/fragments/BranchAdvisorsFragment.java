package in.msit.ieee.fragments;


import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
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
public class BranchAdvisorsFragment extends Fragment {


    public BranchAdvisorsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.page_branch_advisors, container, false);

        ButterKnife.bind(this, view);

        return view;
    }

    @OnClick(R.id.gmail1)
    public void gmail1() {
        openGmail("sitender@msit.in");
    }

    @OnClick(R.id.gmail2)
    public void gmail2() {
        openGmail("savita.ahlawat@gmail.com");
    }

    @OnClick(R.id.gmail3)
    public void gmail3() {
        openGmail("parveen@msit.in");
    }

    @OnClick(R.id.gmail4)
    public void gmail4() {
        openGmail("jyotijain_in@yahoo.com");
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
}
