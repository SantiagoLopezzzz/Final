
package matiz;

import javax.swing.JOptionPane;

public class Matiz {

    public class Matriz {

        public static void main(String[] args) {
            int numeroColumnas = NumeroColumnas();
            int[][] matriz = new int[5][numeroColumnas];
            llenarMatriz(matriz);
            mostrarMatriz(matriz);
        }

        private static int NumeroColumnas() {
            String input = JOptionPane.showInputDialog("Ingrese el número de columnas:");
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Solo se reciben numeros .");
                return NumeroColumnas();
            }
        }

        private static void llenarMatriz(int[][] matriz) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = (int) (Math.random() * 11);
                }
            }
        }

        private static void mostrarMatriz(int[][] matriz) {
            String resultado = //            new String("La Matriz es: ");
            for (int i = 0; i < matriz; i++) {
                    
                }
            }
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
   

