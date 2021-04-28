package com.personal;

import javax.persistence.*;

@Entity
@Table(name="autores")
public class Libro {

    @Id
    private int idLibro;
    private String nombreLibro;
    private String categoria;
    private int isbn;
    private int anioPublicacion;
    @ManyToMany
    @JoinColumn(name="idAutor")
    private Autor autor;
    private  String editorial;

    public Libro() {
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "idLibro=" + idLibro +
                ", nombreLibro='" + nombreLibro + '\'' +
                ", categoria='" + categoria + '\'' +
                ", isbn=" + isbn +
                ", anioPublicacion=" + anioPublicacion +
                ", autor=" + autor +
                ", editoria='" + editorial + '\'' +
                '}';
    }
}
