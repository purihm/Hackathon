package com.example.hunai.hackathon;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public Context cxt;
    float rainfall[]={98.8f, 123.8f, 161.6f, 24.2f, 52f, 58.2f, 35.4f};
    String monthNames[]={"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupPieChart();

        Button btn=(Button) findViewById(R.id.nextScreen);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, HomeScreen.class);
                startActivity(intent);
            }
        });
    }

    private void setupPieChart() {
        List<PieEntry> pieEntries=new ArrayList<>();
        for(int i=0; i<rainfall.length;i++){
            pieEntries.add(new PieEntry(rainfall[i], monthNames[i]));
        }
        PieDataSet dataSet = new PieDataSet(pieEntries, "Rainfall for Vancouver");
        dataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        PieData data=new PieData(dataSet);

        PieChart chart=(PieChart)findViewById(R.id.chart);
        chart.setData(data);
        chart.animateY(1000);
        chart.invalidate();
    }

}
