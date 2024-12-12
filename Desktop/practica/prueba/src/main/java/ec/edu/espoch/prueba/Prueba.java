/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.prueba;

import ec.edu.espoch.prueba.clases.Cliente;
import ec.edu.espoch.prueba.clases.Compra;
import ec.edu.espoch.prueba.clases.Libro;
import ec.edu.espoch.prueba.clases.enumeracion;


/**
 *
 * @author SO-LAB1-PC24
 */
public class Prueba {

    public static void main(String[] args) {
        Cliente Cliente1 = new Cliente("Karen Maje", "225006559");
        Cliente Cliente2 = new Cliente("Jirleidy Santos", "093190331");
                
        Libro libro1 = new Libro("Boulevar", "Flor Martinea", 15.99, enumeracion.FICCION);
        Libro libro2 = new Libro("El jardin de las mariposas", "Dilan Matin", 20.99, enumeracion.FICCION);
        
        Compra compra=new Compra();
        
        compra.mostrarDetalles(libro1, Cliente1);
        compra.mostrarDetalles(libro2, Cliente2);
    
    }
}
