package com.example.anemia;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.anemia.Menu.BantuanActivity;
import com.example.anemia.Menu.KuisActivity;
import com.example.anemia.Menu.MateriActivity;
import com.example.anemia.Menu.TentangActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnKuis, btnMateri, btnTentang, btnBantuan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnKuis = findViewById(R.id.btn_kuis);
        btnKuis.setOnClickListener(this);

        btnMateri = findViewById(R.id.btn_materi);
        btnMateri.setOnClickListener(this);

        btnTentang = findViewById(R.id.btn_tentang);
        btnTentang.setOnClickListener(this);

        btnBantuan = findViewById(R.id.btn_bantuan);
        btnBantuan.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_materi:
                Intent materiIntent = new Intent(MainActivity.this, MateriActivity.class);
                startActivity(materiIntent);
                break;
            case R.id.btn_kuis:
            Intent moveIntent = new Intent(MainActivity.this, KuisActivity.class);
            startActivity(moveIntent);
            break;
            case R.id.btn_tentang:
                Intent tentangIntent = new Intent(MainActivity.this, TentangActivity.class);
                startActivity(tentangIntent);
                break;
            case R.id.btn_bantuan:
                Intent bantuanIntent = new Intent(MainActivity.this, BantuanActivity.class);
                startActivity(bantuanIntent);
                break;
        }

        }
    @Override
    public void onBackPressed(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
                builder.setMessage("Yakin keluar aplikasi?")
                .setPositiveButton("YA", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                       finish();
                       System.exit(0);
                    }
                });
        builder.setNegativeButton("TIDAK", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            //if user select "No", just cancel this dialog and continue with app
            dialog.cancel();
        }
    });
    AlertDialog alert = builder.create();
        alert.show();
}
    }



