/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import java.awt.Font;
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
        setVisible(true);

        JButton boton1 = new JButton("Registrar Evento");
        JButton boton2 = new JButton("Registar Producto");
        JButton boton3 = new JButton("Ver pagina web");
        JLabel texto = new JLabel("Bienvenido al programa de centros para agricultores ");

        Font fuente = new Font("Arial", Font.PLAIN, 20);
        texto.setFont(fuente);

        boton1.setBounds(70, 450, 174, 68);
        boton2.setBounds(320, 450, 174, 68);
        boton3.setBounds(560, 450, 174, 68);
        texto.setBounds(160, 30, 500, 30);

        add(boton1);
        add(boton2);
        add(boton3);
        add(texto);

    }

    public static void main(String[] args) {
        MenuPrincipal venta = new MenuPrincipal();
    }
}
