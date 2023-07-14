/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LENOVO
 */
public class Trabajador extends Persona implements Serializable {
    private String password;
    private String email;

    public Trabajador(String nombre, String paterno, String materno, Date nacimiento, String numDocumento, String password, String email) {
        super(nombre, paterno, materno, nacimiento, numDocumento);
        this.password = password;
        this.email = email;
    }

    public boolean ingresar(String email, String password) {
        // Lógica para ingresar al sistema
        return true;
    }

    public boolean salir() {
        // Lógica para salir del sistema
        return true;
    }

    public boolean crearVenta(Cliente cliente) {
        // Lógica para crear una venta
        return true;
    }
}
