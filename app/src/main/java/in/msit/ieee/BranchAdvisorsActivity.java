package in.msit.ieee;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import java.util.ArrayList;

/**
 * Created by Akanksha Jolly on 24-06-2017.
 */

public class BranchAdvisorsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_item);

        final ArrayList<BranchAdvisors> branchAdvisors = new ArrayList<BranchAdvisors>();

        branchAdvisors.add(new BranchAdvisors(R.drawable.ieee_msit,"Mr. Sitender","Branch Counselor, IEEE MSIT","sitender@msit.in"));
        branchAdvisors.add(new BranchAdvisors(R.drawable.ieee_msit,"Ms. Savita Ahlawat","Chapter Advisor, IEEE CS MSIT","savita.ahlawat@gmail.com"));
        branchAdvisors.add(new BranchAdvisors(R.drawable.ieee_msit,"Mr. Parveen Kumar","Chapter Advisor, IEEE MTT-S MSIT","parveen@msit.in"));
        branchAdvisors.add(new BranchAdvisors(R.drawable.ieee_msit,"Ms. Jyoti Jain","Chapter Advisor, IEEE PES MSIT","jyotijain_in@yahoo.com"));

        BranchAdvisorsAdapter branchAdvisorsAdapter= new BranchAdvisorsAdapter(this,branchAdvisors);

        GridView branchAdvisorsGridView = (GridView) findViewById(R.id.grid);

        branchAdvisorsGridView.setAdapter(branchAdvisorsAdapter);
    }
}
