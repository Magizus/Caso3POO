package Interfaces;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MenuProdu extends JFrame {

    public MenuProdu() {
        setTitle("Registrar Productos");
        setSize(600, 605);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

       
        JButton boton1 = new JButton("Cancelar");
        JButton boton2 = new JButton("Registrar Producto");
        JLabel Evento = new JLabel("Seleccione el evento ");
        JLabel TipoP = new JLabel("¿Cual producto va a llevar?  ");
        JLabel Canti = new JLabel("Ingrese la cantidad que va a dar. (kg)");
        JLabel Cedula = new JLabel("Ingrese su cedula:  ");
        JLabel telefono = new JLabel("Ingrese su numero de telefono: ");

        // Utiliza JComboBox en lugar de JTextField
        String[] eventos = {"Evento 1", "Evento 2", "Evento 3"};
        JComboBox<String> comboEventos = new JComboBox<>(eventos);

        JTextField txtTipoP = new JTextField();
        JTextField txtCanti = new JTextField();
        JTextField txtCedula = new JTextField();
        JTextField txtTelefono = new JTextField();

        
        boton1.setBounds(70, 450, 174, 68);
        boton2.setBounds(350, 450, 174, 68);
        Evento.setBounds(30, 40, 200, 30);
        TipoP.setBounds(30, 120, 300, 30);
        Canti.setBounds(30, 200, 380, 30);
        Cedula.setBounds(30, 280, 350, 30);
        telefono.setBounds(30, 360, 350, 30);

        // Ajusta la posición y el tamaño del JComboBox
        comboEventos.setBounds(250, 40, 300, 30);

        txtTipoP.setBounds(330, 120, 220, 30);
        txtCanti.setBounds(410, 200, 140, 30);
        txtCedula.setBounds(370, 280, 180, 30);
        txtTelefono.setBounds(380, 360, 170, 30);

       
        Font fuente = new Font("Arial", Font.PLAIN, 18);
        Evento.setFont(fuente);
        TipoP.setFont(fuente);
        Canti.setFont(fuente);
        Cedula.setFont(fuente);
        telefono.setFont(fuente);
        comboEventos.setFont(fuente);
        txtTipoP.setFont(fuente);
        txtCanti.setFont(fuente);
        txtCedula.setFont(fuente);
        txtTelefono.setFont(fuente);

        
        add(boton1);
        add(boton2);
        add(Evento);
        add(TipoP);
        add(Canti);
        add(Cedula);
        add(telefono);
        add(comboEventos);
        add(txtTipoP);
        add(txtCanti);
        add(txtCedula);
        add(txtTelefono);
        setLayout(null);
        setVisible(true);
       
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();

                new MenuPrincipal();
            }
        });
    }

}
