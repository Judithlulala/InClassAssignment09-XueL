package com.example.myapplication;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    private TextView displayText;
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference animalRef = database.getReference("Animal");
    private DatabaseReference animalsRef = database.getReference("Animals");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayText =findViewById(R.id.displayContent);
        animalRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
              Animal a1 = dataSnapshot.getValue(Animal.class);
                if (a1 != null){
                displayText.setText(a1.toString());}
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(MainActivity.this, "Error loading Firebase",Toast.LENGTH_SHORT).show();

            }
        });
    }

    public void AddAnimal(View view) {
        animalsRef.push().setValue(new Animal("tiger", 4, "Tigers are strong", true));
    }

    public void SetAnimal(View view) {
        animalRef.setValue(new Animal("Piggy", 4, "Pigs love thinking.", true));

    }

}




