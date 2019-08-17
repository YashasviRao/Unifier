package com.example.homepage1;

import android.content.ClipData;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  // private Item item;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // item = (Item)findViewById(R.id.sub1Item1);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.first_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.residents:
                // Toast.makeText(this, "Residents list should display in recycler view", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.settings:
                //Toast.makeText(this, "Residents list should display in recycler view", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.sub1Item1:
                // Toast.makeText(this, "Residents list should display in recycler view", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, Main2Activity.class);
                this.startActivity(intent);
                return true;
            case R.id.sub2Item1:
                Toast.makeText(this, "View profile in a dialogue", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.sub2Item2:
                Toast.makeText(this, "Profile details hidden", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.sub2Item3:
                Toast.makeText(this, "Notifications muted", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return onOptionsItemSelected(item);

        }

    }
}
