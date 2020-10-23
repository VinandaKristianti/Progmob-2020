package ukdw.com.progmob_2020.CRUD;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ukdw.com.progmob_2020.MainActivity;
import ukdw.com.progmob_2020.Materi3.RecyclerActivity;
import ukdw.com.progmob_2020.R;

public class MainMhsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_mhs);

        Button btnTambah = (Button)findViewById(R.id.buttonAddMhs);
        Button btnLihat = (Button)findViewById(R.id.buttonGetMhs);
        Button btnHapus = (Button)findViewById(R.id.btnDelMhs);
        Button btnUpdate = (Button)findViewById(R.id.buttonUpdate);

        btnTambah.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMhsActivity.this, AddMhsActivity.class);
                startActivity(intent);
            }
        });

        btnLihat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMhsActivity.this, MahasiswaGetAllActivity.class);
                startActivity(intent);
            }
        });

        btnHapus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMhsActivity.this, DeleteActivity.class);
                startActivity(intent);
            }
        });

        btnUpdate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMhsActivity.this, UpdateActivity.class);
                startActivity(intent);
            }
        });
    }
}