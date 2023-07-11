package com.example.trabalho;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;
import java.util.List;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

public class ProgressoDisciplinasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progresso_disciplinas);


        createBarChatt();
        createLinearChart1();


        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btnFechar = findViewById(R.id.btnVoltar);
        btnFechar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Fechar a Activity
                finish();
            }
        });

    }


    void createBarChatt() {
// ...

        BarChart barChart = findViewById(R.id.chart);
        barChart.setBackgroundColor(Color.WHITE);

// Criar uma lista de entradas para o gráfico de barras
        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(0f, 4));
        entries.add(new BarEntry(1f, 2));
        entries.add(new BarEntry(2f, 6));
        entries.add(new BarEntry(3f, 8));
        entries.add(new BarEntry(4f, 3));

// Criar um conjunto de dados de barras com as entradas
        BarDataSet dataSet = new BarDataSet(entries, "Dados do gráfico de barras");

// Criar um objeto BarData com o conjunto de dados
        BarData barData = new BarData(dataSet);

// Definir as cores das barras (opcional)
        dataSet.setColors(ColorTemplate.MATERIAL_COLORS);

// Definir o espaçamento entre as barras (opcional)
        barData.setBarWidth(0.9f);

// Definir os dados no gráfico de barras
        barChart.setData(barData);
// Atualizar o gráfico
        barChart.invalidate();

    }

    void createLinearChart1() {

        BarChart barChart = findViewById(R.id.chart1);
        barChart.setBackgroundColor(Color.WHITE);

// Criar uma lista de entradas para o gráfico de barras
        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(0f, 4));
        entries.add(new BarEntry(1f, 2));
        entries.add(new BarEntry(2f, 6));
        entries.add(new BarEntry(3f, 8));
        entries.add(new BarEntry(4f, 3));

// Criar um conjunto de dados de barras com as entradas
        BarDataSet dataSet = new BarDataSet(entries, "Dados do gráfico de barras");

// Criar um objeto BarData com o conjunto de dados
        BarData barData = new BarData(dataSet);

// Definir as cores das barras (opcional)
        dataSet.setColors(ColorTemplate.MATERIAL_COLORS);

// Definir o espaçamento entre as barras (opcional)
        barData.setBarWidth(0.9f);

// Definir os dados no gráfico de barras
        barChart.setData(barData);
// Atualizar o gráfico
        barChart.invalidate();

    }
}