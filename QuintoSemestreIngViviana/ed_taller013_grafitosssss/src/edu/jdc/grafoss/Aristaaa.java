package edu.jdc.grafoss;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Ellipse2D;

import edu.jdc.operaciones.Bresenham;
import edu.jdc.variables.MisConstantesss;

public class Aristaaa {

	//declaracion variables
	private String peso;
	private Nodooo nodoIni;
	private Nodooo nodoFin;
	private Point puntoIni;
	private Point puntoFin;
	
	//truco constantes
	private Color colorArista;
	private Color colorFlecha;
	private Integer diametro;
	private Integer tamanoPunta;
	private Boolean grafoDirigido;
	private Integer posicionPunta;
	
	//***********
	
	
	
	//metodo constructor
	public Aristaaa(String pesoExterno, Point p1, Point p2, Nodooo inicio, Nodooo finn) {
		peso = pesoExterno;
		puntoIni = p1;
		puntoFin = p2;
		nodoIni = inicio;
		nodoFin = finn;
		cargarConstantes();
		
	}
	
	
	//metodo propio
	private void cargarConstantes() {
		colorArista = MisConstantesss.ARISTA_COLOR;
		colorFlecha = MisConstantesss.FLECHA_COLOR;
		diametro = MisConstantesss.DIAMETRO;
		tamanoPunta = MisConstantesss.FLECHA_TAMANIO_PUNTA;
		grafoDirigido = MisConstantesss.GRAFO_DIRIGIDO;
		posicionPunta = MisConstantesss.POSICION_PUNTITA;
	}
	
	private void pintarFlecha(int x0, int y0, int x1, int y1, int largoPuntas, Graphics g) {
		double diferencialY = y1 - y0;
		double diferencialX = x1 - x0;
		
		double anguloInclinacion = Math.atan2(diferencialY, diferencialX);
		int xa = (int)(x1 - largoPuntas*Math.cos(anguloInclinacion +1));
		int ya = (int)(y1 - largoPuntas*Math.sin(anguloInclinacion +1));
		
		g.setColor(colorFlecha);
		g.drawLine(xa, ya, x1, y1);
		
		xa = (int)(x1 - largoPuntas*Math.cos(anguloInclinacion - 1));
		ya = (int)(y1 - largoPuntas*Math.sin(anguloInclinacion-1));
		g.drawLine(xa, ya, x1, y1);
	}
	
	
	private void relacionCircular(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		int posX = (int)(puntoIni.getX()-diametro);
		int posY = (int)(puntoFin.getY()-diametro);
		Ellipse2D elipse = new Ellipse2D.Double(posX,posY,diametro,diametro);
		g2.draw(elipse);
		g.drawString(peso, posX, posY);
		
	}
	
	private void relacionLineal(Graphics g) {
		int iniX =(int)(puntoIni.getX());
		int iniY = (int)(puntoIni.getY());
		int finX = (int)(puntoFin.getX());
		int finY = (int)(puntoFin.getY());
		g.drawLine(iniX, iniY, finX, finY);
		int puntoMedioX = (iniX+finX)/2;
		int puntoMedioY = (iniY+finY)/2;
		g.drawString(peso, puntoMedioX, puntoMedioY);
	}
	
	public void dibujar(Graphics g) {
		g.setColor(colorArista);
		if (puntoIni.equals(puntoFin)) {
			relacionCircular(g);
		} else {
			relacionLineal(g);
		}
		if (grafoDirigido) {
			int iniX = (int)(puntoIni.getX());
			int iniY = (int)(puntoIni.getY());
			int finX = (int)(puntoFin.getX());
			int finY = (int)(puntoFin.getY());
			Point puntoFlecha = Bresenham.encontrarPunto(iniX, iniY, finX, finY,posicionPunta);
			int puntoFlechaX = (int)(puntoFlecha.getX());
			int puntoFlechaY = (int)(puntoFlecha.getY());
			pintarFlecha(iniX,iniY, puntoFlechaX, puntoFlechaY,tamanoPunta,g);
			
		}	
		
	}


	public String getPeso() {
		return peso;
	}


	public void setPeso(String peso) {
		this.peso = peso;
	}


	public Nodooo getNodoIni() {
		return nodoIni;
	}


	public void setNodoIni(Nodooo nodoIni) {
		this.nodoIni = nodoIni;
	}


	public Nodooo getNodoFin() {
		return nodoFin;
	}


	public void setNodoFin(Nodooo nodoFin) {
		this.nodoFin = nodoFin;
	}


	public Point getPuntoIni() {
		return puntoIni;
	}


	public void setPuntoIni(Point puntoIni) {
		this.puntoIni = puntoIni;
	}


	public Point getPuntoFin() {
		return puntoFin;
	}


	public void setPuntoFin(Point puntoFin) {
		this.puntoFin = puntoFin;
	}
	
	
	
	
	
	
}
