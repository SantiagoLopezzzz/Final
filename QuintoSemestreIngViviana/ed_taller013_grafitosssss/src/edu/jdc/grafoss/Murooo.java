package edu.jdc.grafoss;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.DefaultBoundedRangeModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

import edu.jdc.variables.MisConstantesss;

public class Murooo extends JPanel implements MouseInputListener, MouseMotionListener {

	//Declaracion variables
	//*******************
	//truco constantes
	private Integer radio;
	private Integer diametro;
	private Color marquitoColor;
	private Color marcaFondo;
	//********************************************


	private final Integer alto;
	private final Integer ancho;
	private Nodooo nodoIni;
	private Nodooo nodoFin;
	private Nodooo marcaInicion;
	private Point puntoInicioTemporal;
	private Point puntoFinTemporal;
	private List<Nodooo> arregloNodo;
	private List<Aristaaa> arregloArista;
	private Nodooo nodoMover;
	private Integer nodoMoverIndice;
	private final DefaultListModel<Object> miModeloNodo;
	private final DefaultListModel<Object> miModeloArista;
	//final es constante


	//metodo constructor
	public Murooo(Dimension tamanio,DefaultListModel<Object> modeloNodo, DefaultListModel<Object> modeloArista) {
		alto = (int)(tamanio.getHeight());
		ancho = (int)(tamanio.getWidth());
		arregloNodo = new ArrayList<>();
		arregloArista = new ArrayList<>();
		miModeloNodo = modeloNodo;
		miModeloArista = modeloArista;
		cargarConstantes();
	}




	//metodos propios

	private void cargarConstantes() {
		radio = MisConstantesss.RADIO;
		diametro = MisConstantesss.DIAMETRO;
		marquitoColor = MisConstantesss.MARCO_COLOR;
		nodoIni = null;
		nodoFin = null;
		marcaInicion = null;
		marcaFondo = MisConstantesss.FONDO_PANEL;
		this.setBorder(BorderFactory.createLineBorder(marquitoColor));
		this.setBackground(marcaFondo);	
		this.setPreferredSize(new Dimension(ancho,alto));
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}

	private String asignarNombre() {
		String letra;
		int posicion = (char) 'a';
		for (Nodooo miNodito : arregloNodo) {
			letra = miNodito.getNombre();
			posicion = (char)letra.charAt(0);
			posicion++;
		}
		letra = String.valueOf((char) posicion);
		return letra;
	}

	private void agregarNodo(MouseEvent e) {
		String nombrecito = asignarNombre();
		Point nuevoPunto = new Point(e.getX(),e.getY());
		arregloNodo.add(new Nodooo(nuevoPunto, nombrecito));
		miModeloNodo.addElement(nombrecito);
	}



	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		//funcion fleccha;;
		arregloArista.forEach((miAristica)->{miAristica.dibujar(g);});
		arregloNodo.forEach((miNodito)->{miNodito.dibujar(g);});

		if(marcaInicion != null) {
			marcaInicion.dibujarMarcaInicio(g);

		}
	}




	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getButton() == MouseEvent.BUTTON1) {
			agregarNodo(e);
		}

		if(e.getButton() == MouseEvent.BUTTON3) {
			arregloNodo.forEach((miNodo)->{
				int x = (int)(miNodo.getPunto().getX());
				int y = (int)(miNodo.getPunto().getY());
				Rectangle zona = new Rectangle(x-radio,y-radio,diametro,diametro);
				if(zona.contains(e.getPoint())) {
					if(puntoInicioTemporal == null) {
						puntoInicioTemporal = new Point(x,y);
						marcaInicion = new Nodooo(miNodo.getPunto(), miNodo.getNombre());
						nodoIni = miNodo;
						//JOptionPane.showMessageDialog(null, "no has empezado");
					}else {
						String pesoTxt = JOptionPane.showInputDialog("Dame el pesito je je");
						if(pesoTxt == null) {
							pesoTxt = "";
						}
						puntoFinTemporal = new Point(x,y);
						nodoFin = miNodo;
						Aristaaa aristaNueva = new Aristaaa(pesoTxt, puntoInicioTemporal, puntoFinTemporal, nodoIni,nodoFin );
						arregloArista.add(aristaNueva);
						miModeloArista.addElement(marcaInicion.getNombre() + "->" + miNodo.getNombre() + "=" + pesoTxt);
						puntoInicioTemporal = null;
						puntoFinTemporal = null;
						marcaInicion = null;



					}
				}
			});
		}
		getParent().repaint();


	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

		for(Nodooo miNodo : arregloNodo) {
			int x = (int)(miNodo.getPunto().getX());
			int y = (int)(miNodo.getPunto().getY());
			Rectangle zona = new Rectangle(x - radio, y - radio,  diametro, diametro);

			if (zona.contains(e.getPoint())) {
				nodoMover = miNodo;

				int indicesito = 0;

				for(Nodooo nodoBuscar : arregloNodo) {
					if(nodoBuscar.equals(nodoMover)) {
						nodoMoverIndice = indicesito;
					}
					indicesito++;
				}
				break;
			}
		}

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

		nodoMover = null;
		nodoMoverIndice = null;

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		if(nodoMover != null && marcaInicion == null) {
			Point puntito = new Point(e.getX(), e.getY());
			nodoMover.setPunto(puntito);
			this.arregloNodo.set(nodoMoverIndice, nodoMover);

			int indice = 0;
			for(Aristaaa miArista: arregloArista) {
				if(miArista.getNodoIni().equals(miArista.getNodoFin()) && miArista.getNodoIni().equals(nodoMover)) {
					//nodo recursivo
					Point puntoRecursivo = new Point(e.getX(), e.getY());
					this.arregloArista.set(indice, new Aristaaa(
							miArista.getPeso(),
							puntoRecursivo,puntoRecursivo,
							miArista.getNodoIni(), miArista.getNodoFin()));


				}else {
					//nodo niormal
					if(miArista.getNodoIni().equals(nodoMover)) {
						Point ptoInicio = new Point(e.getX(),e.getY());

						this.arregloArista.set(indice, new Aristaaa(
								miArista.getPeso(),
								ptoInicio, miArista.getPuntoFin(),
								miArista.getNodoIni(),miArista.getNodoFin()));

					}

					if (miArista.getNodoFin().equals(nodoMover)) {
						Point ptoFIn = new Point(e.getX(), e.getY());
						this.arregloArista.set(indice, new Aristaaa(
								miArista.getPeso(),
								miArista.getPuntoIni(), ptoFIn,
								miArista.getNodoIni(),miArista.getNodoFin()));

					}
				}
				indice++;
			}


		}
		getParent().repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
