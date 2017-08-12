package in.msit.ieee;

import java.util.Comparator;

/**
 * Created by shivam on 8/12/17.
 */

public class Event {
    public String eName;
    public String eVenue;
    public String eDescription;
    public long eTimestamp;

    public Event() {

    }
    public Event(String name, String venue, String desc, long time) {
        this.eName = name;
        this.eVenue = venue;
        this.eDescription = desc;
        this.eTimestamp = time;
    }

    public static Comparator<Event> EventTimeStamp = new Comparator<Event>() {

        public int compare(Event e1, Event e2) {

             return (int) (e1.eTimestamp-e2.eTimestamp);
        }
    };
}
