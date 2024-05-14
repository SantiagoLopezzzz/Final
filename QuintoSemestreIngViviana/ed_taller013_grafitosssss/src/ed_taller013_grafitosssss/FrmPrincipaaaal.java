package ed_taller013_grafitosssss;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.jdc.grafoss.Murooo;

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

public class FrmPrincipaaaal extends JFrame {

	private JPanel Nombre;
	private JTextField txtEstructuraDeDatos;
	private JPanel panel;
	private final Murooo miMurooo;
	private final DefaultListModel<Object> miModeloListaNodos = new DefaultListModel();
	private final DefaultListModel<Object> miModeloListaAristas = new DefaultListModel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPrincipaaaal frame = new FrmPrincipaaaal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void cerrarAplicacion() {
		int opcion;
		String textos[] = {"salir","cancelar"};
	    opcion = JOptionPane.showOptionDialog(null, "¿esta seguro de que quiere irse ya mano?", "advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, textos, textos[1]);
	    
	    if(opcion == JOptionPane.YES_OPTION) {
	    	System.exit(0);
	    }
	}

	/**
	 * Create the frame.
	 */
	public FrmPrincipaaaal() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 622, 540);
		setLocationRelativeTo(null);
		Nombre = new JPanel();
		Nombre.setBackground(Color.BLACK);
		Nombre.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(Nombre);
		Nombre.setLayout(null);
		
		JPanel panelNombre = new JPanel();
		panelNombre.setBackground(Color.YELLOW);
		panelNombre.setBounds(10, 11, 586, 29);
		Nombre.add(panelNombre);
		panelNombre.setLayout(null);
		
		txtEstructuraDeDatos = new JTextField();
		txtEstructuraDeDatos.setForeground(Color.BLACK);
		txtEstructuraDeDatos.setBackground(Color.YELLOW);
		txtEstructuraDeDatos.setHorizontalAlignment(SwingConstants.CENTER);
		txtEstructuraDeDatos.setText("Estructura de datos : Grafos dirigidos");
		txtEstructuraDeDatos.setBounds(133, 0, 291, 24);
		panelNombre.add(txtEstructuraDeDatos);
		txtEstructuraDeDatos.setColumns(10);
		
		panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		panel.setBounds(10, 51, 586, 53);
		Nombre.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Lista nodo o vertice");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(25, 7, 163, 31);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Lista arista o arcos");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(221, 8, 152, 29);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Admin\\Desktop\\esta tiene que ser.png"));
		btnNewButton_2.setBounds(432, 9, 95, 33);
		panel.add(btnNewButton_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.YELLOW);
		panel_1.setBounds(10, 115, 222, 375);
		Nombre.add(panel_1);
		panel_1.setLayout(null);
		
		JList listaNodo = new JList();
		listaNodo.setBounds(10, 46, 91, 266);
		panel_1.add(listaNodo);
		
		JList listaArista = new JList();
		listaArista.setBounds(121, 46, 91, 266);
		panel_1.add(listaArista);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\Admin\\Desktop\\esta tiene que ser.png"));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(20, 323, 71, 41);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\Admin\\Desktop\\esta tiene que ser.png"));
		btnNewButton_4.setBounds(141, 323, 71, 41);
		panel_1.add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("Nodos");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBounds(20, 7, 65, 28);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Aristas");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(141, 7, 46, 14);
		panel_1.add(lblNewLabel_1);
		
		JPanel paneltablero = new JPanel();
		paneltablero.setBackground(Color.YELLOW);
		paneltablero.setBounds(242, 115, 354, 375);
		Nombre.add(paneltablero);
		paneltablero.setLayout(null);
		
		
		
		//****************************************************************************************************************************
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				cerrarAplicacion();
			}
		});
		
		
		//****************************************************************************************************************************
		listaNodo.setModel(miModeloListaNodos);
		listaArista.setModel(miModeloListaAristas);
		
		miMurooo = new Murooo(paneltablero.getSize(),miModeloListaNodos,miModeloListaAristas);
		miMurooo.setCursor(Cursor.getPredefinedCursor(WAIT_CURSOR));
		paneltablero.setLayout(new BorderLayout());
		paneltablero.add(miMurooo,BorderLayout.CENTER);
	}
}
