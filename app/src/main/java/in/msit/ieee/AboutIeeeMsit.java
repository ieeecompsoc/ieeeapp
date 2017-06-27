package in.msit.ieee;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Akanksha Jolly on 24-06-2017.
 */

public class AboutIeeeMsit extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_ieee_msit);

        TextView textView= (TextView) findViewById(R.id.about_ieee_msit);
        textView.setText("It was the onset of the year 2009. IEEE, USA was celebrating its 125th anniversary. Thousands of miles away, a new student branch was being formed with a mere strength of around 30 members. Without any guidance or previous experience, the Branch Counselor and her ExeCom were struggling hard to give this student branch an orientation and structure. After one year, the student branch was termed as the fastest upcoming branches in the entire Delhi Section, while the branch counselor received the rare honour of “Best Branch Counselor of an Upcoming Branch” at the Annual General Meeting of IEEE, Delhi Section. Yes, the branch is none other than our own college, i.e. Maharaja Surajmal Institute Of Technology.\n" +
                "\n" +
                "The student branch of MSIT was registered with IEEE, USA in March, 2009 and it marked the beginning of the journey of IEEE, MSIT onto the path of constant upgradations and developments. The reins of this newly formed branch were given in the capable hands of Ms. Suman Mann, Reader, IT Department and she assumed the responsibility of Branch Counselor, IEEE, MSIT.\n" +
                "\n" +
                "Many seminars and workshops were organized by the IEEE Student Branch in its endeavor. These included a workshop by Mr. Ankit Mittal on Basic Robotics & Autonomous Robots, which was held in collaboration with IEEE, Delhi Section. Similarly, a 2-day workshop on Wireless/Autonomous Robotics, I-MANIA, was organized at the campus in collaboration with OSUM-MSIT.Both the events were a huge success. By the year end, an IEEE awareness seminar was held with guest speakers from IEEE, DTU (formerly DCE).It helped create awareness among the students about the benefits of joining IEEE and helped in the rise in number of memberships in the present academic year.\n" +
                "\n" +
                "IEEE-MSIT is gradually becoming a name which engineers of various institutes have started to recognize. As Robert Frost once said… “Miles to go before I sleep, Miles to go before I sleep.”");
    }


}
