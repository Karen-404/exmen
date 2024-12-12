/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ec.edu.espoch.prueba.clases;

/**
 *
 * @author SO-LAB1-PC24
 */
public class Compra {      
       public void mostrarDetalles(Libro libro, Cliente cliente) {
        double precioConIva = libro.getPrecio() * 0.12;
        System.out.println("El titulo es: " + libro.getTitulo());
        System.out.println("El autor es: " + libro.getAutor());
        System.out.println("El genero es: " + enumeracion.EDUCATIVO);
        System.out.println("Precio sin Iva: " + libro.getPrecio());
        System.out.println("Precio con Iva: " + precioConIva);

        
        System.out.println("Cliente: "+ cliente.getNombreClien());
        System.out.println("Libro Selecionado: "+ libro.getTitulo());
        System.out.println("Genero: "+ libro.getGenero());
        System.out.println("Precio sin Iva: "+ libro.getPrecio());
        System.out.println("Precio con Iva: "+ precioConIva);
    }
            
         
                
}
