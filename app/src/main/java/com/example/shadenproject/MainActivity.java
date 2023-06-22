package com.example.shadenproject;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button button;
    Spinner spinner, spinner1;
RecyclerView recyclerView;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//button=findViewById(R.id.button);
       // spinner=findViewById(R.id.spinner)int i = 0; i<captions.length;i++){
//                captions[i] = Course.course[i].getCourseName();
//                ids[i] = Course.course[i].getPhoto();
//            }
//            recycler.setLayoutManager(new LinearLayoutManager(this));
//            CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(captions, ids);
//            recycler.setAdapter(adapter);
        }


//
//
//
//    }
public void btnonshow (View view){

    RecyclerView recycler = findViewById(R.id.recyvlr);

    String[] captions = new String[Course.course.length];
    int[] ids = new int[Course.course.length];

    for(int i = 0; i<captions.length;i++){
        captions[i] = Course.course[i].getCourseName();
        ids[i] = Course.course[i].getPhoto();
    }
    recycler.setLayoutManager(new LinearLayoutManager(this));
    CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(captions, ids);
    recycler.setAdapter(adapter);
}
    public void btnonshow1(View view){
        RecyclerView recycler = findViewById(R.id.recyvlr);

        String[] captions = new String[Course.course1.length];
        int[] ids = new int[Course.course1.length];

        for(int i = 0; i<captions.length;i++){
            captions[i] = Course.course1[i].getCourseName();
            ids[i] = Course.course1[i].getPhoto();
        }
        recycler.setLayoutManager(new LinearLayoutManager(this));
        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(captions, ids);
        recycler.setAdapter(adapter);

    }



}