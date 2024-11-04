package com.example.atv10;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FragmentRetangulo extends Fragment {
    private EditText editBase, editAltura;
    private TextView textResultado;
    private GeometriaController controller;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_retangulo, container, false);

        editBase = view.findViewById(R.id.editBase);
        editAltura = view.findViewById(R.id.editAltura);
        textResultado = view.findViewById(R.id.textResultado);
        controller = new GeometriaController();

        Button buttonArea = view.findViewById(R.id.buttonCalcularArea);
        Button buttonPerimetro = view.findViewById(R.id.buttonCalcularPerimetro);

        buttonArea.setOnClickListener(v -> {
            float base = Float.parseFloat(editBase.getText().toString());
            float altura = Float.parseFloat(editAltura.getText().toString());
            Retangulo retangulo = new Retangulo(base, altura);
            float area = controller.calcularArea(retangulo);
            textResultado.setText("Área: " + area);
            editBase.setText("");
            editAltura.setText("");
        });

        buttonPerimetro.setOnClickListener(v -> {
            float base = Float.parseFloat(editBase.getText().toString());
            float altura = Float.parseFloat(editAltura.getText().toString());
            Retangulo retangulo = new Retangulo(base, altura);
            float perimetro = controller.calcularPerimetro(retangulo);
            textResultado.setText("Perímetro: " + perimetro);
            editBase.setText("");
            editAltura.setText("");
        });

        return view;
    }
}
