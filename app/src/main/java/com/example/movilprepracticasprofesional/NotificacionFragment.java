package com.example.movilprepracticasprofesional;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class NotificacionFragment extends Fragment {
    AdaptadorNotify adaptadorNotify;
    RecyclerView recyclerView;
    ArrayList<ListElement> listElementArrayList;
    //Crear referencias para poder realizar la comunicacion entre el fragment detalle
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_notificacion, container, false);
        recyclerView= view.findViewById(R.id.listRecyclerview);
        listElementArrayList = new ArrayList<>();
        //cargarmos la lista
        cargarlista();
        mostrarData();
        return view;
    }

    public void cargarlista(){
        listElementArrayList.add(new ListElement("convocatoria","tienes una nueva notificacion","hace 1 minuto",R.drawable.notifications_nav));
        listElementArrayList.add(new ListElement("Aceptacion","tienes una nueva notificacion","hace 2 minuto",R.drawable.notifications_nav));
        listElementArrayList.add(new ListElement("convocatoria","tienes una nueva notificacion","hace 3 minuto",R.drawable.notifications_nav));
        listElementArrayList.add(new ListElement("Aceptacion","tienes una nueva notificacion","hace 4 minuto",R.drawable.notifications_nav));
        listElementArrayList.add(new ListElement("convocatoria","tienes una nueva notificacion","hace 5 minuto",R.drawable.notifications_nav));
    }
    public void mostrarData(){
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adaptadorNotify = new AdaptadorNotify(listElementArrayList, getContext());
        recyclerView.setAdapter(adaptadorNotify);
        adaptadorNotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String titulo = listElementArrayList.get(recyclerView.getChildAdapterPosition(view)).getTitle();
                Toast.makeText(getContext(),"selecciono:"+titulo, Toast.LENGTH_SHORT).show();
            }
        });

    }
}