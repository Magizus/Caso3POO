package Interfaces;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MenuEv extends JFrame {

    public MenuEv() {
        setTitle("Registrar Evento");
        setSize(550, 530);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //----------------------------------------------
        JButton boton1 = new JButton("Cancelar");
        JButton boton2 = new JButton("Registrar Evento");
        JLabel Ubica = new JLabel("Ubicacion del evento");
        JLabel Fecha = new JLabel("Dia que se va a ser el evento ");
        JLabel Horas = new JLabel("Hora de inicio y finalizacion");
        JLabel Capaci = new JLabel("Capacidad de productos que va a aceptar");
        JTextField ubicacionT = new JTextField();
        JTextField fechaT = new JTextField();
        JTextField HInicioT = new JTextField();
        JTextField HFinT = new JTextField();
        JTextField capacidadT = new JTextField();
        //------------------------------------------

        boton1.setBounds(50, 370, 174, 68);
        boton2.setBounds(310, 370, 174, 68);
        Ubica.setBounds(15, 40, 200, 30);
        Fecha.setBounds(15, 120, 300, 30);
        Horas.setBounds(15, 200, 380, 30);
        Capaci.setBounds(15, 280, 350, 30);
        ubicacionT.setBounds(220, 40, 250, 30);
        fechaT.setBounds(275, 120, 150, 30);
        HInicioT.setBounds(250, 200, 100, 30);
        HFinT.setBounds(370, 200, 100, 30);
        capacidadT.setBounds(365, 280, 150, 30);
        //------------------------------------------
        Font fuente = new Font("Arial", Font.PLAIN, 18);
        Ubica.setFont(fuente);
        Fecha.setFont(fuente);
        Horas.setFont(fuente);
        Capaci.setFont(fuente);
        ubicacionT.setFont(fuente);
        fechaT.setFont(fuente);
        HInicioT.setFont(fuente);
        HFinT.setFont(fuente);
        capacidadT.setFont(fuente);

        //------------------------------------------
        add(boton1);
        add(boton2);
        add(Ubica);
        add(Fecha);
        add(Horas);
        add(Capaci);
        add(ubicacionT);
        add(fechaT);
        add(HInicioT);
        add(HFinT);
        add(capacidadT);
        //------------------------------------------
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        MenuEv ventana = new MenuEv();
    }
}
