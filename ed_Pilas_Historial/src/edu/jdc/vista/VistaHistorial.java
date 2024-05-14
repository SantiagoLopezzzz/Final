package edu.jdc.vista;

import edu.jdc.controlador.Controlador;
import edu.jdc.modelo.Modelo;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class VistaHistorial extends JFrame {

    private Controlador historia;
    public VistaHistorial(Controlador historia) {
        initComponents();
        this.historia = historia;
        mostrarPaginaActual();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        historialTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btnRetroceder = new javax.swing.JButton();
        btnAvanzar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        campoURL = new javax.swing.JTextField();
        btnVisitar = new javax.swing.JButton();

        panelPrincipal.setBackground(new java.awt.Color(255, 204, 204));

        historialTextArea.setColumns(20);
        historialTextArea.setRows(5);
        jScrollPane1.setViewportView(historialTextArea);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("Historial de busqueda ");

        btnRetroceder.setText("Retroceder");
        btnRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrocederActionPerformed(evt);
            }
        });

        btnAvanzar.setText("Avanzar ");
        btnAvanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvanzarActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel3.setText("Ingrese lel url");

        campoURL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoURLActionPerformed(evt);
            }
        });

        btnVisitar.setText("Visitar");
        btnVisitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisitarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoURL)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPrincipalLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPrincipalLayout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPrincipalLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnRetroceder)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAvanzar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVisitar)))
                        .addGap(0, 49, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRetroceder)
                    .addComponent(btnAvanzar)
                    .addComponent(btnAgregar)
                    .addComponent(btnVisitar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        Modelo pagina = historia.retroceder();
        if (pagina != null) {
            mostrarPaginaActual();
        } else {
            JOptionPane.showMessageDialog(VistaHistorial.this, "No hay más páginas hacia atrás.");
        }
    }//GEN-LAST:event_btnRetrocederActionPerformed

    private void btnAvanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvanzarActionPerformed
        Modelo pagina = historia.avanzar();
        if (pagina != null) {
            mostrarPaginaActual();
        } else {
            JOptionPane.showMessageDialog(VistaHistorial.this, "No hay más páginas hacia adelante.");
        }

    }//GEN-LAST:event_btnAvanzarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String url = campoURL.getText();
        if (!url.isEmpty()) {
            historia.visitarPagina(new Modelo(url, url));
            mostrarPaginaActual();
            campoURL.setText("");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void campoURLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoURLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoURLActionPerformed

    private void btnVisitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisitarActionPerformed
        mostrarHistorial();
    }//GEN-LAST:event_btnVisitarActionPerformed

    private void mostrarPaginaActual() {
        Modelo paginaActual = historia.getPaginaActual();
        if (paginaActual != null) {
            historialTextArea.setText("Página Actual: " + paginaActual.getTitulo() + " (" + paginaActual.getUrl() + ")\n");
        } else {
            historialTextArea.setText("No hay páginas visitadas.\n");
        }
    }
    
    private void mostrarHistorial() {
        StringBuilder historialStr = new StringBuilder("Historial de Navegación:\n");
        for (Modelo pagina : historia.getHistorial()) {
            historialStr.append(pagina.getTitulo()).append(" (").append(pagina.getUrl()).append(")\n");
        }
        historialTextArea.setText(historialStr.toString());
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAvanzar;
    private javax.swing.JButton btnRetroceder;
    private javax.swing.JButton btnVisitar;
    private javax.swing.JTextField campoURL;
    private javax.swing.JTextArea historialTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
