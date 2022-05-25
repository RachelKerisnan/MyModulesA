package sg.edu.rp.c346.id21013643.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MyModules2 extends AppCompatActivity {

    TextView tvMod2;
    TextView tvName2;
    TextView tvYear2;
    TextView tvSem2;
    TextView tvCredit2;
    TextView tvVenue2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_modules2);


            tvMod2 = findViewById(R.id.textViewModule2);
            tvName2 = findViewById(R.id.textViewName2);
            tvYear2 = findViewById(R.id.textViewYear2);
            tvSem2 = findViewById(R.id.textViewSem2);
            tvCredit2= findViewById(R.id.textViewCredit2);
            tvVenue2 = findViewById(R.id.textViewVenue2);


            Intent intentReceivedB1= getIntent();
            String value = intentReceivedB1.getStringExtra("code");
            tvMod2.setText("Module Code: " + value);


            Intent intentReceivedB2= getIntent();
            String value2 = intentReceivedB2.getStringExtra("Name");
            tvName2.setText("Module Name: " + value2 );

            Intent intentReceivedB3= new Intent();
            int value3 = intentReceivedB3.getIntExtra("Year", 2020);
            tvYear2.setText("Academic Year: " + value3 );

            Intent intentReceivedB4= getIntent();
            String value4 = intentReceivedB4.getStringExtra("Semester");
            tvSem2.setText("Semester: " + value4 );

            Intent intentReceivedB5= getIntent();
            String value5 = intentReceivedB5.getStringExtra("Credit");
            tvCredit2.setText("Module Credit: "+value5);

            Intent intentReceivedB6= getIntent();
            String value6 = intentReceivedB6.getStringExtra("Venue");
            tvVenue2.setText("Venue: "+ value6 );
        }

    }
