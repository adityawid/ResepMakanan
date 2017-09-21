package com.devjurnal.resepmakanan;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        // TODO 9. GetExtra Data Intent
        String DataJudul = getIntent().getStringExtra("DataJudul");
        String DataPoster= getIntent().getStringExtra("DataPoster");
        String DataDetail = getIntent().getStringExtra("DataDetail");

        // TODO 10. Tampilkan data Judul
        getSupportActionBar().setTitle(DataJudul);


        // TODO 11. Tampilkan Data Detail
        TextView tvContentDetail = (TextView) findViewById(R.id.contentDetail);
        tvContentDetail.setText(DataDetail.toString());

        // TODO 12 Tampilkan Gambar
        ImageView ivDetailPoster = (ImageView) findViewById(R.id.ivDetailPoster);
        Glide.with(DetailActivity.this).load(DataPoster).into(ivDetailPoster);
    }
}
