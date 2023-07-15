/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author LENOVO
 */
public class Venta implements Serializable {
    private double total;
    private Date fecha;
    private boolean estado;
    private List<Detalle> detalles;

    public Venta(double total, Date fecha) {
        this.total = total;
        this.fecha = fecha;
        this.estado = false;
        this.detalles = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        Detalle detalle = new Detalle(1, producto.getPrecio());
        detalles.add(detalle);
    }

    public void eliminarProducto(Producto producto, int cantidad) {
        Detalle detalleEliminado = null;
        for (Detalle detalle : detalles) {
            if (detalle.getProducto().equals(producto) && detalle.getCantidad() == cantidad) {
                detalleEliminado = detalle;
                break;
            }
        }
        if (detalleEliminado != null) {
            detalles.remove(detalleEliminado);
        }
    }

    public double validarCarrito() {
        double totalCarrito = 0;
        for (Detalle detalle : detalles) {
            totalCarrito += detalle.getTotal();
        }
        return totalCarrito;
    }
}
