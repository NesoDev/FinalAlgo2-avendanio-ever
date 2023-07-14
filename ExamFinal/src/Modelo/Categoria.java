/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author LENOVO
 */
public class Categoria implements Serializable {
    private String nombre;
    private boolean disponible;

    public Categoria(String nombre) {
        this.nombre = nombre;
        this.disponible = true;
    }

    public boolean habilitar() {
        this.disponible = true;
        return true;
    }

    public boolean deshabilitar() {
        this.disponible = false;
        return true;
    }
}

