package edu.jdc.modelo;
/*Fech: 07/11/23 
Autor: Santiago Lopez 
Descripcion: Proyecto version uno 
*/
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Point;

import edu.jdc.view.Interfaces;

public class GenerarNodo {

	private Point punto;
	private String nombre;
	
	//Variables 
	
	private Integer radio;
	private Integer diametro;
	private Font fuente;
	private Color colorRelleno;
	private Color colorFuente;
    private Color colorMarcaInicio;
    
    
    //metodo constructor
    public GenerarNodo(Point p, String nom) {
    	punto = p;
    	nombre = nom;
        cargarConstantes();
    }
    
    
    //metodo propio
    private void cargarConstantes() {
    	radio = Interfaces.RADIO;
    	diametro = Interfaces.DIAMETRO;
    	fuente = Interfaces.NODO_FUENTE;
    	colorRelleno = Interfaces.NODO_COLOR_RELLENO;
    	colorFuente = Interfaces.NODO_COLOR_FUENTE;
    	colorMarcaInicio = Interfaces.NODO_COLOR_MARCA_INICIO;
    }
    
    //El objeto Graphics se utiliza para dibujar gráficos en un contexto gráfico,
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
    //linea 68 : Se calcula la coordenada x donde se dibujará la marca de inicio horizontalmente
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
