package com.personal;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "autores")
public class Autor {

    @Id
    private int idAutor;
    private String nombreLibro;
    @OneToMany(mappedBy = "idAutor", fetch = FetchType.LAZY)
    private List<Libro> librosEscritos;
    private String paginaWeb;
    private String nacionalidad;

    public Autor() {
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public List<Libro> getLibrosEscritos() {
        return librosEscritos;
    }

    public void setLibrosEscritos(List<Libro> librosEscritos) {
        this.librosEscritos = librosEscritos;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "idAutor=" + idAutor +
                ", nombreLibro='" + nombreLibro + '\'' +
                ", librosEscritos=" + librosEscritos +
                ", paginaWeb='" + paginaWeb + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                '}';
    }
}
