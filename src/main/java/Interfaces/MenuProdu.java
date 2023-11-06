/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MenuProdu extends JFrame {

    public MenuProdu() {
        setTitle("Registrar Productos");
        setSize(600, 605);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        JButton boton1 = new JButton("Cancelar");
        JButton boton2 = new JButton("Registar Producto");
        JLabel Evento = new JLabel("Seleccione el evento ");
        JLabel TipoP = new JLabel("¿Cual producto va a llevar?  ");
        JLabel Canti = new JLabel("Ingrese la cantidad que va a dar. (kg)");
        JLabel Cedula = new JLabel("Ingrese su cedula:  ");
        JLabel telefono = new JLabel("Ingrese su numero de telefono: ");

        boton1.setBounds(70, 450, 174, 68);
        boton2.setBounds(350, 450, 174, 68);
        Evento.setBounds(30, 40, 200, 30);
        TipoP.setBounds(30, 120, 300, 30);
        Canti.setBounds(30, 200, 380, 30);
        Cedula.setBounds(30, 280, 350, 30);
        telefono.setBounds(30, 360, 350, 30);
        
        
        
        Font fuente = new Font("Arial", Font.PLAIN, 18);
        Evento.setFont(fuente);
        TipoP.setFont(fuente);
        Canti.setFont(fuente);
        Cedula.setFont(fuente);
        telefono.setFont(fuente);

        
        add(boton1);
        add(boton2);
        add(Evento);
        add(TipoP);
        add(Canti);
        add(Cedula);
        add(telefono);
        

    }

    public static void main(String[] args) {
        MenuProdu ventana = new MenuProdu();
    }

}
