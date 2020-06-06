package com.example.greenair;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseListAdapter;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class sostoianie_actual extends AppCompatActivity {
private FirebaseListAdapter<getdata> adapter;
    // Write a message to the database
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("chemicals");
    public String chem_no = "testing text";
    TextView textview;


    //myRef.setValue("Hello, World!");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sostoianie_actual);
        //dataCollection();
        textview = (TextView) findViewById(R.id.textView4);
        textview.setText(String.valueOf(chem_no));




        // Read from the database



        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);
                textview.setText(String.valueOf(value));
               // Log.d(getClass().getName(), "Value is: " + value);
               // chem_no= setText(R.id.textView4);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value

            }
        });
    }







    public void dataCollection(){
        //ListView list_chemicals = findViewById()
        adapter = new FirebaseListAdapter<getdata>(this, getdata.class, R.layout.activity_sostoianie_actual , FirebaseDatabase.getInstance().getReference()) {
            @Override
            protected void populateView(View v, getdata model, int position) {
                TextView c1, c2, c3, c4, c5, c6, c7, c8;
                c1 = v.findViewById(R.id.chemical1);
                c2 = v.findViewById(R.id.textView2);
                c3 = v.findViewById(R.id.textView3);
                c4 = v.findViewById(R.id.chemical4);
                c5 = v.findViewById(R.id.chemical5);
                c6 = v.findViewById(R.id.chemical6);
                c7 = v.findViewById(R.id.chemical7);
                c8 = v.findViewById(R.id.chemical8);

                c1.setText(model.getNo());
                c2.setText(model.getCo());
                c3.setText(model.getNo2());
                c4.setText(model.getSo2());
                c5.setText(model.getPm2());
                c6.setText(model.getPercent());

            }
        };
    }
}
