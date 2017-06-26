package in.msit.ieee;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Akanksha Jolly on 23-06-2017.
 */

public class ContactAdapter extends ArrayAdapter<Contact> {
    public ContactAdapter(Activity context, ArrayList<Contact> contacts) {
        super(context, 0, contacts);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.contacts_list, parent, false);
        }
        Contact currentContact= getItem(position);

        TextView ContactNameTextView = (TextView) listItemView.findViewById(R.id.contact_name);
        ContactNameTextView.setText(currentContact.getContactName());

        TextView ContactEmailTextView = (TextView) listItemView.findViewById(R.id.contact_email);
        ContactEmailTextView.setText(currentContact.getContactEmailID());


        return listItemView;
    }
}
