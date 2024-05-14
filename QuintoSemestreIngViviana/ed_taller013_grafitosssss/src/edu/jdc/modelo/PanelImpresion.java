package edu.jdc.modelo;
/*Fech: 07/11/23
Autor: Santiago Lopez 
Descripcion: Proyecto version uno 
*/
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

import edu.jdc.view.Interfaces;

public class PanelImpresion extends JPanel implements MouseInputListener, MouseMotionListener {

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
	private GenerarNodo nodoIni;
	private GenerarNodo nodoFin;
	private GenerarNodo marcaInicion;
	private Point puntoInicioTemporal;
	private Point puntoFinTemporal;
	private List<GenerarNodo> arregloNodo;
	private List<Arista> arregloArista;
	private GenerarNodo nodoMover;
	private Integer nodoMoverIndice;
	private final DefaultListModel<Object> miModeloNodo;
	private final DefaultListModel<Object> miModeloArista;
	//final es constante


	//metodo constructor
	public PanelImpresion(Dimension tamanio,DefaultListModel<Object> modeloNodo, DefaultListModel<Object> modeloArista) {
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
		radio = Interfaces.RADIO;
		diametro = Interfaces.DIAMETRO;
		marquitoColor = Interfaces.MARCO_COLOR;
		nodoIni = null;
		nodoFin = null;
		marcaInicion = null;
		marcaFondo = Interfaces.FONDO_PANEL;
		this.setBorder(BorderFactory.createLineBorder(marquitoColor));
		this.setBackground(marcaFondo);	
		this.setPreferredSize(new Dimension(ancho,alto));
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}

	private String asignarNombre() {
		String letra;
		int posicion = (char) 'N';
		for (GenerarNodo miNodito : arregloNodo) {
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
		arregloNodo.add(new GenerarNodo(nuevoPunto, nombrecito));
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
						marcaInicion = new GenerarNodo(miNodo.getPunto(), miNodo.getNombre());
						nodoIni = miNodo;
					}else {
						String pesoTxt = JOptionPane.showInputDialog("Ingrese el peso");
						if(pesoTxt == null) {
							pesoTxt = "";
						}
						puntoFinTemporal = new Point(x,y);
						nodoFin = miNodo;
						Arista aristaNueva = new Arista(pesoTxt, puntoInicioTemporal, puntoFinTemporal, nodoIni,nodoFin );
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
		for(GenerarNodo miNodo : arregloNodo) {
			int x = (int)(miNodo.getPunto().getX());
			int y = (int)(miNodo.getPunto().getY());
			Rectangle zona = new Rectangle(x - radio, y - radio,  diametro, diametro);

			if (zona.contains(e.getPoint())) {
				nodoMover = miNodo;

				int indicesito = 0;

				for(GenerarNodo nodoBuscar : arregloNodo) {
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
		nodoMover = null;
		nodoMoverIndice = null;

	}

	@Override
	public void mouseEntered(MouseEvent e) {


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
			for(Arista miArista: arregloArista) {
				if(miArista.getNodoIni().equals(miArista.getNodoFin()) && miArista.getNodoIni().equals(nodoMover)) {
					//nodo recursivo
					Point puntoRecursivo = new Point(e.getX(), e.getY());
					this.arregloArista.set(indice, new Arista(
							miArista.getPeso(),
							puntoRecursivo,puntoRecursivo,
							miArista.getNodoIni(), miArista.getNodoFin()));


				}else {
					//nodo normal
					if(miArista.getNodoIni().equals(nodoMover)) {
						Point ptoInicio = new Point(e.getX(),e.getY());

						this.arregloArista.set(indice, new Arista(
								miArista.getPeso(),
								ptoInicio, miArista.getPuntoFin(),
								miArista.getNodoIni(),miArista.getNodoFin()));

					}

					if (miArista.getNodoFin().equals(nodoMover)) {
						Point ptoFIn = new Point(e.getX(), e.getY());
						this.arregloArista.set(indice, new Arista(
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
