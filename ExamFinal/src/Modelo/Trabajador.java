/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean ingresar(String email, String password) {
        return true;
    }

    public boolean salir() {
        return true;
    }

    public boolean crearVenta(Cliente cliente) {
        return true;
    }
}
