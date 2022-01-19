package com.practice.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.practice.recyclerview.Adapters.RecAdapter;
import com.practice.recyclerview.Models.UserData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rec;
    List<UserData>userData = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        rec = findViewById(R.id.rec);
        rec.setLayoutManager(new LinearLayoutManager(this));
        RecAdapter recAdapter = new RecAdapter(this,userData);
        userData.add(new UserData("Kapil","CS Branch",R.drawable.pic));
        userData.add(new UserData("Camera","Nikon",R.drawable.camera));
        userData.add(new UserData("2021","Mar 10",R.drawable.calenderimage));

        userData.add(new UserData("Kapil","CS Branch",R.drawable.pic));
        userData.add(new UserData("Camera","Nikon",R.drawable.camera));
        userData.add(new UserData("2021","Mar 10",R.drawable.calenderimage));

        userData.add(new UserData("Kapil","CS Branch",R.drawable.pic));
        userData.add(new UserData("Camera","Nikon",R.drawable.camera));
        userData.add(new UserData("2021","Mar 10",R.drawable.calenderimage));
        userData.add(new UserData("Kapil","CS Branch",R.drawable.pic));
        userData.add(new UserData("Camera","Nikon",R.drawable.camera));
        userData.add(new UserData("2021","Mar 10",R.drawable.calenderimage));
        userData.add(new UserData("Kapil","CS Branch",R.drawable.pic));
        userData.add(new UserData("Camera","Nikon",R.drawable.camera));
        userData.add(new UserData("2021","Mar 10",R.drawable.calenderimage));
        userData.add(new UserData("Kapil","CS Branch",R.drawable.pic));
        userData.add(new UserData("Camera","Nikon",R.drawable.camera));
        userData.add(new UserData("2021","Mar 10",R.drawable.calenderimage));
        userData.add(new UserData("Kapil","CS Branch",R.drawable.pic));
        userData.add(new UserData("Camera","Nikon",R.drawable.camera));
        userData.add(new UserData("2021","Mar 10",R.drawable.calenderimage));
        userData.add(new UserData("Kapil","CS Branch",R.drawable.pic));
        userData.add(new UserData("Camera","Nikon",R.drawable.camera));
        userData.add(new UserData("2021","Mar 10",R.drawable.calenderimage));
        userData.add(new UserData("Kapil","CS Branch",R.drawable.pic));
        userData.add(new UserData("Camera","Nikon",R.drawable.camera));
        userData.add(new UserData("2021","Mar 10",R.drawable.calenderimage));
        rec.setAdapter(recAdapter);
        recAdapter.notifyDataSetChanged();
    }
}