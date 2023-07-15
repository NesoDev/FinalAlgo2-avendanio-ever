/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author LENOVO
 */
public class Producto implements Serializable {
    private double precio;
    private String nombre;
    private int stock;
    private String marca;
    private Categoria categoria;

    public Producto(double precio, String nombre, int stock, String marca, Categoria categoria) {
        this.precio = precio;
        this.nombre = nombre;
        this.stock = stock;
        this.marca = marca;
        this.categoria = categoria;
    }

    public boolean vender(int cantidad) {
        return true;
    }

    public boolean reponer(int cantidad) {
        return true;
    }
}


