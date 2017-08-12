package in.msit.ieee;

import android.content.Context;
import android.database.Cursor;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by shivam on 8/12/17.
 */

public class EventsAdapter extends RecyclerView.Adapter<EventsAdapter.ViewHolder> {

    ArrayList<Event> eventArrayList;
    private Calendar calendar;

    public EventsAdapter(ArrayList<Event> list) {
        this.eventArrayList = list;
        calendar = Calendar.getInstance();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.event_card, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Event event = eventArrayList.get(position);
        holder.nameView.setText(event.eName);
        calendar.setTimeInMillis(event.eTimestamp);
        holder.dateView.setText(getDateString(calendar.get(Calendar.DAY_OF_MONTH), calendar.get(Calendar.MONTH), calendar.get
                (Calendar.YEAR)));
        holder.timeView.setText(getTimeString(calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE)));
        holder.venueView.setText(event.eVenue);
        holder.descView.setText(event.eDescription);
    }

    @Override
    public int getItemCount() {
        return eventArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView nameView;
        public TextView dateView;
        public TextView timeView;
        public TextView venueView;
        public TextView descView;

        public ViewHolder(View itemView) {
            super(itemView);
            nameView = itemView.findViewById(R.id.event_name);
            dateView = itemView.findViewById(R.id.event_date);
            timeView = itemView.findViewById(R.id.event_time);
            venueView = itemView.findViewById(R.id.event_venue);
            descView = itemView.findViewById(R.id.event_desc);
        }
    }

    private String getDateString(int day, int month, int year) {
        return day + " " + getMonthName(month) + ", " + year;
    }

    private String getTimeString(int hour, int mins) {

        String currentTime = "";

        String minutes;

        if (mins < 10)
            minutes = "0" + mins;
        else
            minutes = "" + mins;

        if (hour < 12)
            currentTime = hour + ":" + minutes + " AM";
        else {
            if (hour != 12)
                hour -= 12;
            currentTime = hour + ":" + minutes + " PM";
        }

        return currentTime;
    }

    private String getMonthName(int m) {
        switch (m) {
            case 0:
                return "Jan";
            case 1:
                return "Feb";
            case 2:
                return "Mar";
            case 3:
                return "Apr";
            case 4:
                return "May";
            case 5:
                return "Jun";
            case 6:
                return "Jul";
            case 7:
                return "Aug";
            case 8:
                return "Sep";
            case 9:
                return "Oct";
            case 10:
                return "Nov";
            case 11:
                return "Dec";
        }
        return null;
    }

//    public class MedicineCursorAdapter extends CursorRecyclerViewAdapter<MedicineCursorAdapter
//            .ViewHolder> {
//
//        private static Context mContext;
//        private String timeString;
//        private String ampmString;
//        private String minutes;
//        private int hour;
//        private int mins;
//        private String descString;
//        private int colorIndex;
//        private int shapeIndex;
//        private float dose;
//
//
//        public MedicineCursorAdapter(Context context, Cursor cursor) {
//            super(context, cursor);
//            mContext = context;
//        }
//
//        @Override
//        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//            View itemView = LayoutInflater.from(parent.getContext())
//                    .inflate(R.layout.recycler_view_item, parent, false);
//            ViewHolder vh = new ViewHolder(itemView);
//            return vh;
//        }
//
//        @Override
//        public void onBindViewHolder(final ViewHolder viewHolder, final Cursor cursor) {
//
//            colorIndex = cursor.getInt(MedicineColumns.COLOR_INDEX);
//            shapeIndex = cursor.getInt(MedicineColumns.SHAPE_INDEX);
//
//            viewHolder.medIcon.setImageDrawable(mContext.getResources().getDrawable(
//                    Utility.getPillDrawable(shapeIndex, colorIndex)));
//
//            generateTimeString(cursor);
//            viewHolder.medTime.setText(timeString);
//            viewHolder.medAMPM.setText(ampmString);
//
//            viewHolder.medName.setText(cursor.getString(MedicineColumns.NAME_INDEX));
//            viewHolder.medName.setTextColor(mContext.getResources().getColor(Utility.getColorText(colorIndex)));
//
//            generateDescString(cursor);
//
//            viewHolder.medDesc.setText(descString);
//
//            viewHolder.medInfoItem.setBackground(mContext.getResources().getDrawable
//                    (Utility.getColorBackground(colorIndex)));
//        }
//
//        @Override
//        public int getItemCount() {
//            return super.getItemCount();
//        }
//
//        public static class ViewHolder extends RecyclerView.ViewHolder {
//            public final ImageView medIcon;
//            public final TextView medTime;
//            public final TextView medAMPM;
//            public final TextView medName;
//            public final TextView medDesc;
//            public final LinearLayout medInfoItem;
//
//            public ViewHolder(View itemView) {
//                super(itemView);
//
//                medIcon = (ImageView) itemView.findViewById(R.id.med_icon);
//                medTime = (TextView) itemView.findViewById(R.id.med_time);
//                medAMPM = (TextView) itemView.findViewById(R.id.med_am_pm);
//                medName = (TextView) itemView.findViewById(R.id.med_name);
//                medDesc = (TextView) itemView.findViewById(R.id.med_desc);
//                medInfoItem = (LinearLayout) itemView.findViewById(R.id.medicine_info);
//            }
//        }
//
//        private void generateTimeString(Cursor cursor) {
//
//            hour = cursor.getInt(MedicineColumns.HOUR_OF_DAY_INDEX);
//            mins = cursor.getInt(MedicineColumns.MINUTES_INDEX);
//
//            if (mins < 10)
//                minutes = "0" + mins;
//            else
//                minutes = "" + mins;
//
//            if (hour < 12) {
//                ampmString = "AM";
//            } else {
//                if (hour != 12)
//                    hour -= 12;
//                ampmString = "PM";
//            }
//
//            if (hour < 10)
//                timeString = " " + hour + ":" + minutes + " ";
//            else
//                timeString = hour + ":" + minutes;
//        }
//
//        private void generateDescString(Cursor cursor) {
//
//            dose = cursor.getFloat(MedicineColumns.DOSE_INDEX);
//            if (((int) (dose * 100)) % 100 == 0)
//                descString = mContext.getString(R.string.selectedDoseStringInt, (int) dose);
//            else
//                descString = mContext.getString(R.string.selectedDoseString, dose);
//            descString += " " + cursor.getString(MedicineColumns.MESSAGE_FOOD_INDEX);
//
//
//            String freeMsg = cursor.getString(MedicineColumns.MESSAGE_FREE_INDEX);
//            if (!freeMsg.equals(""))
//                descString += ". " + freeMsg;
//        }
//
//    }
}
