package com.example.movilprepracticasprofesional;


import java.io.Serializable;

public class ListElement implements Serializable {
public String title;
public String descripcion;
public String status;
public int imagenid;

    public ListElement() {

    }

    public ListElement(String title, String descripcion, String status, int imagenid) {
        this.title = title;
        this.descripcion = descripcion;
        this.status = status;
        this.imagenid = imagenid;
    }


    public int getImagenid() {
        return imagenid;
    }

    public void setImagenid(int imagenid) {
        this.imagenid = imagenid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}