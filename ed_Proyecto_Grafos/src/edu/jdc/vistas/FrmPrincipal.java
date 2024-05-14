package edu.jdc.vistas;

import edu.jdc.controladores.Control;
import edu.jdc.modelos.Graphic;
import javax.swing.JOptionPane;

public class FrmPrincipal extends javax.swing.JFrame {

    private Control controlVentana = new Control();
    private Graphic grafico = new Graphic();
    Graphic grafo = new Graphic();

    public FrmPrincipal() {
        initComponents();

    }

    private void cerrarVentana() {
        String[] textos = {"SI", "NO"};
        int opcion = JOptionPane.showOptionDialog(panelPrincipal, "¿Esta seguro de salir?", "ADVERTENCIA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, textos, textos[0]);

        if (opcion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        panelOpciones = new javax.swing.JPanel();
        btnNumeroNodos = new javax.swing.JButton();
        btnIdentificador = new javax.swing.JButton();
        btnConexion = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        panelResultados = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtGrafos = new javax.swing.JTextArea();
        panelMatriz = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMatriz = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        panelPrincipal.setBackground(new java.awt.Color(18, 72, 107));

        panelTitulo.setBackground(new java.awt.Color(18, 72, 107));

        lbTitulo.setFont(new java.awt.Font("Dosis ExtraBold", 0, 36)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(246, 241, 241));
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("GRAFOS");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTituloLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelOpciones.setBackground(new java.awt.Color(18, 72, 107));
        panelOpciones.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(246, 241, 241), 3), "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dosis ExtraBold", 0, 14), new java.awt.Color(246, 241, 241))); // NOI18N
        panelOpciones.setForeground(new java.awt.Color(246, 241, 241));

        btnNumeroNodos.setBackground(new java.awt.Color(65, 145, 151));
        btnNumeroNodos.setFont(new java.awt.Font("Dosis ExtraBold", 0, 14)); // NOI18N
        btnNumeroNodos.setForeground(new java.awt.Color(246, 241, 241));
        btnNumeroNodos.setText("Numero de nodos");
        btnNumeroNodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumeroNodosActionPerformed(evt);
            }
        });

        btnIdentificador.setBackground(new java.awt.Color(65, 145, 151));
        btnIdentificador.setFont(new java.awt.Font("Dosis ExtraBold", 0, 14)); // NOI18N
        btnIdentificador.setForeground(new java.awt.Color(246, 241, 241));
        btnIdentificador.setText("Identificador");
        btnIdentificador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIdentificadorActionPerformed(evt);
            }
        });

        btnConexion.setBackground(new java.awt.Color(65, 145, 151));
        btnConexion.setFont(new java.awt.Font("Dosis ExtraBold", 0, 14)); // NOI18N
        btnConexion.setForeground(new java.awt.Color(246, 241, 241));
        btnConexion.setText("Conexión");
        btnConexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConexionActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(65, 145, 151));
        btnSalir.setFont(new java.awt.Font("Dosis ExtraBold", 0, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(246, 241, 241));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnImprimir.setBackground(new java.awt.Color(65, 145, 151));
        btnImprimir.setFont(new java.awt.Font("Dosis ExtraBold", 0, 14)); // NOI18N
        btnImprimir.setForeground(new java.awt.Color(246, 241, 241));
        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelOpcionesLayout = new javax.swing.GroupLayout(panelOpciones);
        panelOpciones.setLayout(panelOpcionesLayout);
        panelOpcionesLayout.setHorizontalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOpcionesLayout.createSequentialGroup()
                        .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnConexion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNumeroNodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        panelOpcionesLayout.setVerticalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNumeroNodos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIdentificador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConexion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        panelResultados.setBackground(new java.awt.Color(18, 72, 107));
        panelResultados.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(246, 241, 241), 3), "Vista Resultados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dosis ExtraBold", 0, 14), new java.awt.Color(246, 241, 241))); // NOI18N

        txtGrafos.setEditable(false);
        txtGrafos.setBackground(new java.awt.Color(246, 241, 241));
        txtGrafos.setColumns(20);
        txtGrafos.setFont(new java.awt.Font("Dosis ExtraBold", 0, 18)); // NOI18N
        txtGrafos.setRows(5);
        jScrollPane3.setViewportView(txtGrafos);

        javax.swing.GroupLayout panelResultadosLayout = new javax.swing.GroupLayout(panelResultados);
        panelResultados.setLayout(panelResultadosLayout);
        panelResultadosLayout.setHorizontalGroup(
            panelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelResultadosLayout.setVerticalGroup(
            panelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelMatriz.setBackground(new java.awt.Color(18, 72, 107));
        panelMatriz.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(246, 241, 241), 3), "Matriz", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dosis ExtraBold", 0, 14), new java.awt.Color(246, 241, 241))); // NOI18N

        txtMatriz.setEditable(false);
        txtMatriz.setBackground(new java.awt.Color(246, 241, 241));
        txtMatriz.setColumns(20);
        txtMatriz.setFont(new java.awt.Font("Dosis ExtraBold", 0, 24)); // NOI18N
        txtMatriz.setRows(5);
        jScrollPane2.setViewportView(txtMatriz);

        javax.swing.GroupLayout panelMatrizLayout = new javax.swing.GroupLayout(panelMatriz);
        panelMatriz.setLayout(panelMatrizLayout);
        panelMatrizLayout.setHorizontalGroup(
            panelMatrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMatrizLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelMatrizLayout.setVerticalGroup(
            panelMatrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMatrizLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMatriz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(panelResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(panelResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 32, Short.MAX_VALUE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(panelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(panelMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNumeroNodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumeroNodosActionPerformed
        controlVentana.requestinformation();
    }//GEN-LAST:event_btnNumeroNodosActionPerformed

    private void btnIdentificadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIdentificadorActionPerformed
        controlVentana.fillMatrix();
    }//GEN-LAST:event_btnIdentificadorActionPerformed

    private void btnConexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConexionActionPerformed
        controlVentana.MessajeConnection();


    }//GEN-LAST:event_btnConexionActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        cerrarVentana();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
   
    

        


     



    }//GEN-LAST:event_btnImprimirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConexion;
    private javax.swing.JButton btnIdentificador;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnNumeroNodos;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel panelMatriz;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelResultados;
    private javax.swing.JPanel panelTitulo;
    public static javax.swing.JTextArea txtGrafos;
    public static javax.swing.JTextArea txtMatriz;
    // End of variables declaration//GEN-END:variables
}
