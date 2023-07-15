/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;

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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public boolean vender(int cantidad) {
        return true;
    }

    public boolean reponer(int cantidad) {
        return true;
    }
}


