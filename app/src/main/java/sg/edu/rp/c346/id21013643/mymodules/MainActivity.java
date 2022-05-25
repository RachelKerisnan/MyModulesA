package sg.edu.rp.c346.id21013643.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView tvAndroid;
    TextView tviPad;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvAndroid = findViewById(R.id.textViewAndroid);
        tviPad = findViewById(R.id.textViewIpad);

        tvAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentA = new Intent(MainActivity.this, MyModules1.class);
                intentA.putExtra("code","C346");//key-value
                intentA.putExtra("Name","Android Programming");
                intentA.putExtra("Year","2020");
                intentA.putExtra("Semester","1");
                intentA.putExtra("Credit","4");
                intentA.putExtra("Venue","W66M");
                startActivity(intentA);
            }
        });

        tviPad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentB = new Intent(MainActivity.this, MyModules2.class);
                intentB.putExtra("code","C349");//key-value
                intentB.putExtra("Name","iPad Programming ");
                intentB.putExtra("Year","2020");
                intentB.putExtra("Semester","2");
                intentB.putExtra("Credit","1");
                intentB.putExtra("Venue","E66K");
                startActivity(intentB);
            }
        });

        






    }
}