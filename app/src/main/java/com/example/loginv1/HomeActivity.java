package com.example.loginv1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class HomeActivity extends AppCompatActivity {
        String booklsit[]={"21 Lessons for the 21st Century","Reminders of Him","Solo Leveling","It starts with us","The maid","Im glad my mom died","Atomic habits","Ugly love","Lessons in chemiy","The light we carry"};
        int book_pics[] = {R.drawable.lessonsforthecentury,R.drawable.remindersofhim,R.drawable.sololevling,R.drawable.itstartswithus,R.drawable.themaid,R.drawable.booksata,R.drawable.booksab,R.drawable.booktmanya,R.drawable.booktas,R.drawable.bookchra};

        ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        listView = (ListView) findViewById(R.id.customlistview);
        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(getApplicationContext(),booklsit, book_pics);
        listView.setAdapter(customBaseAdapter);

    }
}