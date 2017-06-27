package in.msit.ieee;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Akanksha Jolly on 23-06-2017.
 */

public class ContactUsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        final ArrayList<Contact> contacts = new ArrayList<Contact>();
        contacts.add(new Contact("IEEE MSIT Student Branch","ieee@msit.in"));
        contacts.add(new Contact("IEEE CS MSIT SBC","ieeecs@msit.in"));
        contacts.add(new Contact("IEEE MTT-S MSIT SBC","ieeemtts@msit.in"));
        contacts.add(new Contact("IEEE PES MSIT SBC","ieeepes@msit.in"));
        contacts.add(new Contact("IEEE WIE MSIT SBC","ieeewie@msit.in"));

        ContactAdapter contactsAdapter= new ContactAdapter(this,contacts);

        ListView contactsListView = (ListView) findViewById(R.id.list);

        contactsListView.setAdapter(contactsAdapter);
    }
}
