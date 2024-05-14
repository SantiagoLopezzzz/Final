package edu.jdc.vista;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import edu.jdc.modelo.Variable;
import java.awt.event.ActionEvent;


public class MemoriaVista extends JFrame{
    private JTextArea areaMemoria;
    private JButton botonAsignar;
    private JButton botonListar;
    private JButton botonLiberar;
    private JTextField campoNombre;
    private JTextField campoTamaño;
    
    public MemoriaVista()  {
        
        setTitle("Gestión de Memoria en Compilador");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        areaMemoria = new JTextArea(15, 30);
        areaMemoria.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(areaMemoria);

        botonAsignar = new JButton("Asignar Variable");
        botonLiberar = new JButton("Liberar Variable");
        botonListar = new JButton("Listar Variables");
        campoNombre = new JTextField(10);
        campoTamaño = new JTextField(10);

        JPanel panelEntrada = new JPanel();
        panelEntrada.add(new JLabel("Nombre:"));
        panelEntrada.add(campoNombre);
        panelEntrada.add(new JLabel("Tamaño:"));
        panelEntrada.add(campoTamaño);

        JPanel panelBotones = new JPanel();
        panelBotones.add(botonAsignar);
        panelBotones.add(botonLiberar);
        panelBotones.add(botonListar);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());
        panelPrincipal.add(scrollPane, BorderLayout.CENTER);
        panelPrincipal.add(panelEntrada, BorderLayout.NORTH);
        panelPrincipal.add(panelBotones, BorderLayout.SOUTH);

        add(panelPrincipal);

        setVisible(true);
    }

    public String getNombreVariable() {
        return campoNombre.getText();
    }

    public int getTamañoVariable() {
        return Integer.parseInt(campoTamaño.getText());
    }

    public void mostrarMemoria(Variable inicio) {
        StringBuilder memoria = new StringBuilder();
        Variable actual = inicio;
        while (actual != null) {
            memoria.append(actual.getNombre()).append(" - Tamaño: ").append(actual.getTamaño()).append("\n");
            actual = actual.getSiguiente();
        }
        areaMemoria.setText(memoria.toString());
    }

    public void agregarListenerAsignar(ActionListener listener) {
        botonAsignar.addActionListener(listener);
    }

    public void agregarListenerLiberar(ActionListener listener) {
        botonLiberar.addActionListener(listener);
    }

    public void agregarListenerListar(ActionListener listener) {
        botonListar.addActionListener(listener);
    }
}

