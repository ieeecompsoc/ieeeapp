package in.msit.ieee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView contacts = (TextView) findViewById(R.id.contacts);


// Set a click listener on that View
        contacts.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent contactsIntent = new Intent(MainActivity.this, ContactUsActivity.class);
                startActivity(contactsIntent);
            }

        });

        // Find the View that shows the ieee msit category
        TextView ieeeMsit = (TextView) findViewById(R.id.ieee_msit);

        // Set a click listener on that View
        ieeeMsit.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AboutIeeeMsitActivity}
                Intent ieeeMsitIntent = new Intent(MainActivity.this, AboutIeeeMsit.class);

                // Start the new activity
                startActivity(ieeeMsitIntent);
            }
        });

        // Find the View that shows the branch advisors category
        TextView branchAdvisors = (TextView) findViewById(R.id.branch_advisors);


        // Set a click listener on that View
        branchAdvisors.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link BranchAdvisorsActivity}
                Intent branchAdvisorsIntent = new Intent(MainActivity.this, BranchAdvisorsActivity.class);

                // Start the new activity
                startActivity(branchAdvisorsIntent);
            }
        });

        // Find the View that shows the team category
        TextView team = (TextView) findViewById(R.id.team);


        // Set a click listener on that View
        team.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the team category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AndroidTeamActivity}
                Intent teamIntent = new Intent(MainActivity.this, AndroidTeamActivity.class);

                // Start the new activity
                startActivity(teamIntent);
            }
        });


    }


}
