package in.msit.ieee;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import java.util.ArrayList;

/**
 * Created by Akanksha Jolly on 25-06-2017.
 */

public class AndroidTeamActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_item);

        final ArrayList<AndroidTeam> androidTeam = new ArrayList<AndroidTeam>();
        androidTeam.add(new AndroidTeam(R.drawable.ieee_msit,"Shivam Rastogi,CSE 4th year"));
        androidTeam.add(new AndroidTeam(R.drawable.ieee_msit,"Prathmesh Ranaut,CSE 4th year"));
        androidTeam.add(new AndroidTeam(R.drawable.ieee_msit,"Deepali Jain,IT 4th year"));
        androidTeam.add(new AndroidTeam(R.drawable.ieee_msit,"Akanksha Jolly,CSE 3rd year"));
        androidTeam.add(new AndroidTeam(R.drawable.ieee_msit,"Prashant Chamoli,CSE 2nd year"));

        AndroidTeamAdapter androidTeamAdapter= new AndroidTeamAdapter(this,androidTeam);

        GridView androidTeamGridView = (GridView) findViewById(R.id.grid);

        androidTeamGridView.setAdapter(androidTeamAdapter);
    }
}