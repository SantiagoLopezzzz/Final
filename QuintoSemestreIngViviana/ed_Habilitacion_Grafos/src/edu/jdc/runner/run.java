package edu.jdc.runner;
/* Fecha: 17 octubre 2023
   Autor: Santiago 
    Grafos Habilitacion 
 */
import com.formdev.flatlaf.FlatIntelliJLaf;
import edu.jdc.controladores.Control;
import edu.jdc.vistas.FrmPrincipal;


public class run {

// Metodos Propios
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            javax.swing.UIManager.setLookAndFeel(new FlatIntelliJLaf());
            FlatIntelliJLaf.setup();
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }


}
