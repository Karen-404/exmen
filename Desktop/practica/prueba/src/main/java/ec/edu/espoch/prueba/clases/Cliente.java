/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ec.edu.espoch.prueba.clases;

/**
 *
 * @author SO-LAB1-PC24
 */
public class Cliente {
    private String nombreClien;
    private String idClien;

    
    public Cliente(String nombreClien, String idClien) {
        this.nombreClien = nombreClien;
        this.idClien = idClien;
    }

    public String getNombreClien() {
        return nombreClien;
    }

    public String getIdClien() {
        return idClien;
    }
    
}
