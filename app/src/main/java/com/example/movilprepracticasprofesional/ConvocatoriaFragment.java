package com.example.movilprepracticasprofesional;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import interfaces.EmpresaAPI;
import model.Empresa;
import model.ListAdapter;
import network.Api;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ConvocatoriaFragment extends Fragment {

    EditText edtCedulaBuscar;
    TextView txtCedula;
    TextView txtNombres;
    TextView txtCarrera;
    TextView txtCorreo;

    private List<Empresa> practicantes;
    private RecyclerView recyclerView;
    private ListAdapter listAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        //EstudiantesViewModel estudiantesViewModel = new ViewModelProvider(this).get(EstudiantesViewModel.class);

        //binding = FragmentEstudiantesBinding.inflate(inflater, container, false);
        //View root = binding.getRoot();

        //final TextView textView = binding.textGallery;
        /*final TextView textCedula = binding.txtCedula;
        final TextView textNombres = binding.txtNombres;
        final TextView textCarrera = binding.txtCarrera;
        final TextView textCorreo = binding.txtCorreo;


        final EditText textCedulaBuscar = binding.txtBuscarPrac;
        final Button btnBuscar = binding.btnBuscarPract;*/


        //estudiantesViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        /*estudiantesViewModel.getText().observe(getViewLifecycleOwner(), textCedula::setText);
        estudiantesViewModel.getText().observe(getViewLifecycleOwner(), textNombres::setText);
        estudiantesViewModel.getText().observe(getViewLifecycleOwner(), textCarrera::setText);
        estudiantesViewModel.getText().observe(getViewLifecycleOwner(), textCorreo::setText);*/
        //return root;
        return inflater.inflate(R.layout.fragment_convocatoria,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        edtCedulaBuscar = view.findViewById(R.id.txtBuscarPrac);
        /*txtCedula = view.findViewById(R.id.txtCedula);
        txtNombres = view.findViewById(R.id.txtNombres);
        txtCarrera = view.findViewById(R.id.txtCarrera);
        txtCorreo = view.findViewById(R.id.txtCorreo);*/
        Button btnBuscarPrac = view.findViewById(R.id.btnBuscarPract);

        Date d = new Date();
        SimpleDateFormat fecc = new SimpleDateFormat("d, MMMM 'del' yyyy");
        String fechacComplString = fecc.format(d);
        TextView textView = view.findViewById(R.id.text_gallery);
        textView.setText(fechacComplString);

        recyclerView = view.findViewById(R.id.listEstudiantes);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));

        btnBuscarPrac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPracticantes();

                /*practicantes = new ArrayList<>();
                practicantes.add(new Practicantes("0101995892","ASTUDILLO TOCACHI MANUEL EDUARDO","TECNOLOGÍA SUPERIOR EN DESARROLLO DE SOFTWARE","eduardoeat10@gmail.com"));

                ListAdapter listAdapter = new ListAdapter(practicantes, getActivity().getApplicationContext());
                RecyclerView recyclerView = view.findViewById(R.id.listEstudiantes);
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
                recyclerView.setAdapter(listAdapter);*/
                //find(edtCedulaBuscar.getText().toString());

            }
        });


    }

    public void init(){

        practicantes = new ArrayList<>();
        practicantes.add(new Empresa(1,"0238921382834","LIBELULASOFT","eduardoeat10@gmail.com", "Cuenca","073782473","AV.Americas","0101","hola mundo"));

        //ListAdapter listAdapter = new ListAdapter(practicantes, );

    }

    public void showPracticantes(){
        Call<List<Empresa>> call = Api.getStudents().create(EmpresaAPI.class).obtenerLista();
        call.enqueue(new Callback<List<Empresa>>() {
            @Override
            public void onResponse(Call<List<Empresa>> call, Response<List<Empresa>> response) {
                if(response.isSuccessful()){
                    practicantes = response.body();
                    listAdapter = new ListAdapter(practicantes, getActivity().getApplicationContext());
                    recyclerView.setAdapter(listAdapter);
                }
            }

            @Override
            public void onFailure(Call<List<Empresa>> call, Throwable t) {

            }
        });
    }

}