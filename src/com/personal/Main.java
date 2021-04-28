package com.personal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {
    /*
    Crear un sistema (usando Java, MySQL y Hibernate) que permita listar los libros en una librería.

    Cada libro tiene:

    un nombre, una categoría, un ISBN, un año de publicación, un autor y una editorial.

    De cada autor se sabe:
    Su nombre, los libros que escribió, su página web, su nacionalidad.
     */

    public static void main(String[] args) {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        List<Libro> libros = (List<Libro>) session.createQuery("FROM Libros").list();
    }
}
