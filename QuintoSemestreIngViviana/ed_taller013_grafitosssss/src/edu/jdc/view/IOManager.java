package edu.jdc.view;
/*Fech: 07/11/23
Autor: Santiago Lopez 
Descripcion: Proyecto version uno 
*/
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.jdc.modelo.PanelImpresion;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class IOManager extends JFrame {

	private JPanel Nombre;
	private JLabel titulo;
	private JPanel panel;
	private final PanelImpresion impresion;
	private final DefaultListModel<Object> miModeloListaNodos = new DefaultListModel();
	private final DefaultListModel<Object> miModeloListaAristas = new DefaultListModel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IOManager frame = new IOManager();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void cerrarAplicacion() {
		int opcion;
		String textos[] = {"Salir","cancelar"};
	    opcion = JOptionPane.showOptionDialog(null, "Desea salir?", "advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, textos, textos[1]);
	    
	    if(opcion == JOptionPane.YES_OPTION) {
	    	System.exit(0);
	    }
	}

	/**
	 * Create the frame.
	 */
	public IOManager() {
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 622, 540);
		setLocationRelativeTo(null);
		Nombre = new JPanel();
		Nombre.setBackground(Color.BLACK);
		Nombre.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(Nombre);
		Nombre.setLayout(null);
		


		
		
		panel = new JPanel();
		panel.setBackground(Color.red);
		panel.setBounds(10, 51, 586, 53);
		Nombre.add(panel);
		panel.setLayout(null);
		
		
		
		JPanel panelUno = new JPanel();
		panelUno.setBackground(Color.red);
		panelUno.setBounds(10, 115, 222, 375);
		Nombre.add(panelUno);
		panelUno.setLayout(null);
		
		//crear jlist de muestra nodo y arista 
		JList listaNodo = new JList();
		listaNodo.setBounds(10, 46, 91, 266);
		panelUno.add(listaNodo);
		
		JList listaArista = new JList();
		listaArista.setBounds(121, 46, 91, 266);
		panelUno.add(listaArista);
		
		
		
		
		JLabel lblNewLabel = new JLabel("Nodo");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBounds(20, 7, 65, 28);
		panelUno.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Arista");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(141, 7, 46, 14);
		panelUno.add(lblNewLabel_1);
		
		JPanel paneltablero = new JPanel();
		paneltablero.setBackground(Color.red);
		paneltablero.setBounds(242, 115, 354, 375);
		Nombre.add(paneltablero);
		paneltablero.setLayout(null);
		
		
		//addwindowlistener  indica que se está trabajando con una ventana, 
		//windowAdapter es una clase abstracta que implementa la interfaz WindowListener, que proporciona métodos para manejar eventos relacionados con ventanas, como abrir, cerrar, activar o desactivar.
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				cerrarAplicacion();
			}
		});
		//Mostrar jlist de muestra nodo y arista
		listaNodo.setModel(miModeloListaNodos);
		listaArista.setModel(miModeloListaAristas);

		impresion = new PanelImpresion(paneltablero.getSize(),miModeloListaNodos,miModeloListaAristas);
		impresion.setCursor(Cursor.getPredefinedCursor(WAIT_CURSOR));
		paneltablero.setLayout(new BorderLayout());
		paneltablero.add(impresion,BorderLayout.CENTER);
	}
}
