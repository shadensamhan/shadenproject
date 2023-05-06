package com.example.shadenproject;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button button;
    Spinner spinner, spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        extracted();

        itemGroup itemGroup = new itemGroup();
        List<String> c = itemGroup.getCat1();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, c);
        spinner.setAdapter(arrayAdapter);


        itemGroup itemGroup1 = new itemGroup();
        List<String> c1 = itemGroup1.getCat2();
        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, c1);
        spinner1.setAdapter(arrayAdapter1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String x = spinner.getSelectedItem().toString();
                String x1 = spinner1.getSelectedItem().toString();
                String c2 = itemGroup.getItem(x, x1);

                switch (c2) {
                    case "class1":
                        imageView.setImageResource(R.drawable.class1);
                        break;
                    case "class2":
                        imageView.setImageResource(R.drawable.class2);
                        break;
                    case "class3":
                        imageView.setImageResource(R.drawable.class3);
                        break;
                    case "class4":
                        imageView.setImageResource(R.drawable.class4);
                        break;
                    case "class5":
                        imageView.setImageResource(R.drawable.class5);
                        break;
                    case "classm1":
                        imageView.setImageResource(R.drawable.classm1);
                        break;
                    case "classm2":
                        imageView.setImageResource(R.drawable.classm2);
                        break;
                    case "classm3":
                        imageView.setImageResource(R.drawable.classm3);
                        break;
                    case "classm4":
                        imageView.setImageResource(R.drawable.classm4);
                        break;
                    case "classm5":
                        imageView.setImageResource(R.drawable.classm5);
                        break;
                    default:
                        break;
                }
            }

        });


    }

    private void extracted() {
        imageView = findViewById(R.id.imageView1);
        button = findViewById(R.id.button);
        spinner = findViewById(R.id.spinner);
        spinner1 = findViewById(R.id.spinner1);
    }
}