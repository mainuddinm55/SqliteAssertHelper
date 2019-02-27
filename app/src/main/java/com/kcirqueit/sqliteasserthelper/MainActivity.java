package com.kcirqueit.sqliteasserthelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DBHelper dbHelper = new DBHelper(this);

        int size = dbHelper.getAllCountry().size();
        Log.e("Country Size", "onCreate: "+size);
        Toast.makeText(this, "" + size, Toast.LENGTH_SHORT).show();
    }
}
