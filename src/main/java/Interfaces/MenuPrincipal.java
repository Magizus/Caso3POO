package Interfaces;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MenuPrincipal extends JFrame {

    public MenuPrincipal() {
        setTitle("Menu Principal");
        setSize(800, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton boton1 = new JButton("Registrar Evento");
        JButton boton2 = new JButton("Registrar Producto");
        JButton boton3 = new JButton("Ver página web");
        JLabel texto = new JLabel("Bienvenido al programa de centros para agricultores ");

        Font fuente = new Font("Arial", Font.PLAIN, 20);
        texto.setFont(fuente);

        boton1.setBounds(70, 450, 174, 68);
        boton2.setBounds(320, 450, 174, 68);
        boton3.setBounds(560, 450, 174, 68);
        texto.setBounds(160, 45, 500, 30);

        add(boton1);
        add(boton2);
        add(boton3);
        add(texto);
        setLayout(null);
        setVisible(true);

        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();

                new MenuEv();
            }
        });

        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();

                new MenuProdu();
            }
        });

    }

}
