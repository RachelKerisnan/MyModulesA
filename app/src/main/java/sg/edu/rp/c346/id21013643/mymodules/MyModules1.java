package sg.edu.rp.c346.id21013643.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MyModules1 extends AppCompatActivity {

    TextView tvMod;
    TextView tvName;
    TextView tvYear;
    TextView tvSem;
    TextView tvCredit;
    TextView tvVenue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_modules1);



        tvMod = findViewById(R.id.textViewModule);
        tvName = findViewById(R.id.textViewName);
        tvYear = findViewById(R.id.textViewYear);
        tvSem = findViewById(R.id.textViewSem);
        tvCredit= findViewById(R.id.textViewCredit);
        tvVenue = findViewById(R.id.textViewVenue);


        Intent intentReceivedA1= getIntent();
        String value = intentReceivedA1.getStringExtra("code");
        tvMod.setText("Module Code: " + value);


        Intent intentReceivedA2= getIntent();
        String value2 = intentReceivedA2.getStringExtra("Name");
        tvName.setText("Module Name: " + value2 );

        Intent intentReceivedA3= new Intent();
        int value3 = intentReceivedA3.getIntExtra("Year", 2020);
        tvYear.setText("Academic Year: " + value3 );

        Intent intentReceivedA4= getIntent();
        String value4 = intentReceivedA4.getStringExtra("Semester");
        tvSem.setText("Semester: " + value4 );

        Intent intentReceivedA5= getIntent();
        String value5 = intentReceivedA5.getStringExtra("Credit");
        tvCredit.setText("Module Credit: "+value5);

        Intent intentReceivedA6= getIntent();
        String value6 = intentReceivedA6.getStringExtra("Venue");
        tvVenue.setText("Venue: "+ value6 );
    }
}