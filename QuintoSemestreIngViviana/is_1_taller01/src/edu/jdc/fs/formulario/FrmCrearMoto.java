package edu.jdc.fs.formulario;

import edu.jdc.fs.clases.Marca;
import edu.jdc.fs.clases.Moto;
import edu.jdc.fs.configuracion.MisConstantes;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class FrmCrearMoto extends javax.swing.JInternalFrame {

    private ArrayList<Moto> arregloMotos;

    private Marca[] arregloMarquitas;
    private DefaultComboBoxModel miModelito = new DefaultComboBoxModel();

    public FrmCrearMoto(ArrayList<Moto> arregloPrincipal) {
        initComponents();
        arregloMotos = arregloPrincipal;
        arregloMarquitas = MisConstantes.obtenerMarcas();
        Arrays.toString(arregloMarquitas);
        comboMarca.setModel(miModelito);
        llenarCombo();
    }

    private void cerrarVentana() {
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

    private void limpiarCajas() {
        cajaColor.setText("");
        cajaModelo.setText("");
        cajaPlaca.setText("");

    }

    private void llenarCombo() {
        for (int i = 0; i < arregloMarquitas.length; i++) {
            miModelito.addElement(arregloMarquitas[i].getNombreMarca());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        panelContenido = new javax.swing.JPanel();
        lbMarca = new javax.swing.JLabel();
        lbColor = new javax.swing.JLabel();
        cajaColor = new javax.swing.JTextField();
        lbPlaca = new javax.swing.JLabel();
        cajaPlaca = new javax.swing.JTextField();
        lbModelo = new javax.swing.JLabel();
        cajaModelo = new javax.swing.JTextField();
        comboMarca = new javax.swing.JComboBox<>();
        panelBotones = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnCancelarOperacion = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        panelPrincipal.setBackground(new java.awt.Color(255, 153, 153));

        panelTitulo.setBackground(new java.awt.Color(255, 102, 102));

        lblTitulo.setText("Crear Moto new");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(207, 207, 207))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTituloLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(28, 28, 28))
        );

        panelContenido.setBackground(new java.awt.Color(255, 102, 102));

        lbMarca.setText("Marca");

        lbColor.setText("Color");

        cajaColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaColorActionPerformed(evt);
            }
        });

        lbPlaca.setText("Placa");

        cajaPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaPlacaActionPerformed(evt);
            }
        });

        lbModelo.setText("Modelo ");

        cajaModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaModeloActionPerformed(evt);
            }
        });

        comboMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMarcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelContenidoLayout = new javax.swing.GroupLayout(panelContenido);
        panelContenido.setLayout(panelContenidoLayout);
        panelContenidoLayout.setHorizontalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cajaModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                            .addComponent(lbModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                            .addComponent(lbMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                            .addComponent(lbColor, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                            .addComponent(cajaPlaca)
                            .addComponent(cajaColor))))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        panelContenidoLayout.setVerticalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbMarca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbColor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cajaColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPlaca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cajaPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbModelo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cajaModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panelBotones.setBackground(new java.awt.Color(255, 102, 102));

        btnGuardar.setBackground(new java.awt.Color(242, 242, 242));
        btnGuardar.setText("Aceptar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelarOperacion.setBackground(new java.awt.Color(242, 242, 242));
        btnCancelarOperacion.setText("Cancelar");
        btnCancelarOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarOperacionActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelarOperacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir)
                .addGap(12, 12, 12))
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnCancelarOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelContenido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBotones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cajaColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaColorActionPerformed

    private void cajaPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaPlacaActionPerformed

    private void cajaModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaModeloActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.cerrarVentana();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String color, placa, modelo;
        int marca = comboMarca.getSelectedIndex();

        color = cajaColor.getText();
        placa = cajaPlaca.getText();
        modelo = cajaModelo.getText();

        if (color.isEmpty() || placa.isEmpty() || modelo.isEmpty()) {
            JOptionPane.showMessageDialog(panelPrincipal, " No se puede crear la moto, Faltan datos", "Advertencia",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            int codigo = arregloMotos.size() + 1;

            Moto motoNueva = new Moto(codigo, arregloMarquitas[marca], modelo, placa, color);
            arregloMotos.add(motoNueva);

            limpiarCajas();

            JOptionPane.showMessageDialog(panelPrincipal, "Moto creada", "Exito!!",
                    JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarOperacionActionPerformed

        int opcion = 0;
        String[] textoBotones = {"Aceptar", "Cancelar"};
        opcion = JOptionPane.showOptionDialog(panelPrincipal, "Estas seguro de cancelar la operacion?",
                "Cancelar aplicacion",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null, textoBotones, textoBotones[1]);

        if (opcion == JOptionPane.YES_OPTION) {
            limpiarCajas();
        }

        limpiarCajas();
    }//GEN-LAST:event_btnCancelarOperacionActionPerformed


    private void comboMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMarcaActionPerformed


    }//GEN-LAST:event_comboMarcaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarOperacion;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField cajaColor;
    private javax.swing.JTextField cajaModelo;
    private javax.swing.JTextField cajaPlaca;
    private javax.swing.JComboBox<String> comboMarca;
    private javax.swing.JLabel lbColor;
    private javax.swing.JLabel lbMarca;
    private javax.swing.JLabel lbModelo;
    private javax.swing.JLabel lbPlaca;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelTitulo;
    // End of variables declaration//GEN-END:variables
}
