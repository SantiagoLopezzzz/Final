package edu.jdc.control;
/*Fech: 07/11/23
Autor: Santiago Lopez 
Descripcion: Proyecto version uno 
*/
import java.awt.Point;

public class Flechas {

	public static Point encontrarPunto(int inicioX, int inicioY, int finX, int finY, int separacion) {
        int distanciaX = Math.abs(finX - inicioX);
        int distanciaY = Math.abs(finY - inicioY);

        int incrementoX = inicioX < finX ? 1 : -1;
        int incrementoY = inicioY < finY ? 1 : -1;

        int error = distanciaX - distanciaY;
        int e2;

        boolean siga = true;
        double distanciaPuntos = Math.hypot(finX - inicioX, finY - inicioY);

        while (siga && distanciaPuntos > separacion) {
            distanciaPuntos = Math.hypot(finX - inicioX, finY - inicioY);

            if (inicioX == finX && inicioY == finY) {
                siga = false;
            }

            e2 = 2 * error;
            if (e2 > -distanciaY) {
                error = error - distanciaY;
                inicioX = inicioX + incrementoX;
            }

            if (e2 < distanciaX) {
                error = error + distanciaX;
                inicioY = inicioY + incrementoY;
            }
        }
        return new Point(inicioX, inicioY);
    }
}
