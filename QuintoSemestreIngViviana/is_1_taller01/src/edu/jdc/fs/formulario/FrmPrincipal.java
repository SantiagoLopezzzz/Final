package edu.jdc.fs.formulario;

import com.formdev.flatlaf.FlatDarkLaf;
import edu.jdc.fs.clases.Moto;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class FrmPrincipal extends javax.swing.JFrame {

    private ArrayList<Moto> arregloMotos;

    public FrmPrincipal() {
        initComponents();

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                cerrarAplicacion();
            }
        });

        arregloMotos = new ArrayList<>();
        cargarMotos();

    }

    private void cerrarAplicacion() {
        int opcion = 0;
        String[] textoBotones = {"Aceptar", "Cancelar"};
        opcion = JOptionPane.showOptionDialog(panelPrincipal, "Estas seguro de cerrar la aplicacion?",
                "Cerrar Aplicacion",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null, textoBotones, textoBotones[1]);

        if (opcion == JOptionPane.YES_OPTION) {
            this.dispose();
        }

    }

    private void cargarMotos() {
//         arregloMotos.add(new Moto(1, "Yamaha", "2023", "MOV618", "Verde"));
//         arregloMotos.add(new Moto(2, "AKT", "2020", "SOG123", "Azul"));
//         arregloMotos.add(new Moto(3, "BMW", "2023", "AND234", "Amarilla"));
//         arregloMotos.add(new Moto(4, "APACHE", "2022", "KEV123", "Blanco"));

    }

    public void lanzarVentana(JInternalFrame miVentana) {
        panelPrincipal.add(miVentana);
        miVentana.setVisible(true);

        Dimension tamanoPanelPrincipal = this.getSize();
        Dimension tamanoVentana = miVentana.getSize();

        miVentana.setLocation(
                (int) (tamanoPanelPrincipal.getWidth() - tamanoVentana.getWidth()) / 2,
                (int) (tamanoPanelPrincipal.getHeight() - tamanoVentana.getHeight()) / 2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        btnSalir = new javax.swing.JMenuItem();
        menuMoto = new javax.swing.JMenu();
        btnCrear = new javax.swing.JMenuItem();
        btnListar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );

        menuArchivo.setText("Archivo");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(btnSalir);

        jMenuBar1.add(menuArchivo);

        menuMoto.setText("Moto");

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        menuMoto.add(btnCrear);

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        menuMoto.add(btnListar);

        jMenuBar1.add(menuMoto);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        FrmListarMoto miVentanita = new FrmListarMoto(arregloMotos);
        lanzarVentana(miVentanita);

    }//GEN-LAST:event_btnListarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        FrmCrearMoto miVentanita = new FrmCrearMoto(arregloMotos);
        lanzarVentana(miVentanita);


    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        cerrarAplicacion();

    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(new FlatDarkLaf());
                    break;
                }
            }
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnCrear;
    private javax.swing.JMenuItem btnListar;
    private javax.swing.JMenuItem btnSalir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuMoto;
    private javax.swing.JDesktopPane panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
