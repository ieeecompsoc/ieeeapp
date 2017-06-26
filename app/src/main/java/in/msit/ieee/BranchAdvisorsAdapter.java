package in.msit.ieee;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Akanksha Jolly on 24-06-2017.
 */

public class BranchAdvisorsAdapter extends ArrayAdapter<BranchAdvisors> {
    public BranchAdvisorsAdapter(Activity context, ArrayList<BranchAdvisors> branchAdvisors) {
        super(context, 0, branchAdvisors);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.branch_advisors, parent, false);
        }

        BranchAdvisors currentBranchAdvisors= getItem(position);

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.branch_advisors_image);
        iconView.setImageResource(currentBranchAdvisors.getImageResourceId());

        TextView NameTextView = (TextView) listItemView.findViewById(R.id.branch_advisors_name);
        NameTextView.setText(currentBranchAdvisors.getBranchAdvisorName());

        TextView PostTextView = (TextView) listItemView.findViewById(R.id.branch_advisors_post);
        PostTextView.setText(currentBranchAdvisors.getBranchAdvisorPost());

        TextView EmailTextView = (TextView) listItemView.findViewById(R.id.branch_advisors_email);
        EmailTextView.setText(currentBranchAdvisors.getBranchAdvisorEmail());


        return listItemView;
    }
}
