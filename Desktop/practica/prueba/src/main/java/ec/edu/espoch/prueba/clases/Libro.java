/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ec.edu.espoch.prueba.clases;

/**
 *
 * @author SO-LAB1-PC24
 */
public class Libro {

    private String titulo;
    private String autor;
    private double precio;
    private enumeracion genero;

    public Libro(String titulo, String autor, double precio, enumeracion genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPrecio() {
        return precio;
    }

    public enumeracion getGenero() {
        return genero;
    }



}
