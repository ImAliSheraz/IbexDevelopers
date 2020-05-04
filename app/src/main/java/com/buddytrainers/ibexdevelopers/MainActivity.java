package com.buddytrainers.ibexdevelopers;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showNewActivity(View view)
    {
        Intent objectIntent=new Intent(this, LoginActivity.class);
        startActivity(objectIntent);
        this.finish();
        Toast toast = Toast.makeText(getApplicationContext(), "Welcome to Ibex", Toast.LENGTH_SHORT);
        toast.show();
    }
}
