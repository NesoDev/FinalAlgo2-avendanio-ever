/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author LENOVO
 */
public class Cliente extends Persona implements Serializable {
    private int celular;
    private double dinero;

    public Cliente(String nombre, String paterno, String materno, Date nacimiento, String numDocumento, int celular, double dinero) {
        super(nombre, paterno, materno, nacimiento, numDocumento);
        this.celular = celular;
        this.dinero = dinero;
    }

    public boolean pagar() {
        return true;
    }

    public boolean recargarDinero() {
        return true;
    }
}

