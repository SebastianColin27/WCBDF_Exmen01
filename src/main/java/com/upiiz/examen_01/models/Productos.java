package com.upiiz.examen_01.models;

public class Productos {
    public Long id;
    public Long id_producto;
    private String comentario;
    public Long id_usuario;

    public Productos(){}

    public Productos(Long id, Long id_producto, String comentario, Long id_usuario) {
        this.id = id;
        this.id_producto = id_producto;
        this.comentario = comentario;
        this.id_usuario = id_usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_producto() {
        return id_producto;
    }

    public void setId_producto(Long id_producto) {
        this.id_producto = id_producto;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }
}
