/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author LENOVO
 */
import Modelo.Categoria;
import Modelo.Cliente;
import Modelo.Producto;
import Modelo.Tienda;
import Vista.TiendaView;
import java.util.List;

public class Controlador {
    private Tienda tienda;
    private TiendaView vista;

    public Controlador(Tienda tienda, TiendaView vista) {
        this.tienda = tienda;
        this.vista = vista;
    }

    public void agregarCliente(String nombre, String paterno, String materno, Date nacimiento, String numDocumento, int celular, double dinero) {
        Cliente cliente = new Cliente(nombre, paterno, materno, nacimiento, numDocumento, celular, dinero);
        tienda.agregarCliente(cliente);
    }

    public void agregarCategoria(String nombre) {
        Categoria categoria = new Categoria(nombre);
        tienda.agregarCategoria(categoria);
    }

    public void agregarProducto(double precio, String nombre, int stock, String marca, Categoria categoria) {
        Producto producto = new Producto(precio, nombre, stock, marca, categoria);
        tienda.agregarProducto(producto);
    }

    public void buscarProductoPorCategoria(Categoria categoria) {
        List<Producto> productos = tienda.buscarProductoPorCategoria(categoria);
        vista.mostrarProductos(productos);
    }

    public static void main(String[] args) {
        Tienda tienda = new Tienda("Mi Tienda", "1234567890", "Dirección de la tienda");
        TiendaView vista = new TiendaView();
        Controlador controller = new Controlador(tienda, vista);

    }
}

