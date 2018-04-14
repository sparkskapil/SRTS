package www.SRTS.in;


import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Collections;


/**
 * A simple {@link Fragment} subclass.
 */
public class BookingFragment extends Fragment {
    ArrayList myDataset;
    RecyclerView recyclerView;
    MyAdapter adapter;
    public BookingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_booking, container, false);

        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerBookings);
        recyclerView.setHasFixedSize(true);

        myDataset = new ArrayList<Ticket>();

        adapter = new MyAdapter(myDataset,rootView.getContext());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(rootView.getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        final DatabaseReference database = FirebaseDatabase.getInstance().getReference().child("Users").child(firebaseAuth.getUid()).child("Bookings");
        database.addValueEventListener(
                new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        myDataset.clear();
                        for (DataSnapshot postSnapshot: dataSnapshot.getChildren()) {
                            Ticket ticket = postSnapshot.getValue(Ticket.class);
                            if(( System.currentTimeMillis()/3600000.0 - ticket.getHours() ) > 1 && ticket.getStatus().equals("VALID")){
                                ticket.setStatus("INVALID");
                                String Key = postSnapshot.getKey();
                                database.child(Key).child("status").setValue("INVALID");
                            }
                            myDataset.add(ticket);
                        }
                        Collections.reverse(myDataset);
                        adapter.notifyDataSetChanged();

                    }
                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                    }
                });

        return rootView;
    }

}
