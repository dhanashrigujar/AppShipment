package com.app.appshipment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {
    Button btn_allship;
    public static TextView fetch_data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btn_allship = (Button) findViewById(R.id.button_allship);
        fetch_data = (TextView)findViewById(R.id.fetch_data);
        btn_allship.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              fetchData process = new fetchData();
              process.execute();
          }
      });
    }
}
