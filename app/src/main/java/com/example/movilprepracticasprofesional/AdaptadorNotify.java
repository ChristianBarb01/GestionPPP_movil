package com.example.movilprepracticasprofesional;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorNotify extends RecyclerView.Adapter<AdaptadorNotify.ViewHolder> implements View.OnClickListener{
    private ArrayList<ListElement> mData;
    private LayoutInflater mInflater;
    //listener
     private View.OnClickListener listener;

    public AdaptadorNotify(ArrayList<ListElement> itemList, Context context){
    this.mInflater=LayoutInflater.from(context);
    this.mData=itemList;
}

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view= mInflater.inflate(R.layout.list_element,parent,false);
    view.setOnClickListener(this);
    return new ViewHolder(view);
    }
public void setOnClickListener(View.OnClickListener listener){
        this.listener = listener;
}

    @Override
    public void onBindViewHolder(final AdaptadorNotify.ViewHolder holder, int position) {
        String titulo= mData.get(position).getTitle();
        String mensaje= mData.get(position).getDescripcion();
        String state= mData.get(position).getStatus();
        int image= mData.get(position).getImagenid();

        holder.title.setText(titulo);
        holder.descripcion.setText(mensaje);
        holder.status.setText(state);
        holder.iconImage.setImageResource(image);
    }


    @Override
    public int getItemCount() {
        return mData.size();
    }
    public void SetItems(ArrayList<ListElement>items){ mData = items;}

    @Override
    public void onClick(View view) {
    if(listener!=null){
        listener.onClick(view);
    }
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView iconImage;
        TextView title, descripcion,status;
   public ViewHolder(View itemView){
    super(itemView);
    iconImage= itemView.findViewById(R.id.iconImageView);
    title=itemView.findViewById(R.id.txtTitle);
    descripcion=itemView.findViewById(R.id.txtDescripcion);
    status=itemView.findViewById(R.id.txtStatus);
    }

    }

}
