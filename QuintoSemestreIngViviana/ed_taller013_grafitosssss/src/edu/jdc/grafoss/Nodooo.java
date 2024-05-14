package edu.jdc.grafoss;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Point;

import edu.jdc.variables.MisConstantesss;

public class Nodooo {

	private Point punto;
	private String nombre;
	
	//Estas se usan para ser pulido
	
	private Integer radio;
	private Integer diametro;
	private Font fuente;
	private Color colorRelleno;
	private Color colorFuente;
    private Color colorMarcaInicio;
    
    
    //metodo constructor
    public Nodooo(Point p, String nom) {
    	punto = p;
    	nombre = nom;
        cargarConstantes();
//        centrarNombre(nom, null);
//        dibujar(null);
    }
    
    
    //metodo propio
    private void cargarConstantes() {
    	radio = MisConstantesss.RADIO;
    	diametro = MisConstantesss.DIAMETRO;
    	fuente = MisConstantesss.NODO_FUENTE;
    	colorRelleno = MisConstantesss.NODO_COLOR_RELLENO;
    	colorFuente = MisConstantesss.NODO_COLOR_FUENTE;
    	colorMarcaInicio = MisConstantesss.NODO_COLOR_MARCA_INICIO;
    }
    
    
    private void centrarNombre(String nombreu,Graphics g) {
    	g.setFont(fuente);
    	FontMetrics miMetrica = g.getFontMetrics();
    	double anchoTexto = miMetrica.getStringBounds(nombreu, g).getWidth();
    	Integer enX = (int)(punto.getX()-anchoTexto/2);
    	Integer enY = (int)(punto.getY()-miMetrica.getMaxAscent()+18);
    	g.setColor(colorFuente);
    	g.drawString(nombreu, enX, enY);
    	
    }
    
    public void dibujar(Graphics g) {
    	int x = (int)(punto.getX()-radio);
    	int y = (int)(punto.getY()-radio);
    	g.setColor(colorRelleno);
    	g.fillOval(x, y, diametro, diametro);
    	centrarNombre(nombre, g);
    }
    
    public void dibujarMarcaInicio(Graphics g) {
    	int x = (int)(punto.getX()-radio/2);
    	int y = (int)(punto.getY()-radio/2);
    	g.setColor(colorMarcaInicio);
    	g.fillOval(x, y, radio, radio);
    	centrarNombre(nombre, g);
    	
  
    }


	public Point getPunto() {
		return punto;
	}


	public void setPunto(Point punto) {
		this.punto = punto;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

    
}
