/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author LENOVO
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Modelo.Persona;
import Vista.TiendaLogin;
import Modelo.Tienda;

public class Controlador {
    private Tienda tienda;
    private TiendaLogin vista;

    public Controlador(Tienda tienda, TiendaLogin vista) {
        this.tienda = tienda;
        this.vista = vista;

        this.vista.btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Serializar los datos antes de salir
                System.exit(0);
            }
        });

        this.vista.btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = vista.txtUsuairo.getText();
                String password = new String(vista.txtClave.getPassword());

                Persona persona = tienda.autenticar(email, password);

                if (persona != null) {
                    iniciarTienda(persona);
                    vista.dispose();
                } else {
                    mostrarMensajeError("Credenciales inválidas");
                    limpiarControles();
                }
            }
        });
    }

    public void iniciar() {
        this.vista.setLocationRelativeTo(null);
        limpiarControles();
        this.vista.setVisible(true);
    }

    public void limpiarControles() {
        vista.txtUsuairo.setText("");
        vista.txtClave.setText("");
    }

    public void iniciarTienda(Persona persona) {
        // Lógica para iniciar la tienda y mostrar la interfaz principal
        // Puedes crear una instancia de la clase TiendaPrincipalView y un controlador correspondiente
        // para administrar las operaciones de la tienda
    }

    public void mostrarMensajeError(String mensaje) {
        JOptionPane.showMessageDialog(vista, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
