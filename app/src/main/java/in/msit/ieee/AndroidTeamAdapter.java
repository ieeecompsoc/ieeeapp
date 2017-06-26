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
 * Created by Akanksha Jolly on 25-06-2017.
 */

public class AndroidTeamAdapter extends ArrayAdapter<AndroidTeam> {
    public AndroidTeamAdapter(Activity context, ArrayList<AndroidTeam> androidTeam) {
        super(context, 0, androidTeam);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.android_team, parent, false);
        }

        AndroidTeam currentAndroidTeam= getItem(position);

        ImageView teamIconView = (ImageView) listItemView.findViewById(R.id.android_team_image);
        teamIconView.setImageResource(currentAndroidTeam.gettImageResourceId());

        TextView teamNameTextView = (TextView) listItemView.findViewById(R.id.team_name);
        teamNameTextView.setText(currentAndroidTeam.getTeamName());


        return listItemView;
    }
}
