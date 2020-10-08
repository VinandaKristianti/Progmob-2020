package ukdw.com.progmob_2020.Materi3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import ukdw.com.progmob_2020.Adapter.MahasiswaRecyclerAdapter;
import ukdw.com.progmob_2020.Model.Mahasiswa;
import ukdw.com.progmob_2020.R;

public class cardviewtest_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardviewtest_activity);

        RecyclerView rv = (RecyclerView)findViewById(R.id.rvTugas);
        MahasiswaRecyclerAdapter mahasiswaRecyclerAdapter;

        //data dummy
        List<Mahasiswa> mahasiswaList = new ArrayList<Mahasiswa>();

        //generate data mahasiswa
        Mahasiswa m1 = new Mahasiswa("Vivin", "72180216", "089237846589");
        Mahasiswa m2 = new Mahasiswa("Yeyen", "72180217", "089247846589");
        Mahasiswa m3 = new Mahasiswa("Alfina", "72180218", "089537846589");
        Mahasiswa m4 = new Mahasiswa("Natasha", "72180219", "086237846589");
        Mahasiswa m5 = new Mahasiswa("Dica", "72180220", "089237846589");
        Mahasiswa m6 = new Mahasiswa("Hakel", "72180221", "089287846589");
        Mahasiswa m7 = new Mahasiswa("Ruendi", "72180222", "089937846589");

        mahasiswaList.add(m1);
        mahasiswaList.add(m2);
        mahasiswaList.add(m3);
        mahasiswaList.add(m4);
        mahasiswaList.add(m5);
        mahasiswaList.add(m6);
        mahasiswaList.add(m7);

        mahasiswaRecyclerAdapter = new MahasiswaRecyclerAdapter(cardviewtest_activity.this);
        mahasiswaRecyclerAdapter.setMahasiswaList(mahasiswaList);

        rv.setLayoutManager(new LinearLayoutManager(cardviewtest_activity.this));
        rv.setAdapter(mahasiswaRecyclerAdapter);


    }
}