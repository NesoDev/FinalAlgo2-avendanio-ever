/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author LENOVO
 */
public class Detalle implements Serializable {
    private int cantidad;
    private double precio;
    private double total;
    private Producto producto;

    public Detalle(int cantidad, double precio) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = cantidad * precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getTotal() {
        return total;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}



