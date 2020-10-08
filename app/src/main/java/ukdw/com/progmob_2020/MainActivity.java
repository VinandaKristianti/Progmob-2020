package ukdw.com.progmob_2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import ukdw.com.progmob_2020.Adapter.MahasiswaRecyclerAdapter;
import ukdw.com.progmob_2020.Materi3.ListActivity;
import ukdw.com.progmob_2020.Materi3.RecyclerActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //variabel
        final TextView txtView = (TextView)findViewById(R.id.mainActivityTextView);
        Button btnTombol = (Button)findViewById(R.id.tombol);
        final EditText txtNama = (EditText)findViewById(R.id.namePerson);
        Button btnHelp = (Button)findViewById(R.id.btnHelp);
        Button btnTracker = (Button)findViewById(R.id.btnTracker);
        Button btnRecycler = (Button)findViewById(R.id.btnRecyler);
        Button btnList = (Button)findViewById(R.id.btnList);
        Button btnCard = (Button)findViewById(R.id.btnCard);

        //action
        txtView.setText(R.string.text_hello_world);
        btnTombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.d("Coba Klik", txtNama.getText().toString());
                txtView.setText(txtNama.getText().toString());
            }
        });

        btnHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HelpActivity.class);
                Bundle b = new Bundle();

                b.putString("help_string",txtNama.getText().toString());
                intent.putExtras(b);

                startActivity(intent);
            }
        });

        btnTracker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TrackerActivity.class);
                Bundle b = new Bundle();

                b.putString("tracker_string", txtNama.getText().toString());
                intent.putExtras(b);

                startActivity(intent);
            }
        });

        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListActivity.class);
                startActivity(intent);

            }
        });

        btnRecycler.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RecyclerActivity.class);
                startActivity(intent);
            }
        });

        btnCard.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RecyclerActivity.class);
                startActivity(intent);
            }
        });


    }


}