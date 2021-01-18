package com.coursera.petagram;

public class Mascota {
    private String nombre ;
    private int likes ;
    private int foto ;

    public Mascota() {

    }

    public Mascota(int foto, String nombre, int likes) {
        setFoto(foto);
        setNombre(nombre) ;
        setLikes(likes);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public void sumarLike() { this.likes++ ; }
    public void restarLike() { this.likes-- ; }
}
