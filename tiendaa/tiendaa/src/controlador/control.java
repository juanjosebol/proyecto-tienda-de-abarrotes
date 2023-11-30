package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import tiendaa.datos.usuario;
import tiendaa.metodousu;
import vistas.login;
import vistas.principal;
import vistas.registrousu;

public class control implements ActionListener {

    public void MostrarVentanaPrincipal() {
        // Crear una instancia de la ventana principal
        principal principalForm = new principal();

        // Hacer visible la ventana principal
        principalForm.setVisible(true);

        // Cerrar la ventana de inicio de sesión
        log.setVisible(false);
    }

    public void MostrarVentanaRegistro() {
        // Crear una instancia de la ventana de registro
        registrousu regForm = new registrousu();

        // Hacer visible la ventana de registro
        regForm.setVisible(true);

        // Cerrar la ventana de inicio de sesión
        log.setVisible(false);
    }

    metodousu met = new metodousu();
    usuario x = new usuario();
    login log = new login();
    registrousu reg = new registrousu();

    public control(login log, registrousu reg, usuario user) {

        this.log = log;
        this.reg = reg;
        this.x = user;

        // registro de usuario
        this.reg.btRegistrar.addActionListener(this);

        // login
        this.log.btIngresar.addActionListener(this);
        this.log.btRegistrar.addActionListener(this);

    }

    public void Registrar() {

        x.setNombre(reg.tNombre.getText());
        x.setDireccion(reg.tDireccion.getText());
        x.setTelefono(reg.tTelefono.getText());
        x.setUsuario(reg.tUsuario.getText());
        x.setPass(reg.tPassword.getText());

        if (metodousu.InsertarUsuario(x) > 0) {
            JOptionPane.showMessageDialog(null, "Usuario Registrado");
        } else {
            JOptionPane.showMessageDialog(null, "Error al Registrar");
        }
    }

    public void Ingreso() {
        String us = log.tUser.getText();
        String pw = log.tPass.getText();

        if (met.Autenticacion(us, pw)) {
            // Mostrar la ventana principal si la autenticación es exitosa
            MostrarVentanaPrincipal();
            JOptionPane.showMessageDialog(null, "Logeo Correcto");
        } else {
            JOptionPane.showMessageDialog(null, "Error de Logeo");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == reg.btRegistrar) {
            Registrar();
        }
        if (e.getSource() == log.btIngresar) {
            Ingreso();
        }
        if (e.getSource() == log.btRegistrar) {
            MostrarVentanaRegistro();
        }
    }

    public void RegistrarUsuario(usuario user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
