/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S05_39;

import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Libro {

    String titulo;
    String autor;
    int anioPublicacion;
    
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.anioPublicacion = 0;
    }
    
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }
    
    public void prestar() {
        System.out.println("El libro ha sido prestado.");
    }
    
    public void devolver() {
        System.out.println("El libro ha sido devuelto.");
    }
    
    public String getTitulo() {
        return this.titulo;
    }
    
    public String getAutor() {
        return this.autor;
    }
    
    public int getAnioPublicacion() {
        return this.anioPublicacion;
    }
    
    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "Título: " + this.titulo + "\nAutor: " + this.autor + "\nAño de publicación: " + this.anioPublicacion);
    }
}
