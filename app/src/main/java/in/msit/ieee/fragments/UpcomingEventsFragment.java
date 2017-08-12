package in.msit.ieee.fragments;


import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import in.msit.ieee.Event;
import in.msit.ieee.EventsAdapter;
import in.msit.ieee.R;
import in.msit.ieee.NonScrollableRecyclerViewEmptyViewSupport;

/**
 * A simple {@link Fragment} subclass.
 */
public class UpcomingEventsFragment extends Fragment {

    @BindView(R.id.blank_message_view)
    ProgressBar blankMessageView;

    @BindView(R.id.recyler_view)
    NonScrollableRecyclerViewEmptyViewSupport recyclerView;

    @BindView(R.id.page_container)
    CoordinatorLayout pageContainer;

    private EventsAdapter adapter;
    private DatabaseReference eventsRef;

    public UpcomingEventsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.page_upcoming_events, container, false);

        ButterKnife.bind(this, view);

        recyclerView.setAdapter(null);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setEmptyView(blankMessageView);
        recyclerView.setNestedScrollingEnabled(false);

        if(!isNetworkAvailable()) {
            networkSnackBar();
        }

        eventsRef = FirebaseDatabase.getInstance().getReference().child("events");
        eventsRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                ArrayList<Event> list = new ArrayList<>();
                for(DataSnapshot eventSnapshot: dataSnapshot.getChildren()) {
                    Event event = new Event(
                            eventSnapshot.child("name").getValue(String.class),
                            eventSnapshot.child("venue").getValue(String.class),
                            eventSnapshot.child("description").getValue(String.class),
                            eventSnapshot.child("timestamp").getValue(Long.class)
                    );
                    list.add(event);
                }
                adapter = new EventsAdapter(list);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });


        return view;
    }

    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getContext().getSystemService(Context
                .CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    private void networkSnackBar() {
        Snackbar snackbar = Snackbar
                .make(pageContainer, getString(R.string.no_internet_message), Snackbar.LENGTH_LONG)
                .setAction(getString(R.string.open_settings_label), new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivityForResult(new Intent(android.provider.Settings.ACTION_SETTINGS), 0);

                    }
                });
        snackbar.show();
    }
}
