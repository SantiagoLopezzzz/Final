package edu.jdc.formularios;

import edu.jdc.clases.MiArreglo;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class FromPrincipal extends javax.swing.JFrame {

    private MiArreglo miArreglito;
    private static final long SerialVersionUTD = 1L;
    private final DefaultListModel<String> miModelito = new DefaultListModel<>();

    public FromPrincipal() {
        initComponents();
        addWindowListener(
                new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                cerrar();
            }
        }
        );
        listSalida.setModel(miModelito);
        
    }

        private void cerrar (){
         String texto[] = {"Salir", "Quedar"};
        int respuesta = JOptionPane.showOptionDialog(panelSalida, "Realmente desea salir?", "Salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, texto, texto[1]);
        if (respuesta == JOptionPane.YES_OPTION) {
            System.exit(0);

        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSalida = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listSalida = new javax.swing.JList<>();
        panelTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        panelOpciones = new javax.swing.JPanel();
        btnCrear = new javax.swing.JButton();
        btnAleatorio = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnBorrarFinal = new javax.swing.JButton();
        btnVaciarArreglo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        panelSalida.setBackground(new java.awt.Color(255, 153, 153));

        jScrollPane1.setViewportView(listSalida);

        javax.swing.GroupLayout panelSalidaLayout = new javax.swing.GroupLayout(panelSalida);
        panelSalida.setLayout(panelSalidaLayout);
        panelSalidaLayout.setHorizontalGroup(
            panelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        panelSalidaLayout.setVerticalGroup(
            panelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        panelTitulo.setBackground(new java.awt.Color(255, 102, 153));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(242, 242, 242));
        lblTitulo.setText("String");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTituloLayout.createSequentialGroup()
                .addContainerGap(374, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(351, 351, 351))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTituloLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        panelOpciones.setBackground(new java.awt.Color(255, 153, 153));

        btnCrear.setText("Crear Arreglo");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnAleatorio.setText("Crear Aleatorio");
        btnAleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAleatorioActionPerformed(evt);
            }
        });

        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar al final");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnBorrarFinal.setText("Borrar Final");
        btnBorrarFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarFinalActionPerformed(evt);
            }
        });

        btnVaciarArreglo.setText("Vaciar Arreglo");
        btnVaciarArreglo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarArregloActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelOpcionesLayout = new javax.swing.GroupLayout(panelOpciones);
        panelOpciones.setLayout(panelOpcionesLayout);
        panelOpcionesLayout.setHorizontalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAleatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(btnBorrarFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVaciarArreglo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelOpcionesLayout.setVerticalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnCrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImprimir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAleatorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBorrarFinal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVaciarArreglo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(86, 86, 86))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        String cantTexto = JOptionPane.showInputDialog(null, "De cuanto elementos desea el arreglo", "Tamaño", JOptionPane.INFORMATION_MESSAGE);
        if (cantTexto != null) {
            try {
                int i, cant;
                cant = Integer.parseInt(cantTexto);
                miArreglito = new MiArreglo(cant);
                miModelito.clear();
                
                for (i = 0;  i< cant; i++) {
                    String datoTexto = JOptionPane.showInputDialog(null, "Ingrese los elementos", "Ingrese", JOptionPane.INFORMATION_MESSAGE);
                    if (datoTexto == null) {
                        miModelito.addElement("Ya que");
                        i = cant;
                    } else {
                        try {
                            String valorcito = (datoTexto);
                            miArreglito.agregarElemento(i, valorcito);
                        } catch (NumberFormatException error) {
                            JOptionPane.showMessageDialog(null, "Solo numeros ", "Errorrr", JOptionPane.ERROR_MESSAGE, null);
                            i--;
                        }
                    }

                }
            } catch (NumberFormatException error) {
                JOptionPane.showMessageDialog(null, "Solo numeros ", "Errorrr", JOptionPane.ERROR_MESSAGE, null);

            }

        } 
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnAleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAleatorioActionPerformed
        int cuantosCaracteres = 6;
        miModelito.clear();
        miArreglito = new MiArreglo(0);
        miArreglito.crearAleatorio(5, 9, cuantosCaracteres);
        miModelito.addElement("Listoo ");

    }//GEN-LAST:event_btnAleatorioActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        miModelito.clear();
        if (miArreglito == null) {
            miModelito.addElement("Sea serio pelao, no hay arreglo ");
        } else {
            miArreglito.imprimir(miModelito);
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String datoValor = JOptionPane.showInputDialog(null, "Ingrese el nuevo texto", "Tamaño", JOptionPane.INFORMATION_MESSAGE);
        try {
            if (miArreglito == null) {
                miModelito.addElement("No hay");
                miArreglito = new MiArreglo(0);
            } else {
                String valorcito = (datoValor);
                miArreglito.agregarElemento(valorcito);
                miModelito.clear();
                miModelito.addElement("Imprima");
            }
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "Paila" ,"NOOO" ,JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBorrarFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarFinalActionPerformed
        if (miArreglito == null) {
            miModelito.addElement("No hay arreglo");
        } else {
            miModelito.clear();
            miModelito.addElement("Listo");
            miArreglito.eliminarElemento(miModelito);
        }
    }//GEN-LAST:event_btnBorrarFinalActionPerformed

    private void btnVaciarArregloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarArregloActionPerformed
        miArreglito.vaciarArreglo();
        miModelito.clear();
        miModelito.addElement("Ya");
    }//GEN-LAST:event_btnVaciarArregloActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        cerrar();
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
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FromPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FromPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FromPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FromPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FromPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAleatorio;
    private javax.swing.JButton btnBorrarFinal;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVaciarArreglo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> listSalida;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JPanel panelSalida;
    private javax.swing.JPanel panelTitulo;
    // End of variables declaration//GEN-END:variables
}
