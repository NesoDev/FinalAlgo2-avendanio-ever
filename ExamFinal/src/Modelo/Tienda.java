/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author LENOVO
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Tienda implements Serializable {
    private String nombre;
    private String ruc;
    private String direccion;
    private List<Cliente> clientes;
    private List<Categoria> categorias;
    private List<Producto> productos;
    private List<Venta> ventas;

    public Tienda(String nombre, String ruc, String direccion) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.clientes = new ArrayList<>();
        this.categorias = new ArrayList<>();
        this.productos = new ArrayList<>();
        this.ventas = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void eliminarCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    public void agregarCategoria(Categoria categoria) {
        categorias.add(categoria);
    }

    public void eliminarCategoria(Categoria categoria) {
        categorias.remove(categoria);
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

    public List<Producto> buscarProductoPorCategoria(Categoria categoria) {
        List<Producto> productosEnCategoria = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getCategoria().equals(categoria)) {
                productosEnCategoria.add(producto);
            }
        }
        return productosEnCategoria;
    }

    public List<Producto> buscarProductoPorNombre(String nombre) {
        List<Producto> productosEnNombre = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombre)) {
                productosEnNombre.add(producto);
            }
        }
        return productosEnNombre;
    }

    public Persona autenticar(String email, String password) {
        for (Persona persona : clientes) {
            if (persona instanceof Trabajador && ((Trabajador) persona).getEmail().equals(email) && ((Trabajador) persona).getPassword().equals(password)) {
                return persona;
            } else if (persona instanceof Cliente && ((Cliente) persona).getEmail().equals(email) && ((Cliente) persona).getPassword().equals(password)) {
                return persona;
            }
        }
        return null;
    }

    public void agregarVenta(Venta venta) {
        ventas.add(venta);
    }

    public void eliminarVenta(Venta venta) {
        ventas.remove(venta);
    }
}
