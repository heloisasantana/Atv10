package com.example.atv10;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FragmentCirculo extends Fragment {
    private EditText editRaio;
    private TextView textResultado;
    private GeometriaController controller;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_circulo, container, false);

        editRaio = view.findViewById(R.id.editRaio);
        textResultado = view.findViewById(R.id.textResultado);
        controller = new GeometriaController();

        Button buttonArea = view.findViewById(R.id.buttonCalcularArea);
        Button buttonPerimetro = view.findViewById(R.id.buttonCalcularPerimetro);

        buttonArea.setOnClickListener(v -> {
            float raio = Float.parseFloat(editRaio.getText().toString());
            Circulo circulo = new Circulo(raio);
            float area = controller.calcularArea(circulo);
            textResultado.setText("Área: " + area);
            editRaio.setText("");
        });

        buttonPerimetro.setOnClickListener(v -> {
            float raio = Float.parseFloat(editRaio.getText().toString());
            Circulo circulo = new Circulo(raio);
            float perimetro = controller.calcularPerimetro(circulo);
            textResultado.setText("Perímetro: " + perimetro);
            editRaio.setText("");
        });

        return view;
    }
}