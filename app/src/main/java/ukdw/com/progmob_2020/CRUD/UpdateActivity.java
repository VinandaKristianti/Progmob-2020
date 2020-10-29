package ukdw.com.progmob_2020.CRUD;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import ukdw.com.progmob_2020.Model.DefaultResult;
import ukdw.com.progmob_2020.Network.GetDataService;
import ukdw.com.progmob_2020.Network.RetrofitClientInstance;
import ukdw.com.progmob_2020.R;

public class UpdateActivity extends AppCompatActivity {
    ProgressDialog pd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        Button btnUpdate = (Button) findViewById(R.id.btnUpdate);
        EditText txtNimLama = (EditText) findViewById(R.id.txtNimLama);
        EditText txtNimUpdate = (EditText)findViewById(R.id.txtNimEdit);
        EditText txtNamaUpdate = (EditText)findViewById(R.id.txtNamaEdit);
        EditText txtAlamatUpdate = (EditText)findViewById(R.id.txtAlamatEdit);
        EditText txtEmailUpdate = (EditText)findViewById(R.id.txtEmailEdit);
        pd = new ProgressDialog(UpdateActivity.this);

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pd.setTitle("Mohon tunggu");
                pd.show();

                GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
                Call<DefaultResult> update = service.update_mhs(
                        txtNimLama.getText().toString(),
                        txtNimUpdate.getText().toString(),
                        txtNamaUpdate.getText().toString(),
                        txtAlamatUpdate.getText().toString(),
                        txtEmailUpdate.getText().toString(),
                        "kosongkan saja",
                        "72180216"
                );

                update.enqueue(new Callback<DefaultResult>() {
                    @Override
                    public void onResponse(Call<DefaultResult> call, Response<DefaultResult> response) {
                        Toast.makeText(UpdateActivity.this, "Update Berhasil !", Toast.LENGTH_LONG);
                    }

                    @Override
                    public void onFailure(Call<DefaultResult> call, Throwable t) {
                        pd.dismiss();
                        Toast.makeText(UpdateActivity.this, "Update Gagal !", Toast.LENGTH_LONG).show();
                    }
                });

            }
        });
        
    }
}

