package edu.jdc.formularios;

import com.formdev.flatlaf.FlatDarkLaf;
import edu.jdc.clases.MiArreglo;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class FromPrincipal extends javax.swing.JFrame {
    private MiArreglo miArreglito;
    
    private static final long SerialVersionUID = 1L;
    
    private final DefaultListModel <String> miModelito = new DefaultListModel<>();
    
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        panelPrincipal = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        panelOpciones = new javax.swing.JPanel();
        btnAleatorio = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnBorrarFInal = new javax.swing.JButton();
        btnVaciarArreglo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        panelSalida = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listSalida = new javax.swing.JList<>();
        panelResultados = new javax.swing.JPanel();
        lblResultados = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        panelPrincipal.setBackground(new java.awt.Color(255, 204, 204));

        panelTitulo.setBackground(new java.awt.Color(255, 102, 102));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Diagonostico ");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTituloLayout.createSequentialGroup()
                .addContainerGap(272, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelOpciones.setBackground(new java.awt.Color(255, 102, 102));

        btnAleatorio.setForeground(new java.awt.Color(255, 255, 255));
        btnAleatorio.setText("Crear Aleatorio");
        btnAleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAleatorioActionPerformed(evt);
            }
        });

        btnImprimir.setForeground(new java.awt.Color(255, 255, 255));
        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        btnCrear.setForeground(new java.awt.Color(255, 255, 255));
        btnCrear.setText("Crear Arreglo");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar al final");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnBorrarFInal.setForeground(new java.awt.Color(242, 242, 242));
        btnBorrarFInal.setText("Borrar final");
        btnBorrarFInal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarFInalActionPerformed(evt);
            }
        });

        btnVaciarArreglo.setForeground(new java.awt.Color(242, 242, 242));
        btnVaciarArreglo.setText("Vaciar Arreglo");
        btnVaciarArreglo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarArregloActionPerformed(evt);
            }
        });

        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
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
                    .addComponent(btnImprimir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(btnAleatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBorrarFInal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVaciarArreglo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelOpcionesLayout.setVerticalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpcionesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnCrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImprimir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAleatorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBorrarFInal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVaciarArreglo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        panelSalida.setBackground(new java.awt.Color(255, 153, 153));

        listSalida.setBackground(new java.awt.Color(102, 102, 102));
        listSalida.setForeground(new java.awt.Color(255, 102, 102));
        jScrollPane1.setViewportView(listSalida);

        javax.swing.GroupLayout panelSalidaLayout = new javax.swing.GroupLayout(panelSalida);
        panelSalida.setLayout(panelSalidaLayout);
        panelSalidaLayout.setHorizontalGroup(
            panelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelSalidaLayout.setVerticalGroup(
            panelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        panelResultados.setBackground(new java.awt.Color(255, 153, 153));

        lblResultados.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblResultados.setForeground(new java.awt.Color(255, 255, 255));
        lblResultados.setText("Resultados");

        javax.swing.GroupLayout panelResultadosLayout = new javax.swing.GroupLayout(panelResultados);
        panelResultados.setLayout(panelResultadosLayout);
        panelResultadosLayout.setHorizontalGroup(
            panelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResultadosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(227, 227, 227))
        );
        panelResultadosLayout.setVerticalGroup(
            panelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblResultados, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(panelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelResultados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(panelResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        cerrar();

    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAleatorioActionPerformed
        miModelito.clear();
        miArreglito = new MiArreglo(0);
        miArreglito.crearAleatorio(5, 10, 1, 9);
        miModelito.addElement("Listo arregloAleatorio ");
    }//GEN-LAST:event_btnAleatorioActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        miModelito.clear();
        if (miArreglito == null) {
            miModelito.addElement("Sea serio pelao, no hay arreglo ");
        } else {
            miArreglito.imprimir(miModelito);
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        String cantTexto = JOptionPane.showInputDialog(null, "Cuanto elementos", "Tamaño", JOptionPane.INFORMATION_MESSAGE);
        if (cantTexto != null) {
            try {
                int i, cant;
                cant = Integer.parseInt(cantTexto);
                miArreglito = new MiArreglo(cant);
                miModelito.clear();
                for (i = 0; i < cant; i++) {
                  
                    String datoTexto = JOptionPane.showInputDialog(null, "Ingrese los elementos", "Ingrese", JOptionPane.INFORMATION_MESSAGE);
                    if (datoTexto == null) {
                        miModelito.addElement("Ya que");
//                         JOptionPane.showMessageDialog(null, "felipe");
                        i = cant;
                        
                    }else{
                        try {
                            int valorcito = Integer.parseInt(datoTexto);
                            miArreglito.agregarElemento(i, valorcito);
                        } catch (NumberFormatException error) {
                            JOptionPane.showMessageDialog(null, "Solo numeros ", "Error", JOptionPane.ERROR_MESSAGE, null);
                            i--;
                        }
                    }

                }
            } catch (NumberFormatException error) {
                JOptionPane.showMessageDialog(null, "Solo numeros ", "Errorrr", JOptionPane.ERROR_MESSAGE, null);
            }
        }
        
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        String datoValor = JOptionPane.showInputDialog(null, "Ingrese el numero ", "Uyyy" ,JOptionPane.QUESTION_MESSAGE);
        try {
            if (miArreglito == null) {
                miModelito.addElement("No existe ");
                miArreglito = new MiArreglo(0);
            } else {
                int valorcito = Integer.parseInt(datoValor);
                miArreglito.agregarElemento(valorcito);
                miModelito.clear();
                miModelito.addElement("Listo vaya imprima ");
            }
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "Paila" ,"NOOO" ,JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBorrarFInalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarFInalActionPerformed
        if (miArreglito == null) {
            miModelito.addElement("No hay arreglo");
        } else {
            miModelito.clear();
            miModelito.addElement("Listo");
            miArreglito.eliminarElemento(miModelito);
        }
    }//GEN-LAST:event_btnBorrarFInalActionPerformed

    private void btnVaciarArregloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarArregloActionPerformed
        miArreglito.vaciarArreglo();
        miModelito.clear();
        miModelito.addElement("Ya");
    }//GEN-LAST:event_btnVaciarArregloActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
           javax.swing.UIManager.setLookAndFeel(new FlatDarkLaf());
           
           
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
    private javax.swing.JButton btnBorrarFInal;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVaciarArreglo;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblResultados;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> listSalida;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelResultados;
    private javax.swing.JPanel panelSalida;
    private javax.swing.JPanel panelTitulo;
    // End of variables declaration//GEN-END:variables
}
