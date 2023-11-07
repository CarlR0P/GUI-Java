package presentacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IngresarPersona extends JFrame {
    private JPanel pnlPrincipal;
    private JLabel lblCodigo;
    private JTextField txtCodigo;
    private JLabel lblNombre;
    private JLabel lblApellido;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JButton btnGuardar;
    private JLabel lblIdioma;
    private JComboBox cmbidioma;

    public IngresarPersona() {
        this.setContentPane(pnlPrincipal);

        this.setSize(800,600);

        this.setVisible(true);
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo = txtCodigo.getText();
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();
                String idioma = cmbidioma.getSelectedItem().toString();
                String mensaje = "Tus datos son: " + "\n" +
                        "Codigo: " + codigo + "\n" +
                        "Nombre: " + nombre + "\n" +
                        "Apellido: " + apellido + "\n" +
                        "Idioma: " + idioma;
                JOptionPane.showMessageDialog(btnGuardar, mensaje);
            }
        });
    }
}
