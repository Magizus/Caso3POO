package Interfaces;

import l.caso3poo.Evento;
import l.caso3poo.EventoRepository;
import com.toedter.calendar.JDateChooser;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.JTextField;

public class MenuEv extends JFrame {

    public MenuEv() {
        setTitle("Registrar Evento");
        setSize(550, 530);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton boton1 = new JButton("Cancelar");
        JButton boton2 = new JButton("Registrar Evento");
        JLabel Ubica = new JLabel("Ubicacion del evento");
        JLabel Fecha = new JLabel("Dia que se va a ser el evento ");
        JLabel Horas = new JLabel("Hora de inicio y finalizacion");
        JLabel Capaci = new JLabel("Capacidad de productos que va a aceptar");

        JTextField ubicacionT = new JTextField();
        JDateChooser fechaChooser = new JDateChooser();
        JSpinner HInicioT = new JSpinner(new SpinnerDateModel(new Date(), null, null, Calendar.HOUR_OF_DAY));
        JSpinner.DateEditor HInicioEditor = new JSpinner.DateEditor(HInicioT, "HH:mm");
        HInicioT.setEditor(HInicioEditor);

        JSpinner HFinT = new JSpinner(new SpinnerDateModel(new Date(), null, null, Calendar.HOUR_OF_DAY));
        JSpinner.DateEditor HFinEditor = new JSpinner.DateEditor(HFinT, "HH:mm");
        HFinT.setEditor(HFinEditor);

        JTextField capacidadT = new JTextField();

        boton1.setBounds(50, 370, 174, 68);
        boton2.setBounds(310, 370, 174, 68);
        Ubica.setBounds(15, 40, 200, 30);
        Fecha.setBounds(15, 120, 300, 30);
        Horas.setBounds(15, 200, 380, 30);
        Capaci.setBounds(15, 280, 350, 30);

        ubicacionT.setBounds(220, 40, 250, 30);

        fechaChooser.setMinSelectableDate(new Date());

        fechaChooser.setBounds(275, 120, 150, 30);
        HInicioT.setBounds(250, 200, 100, 30);
        HFinT.setBounds(370, 200, 100, 30);
        capacidadT.setBounds(360, 280, 100, 30);

        Font fuente = new Font("Arial", Font.PLAIN, 18);
        Ubica.setFont(fuente);
        Fecha.setFont(fuente);
        Horas.setFont(fuente);
        Capaci.setFont(fuente);
        ubicacionT.setFont(fuente);
        ((JSpinner.DefaultEditor) HInicioT.getEditor()).getTextField().setFont(fuente);
        ((JSpinner.DefaultEditor) HFinT.getEditor()).getTextField().setFont(fuente);
        capacidadT.setFont(fuente);

        add(boton1);
        add(boton2);
        add(Ubica);
        add(Fecha);
        add(Horas);
        add(Capaci);
        add(ubicacionT);
        add(fechaChooser);
        add(HInicioT);
        add(HFinT);
        add(capacidadT);

        // Agrega ActionListener para el botón Cancelar
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();

                new MenuPrincipal();
            }
        });

        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Extraer la información de los componentes de la interfaz
                String ubicacion = ubicacionT.getText();
                Date dia = fechaChooser.getDate();
                Date horaInicio = (Date) HInicioT.getValue();
                Date horaFin = (Date) HFinT.getValue();
                int capacidad = Integer.parseInt(capacidadT.getText());

                // Crear un objeto Evento con la información
                Evento eventoC = new Evento(ubicacion, dia, horaInicio, horaFin, capacidad);

                // Llamar al método estático agregarEvento de EventoRepository
                EventoRepository.agregarEvento(eventoC);
                

                dispose();
            }
        });

        setLayout(null);
        setVisible(true);
    }

}
