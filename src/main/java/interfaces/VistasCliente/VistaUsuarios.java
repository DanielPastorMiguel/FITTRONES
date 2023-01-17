/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces.VistasCliente;

import interfaces.VistasAdmin.ConsultarReservas;
import interfaces.VistasCliente.InterfazBuscarClase;

/**
 *
 * @author Octavian
 */
public class VistaUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form VistaUsuarios
     */
    public VistaUsuarios() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonBusquedaServicios = new javax.swing.JButton();
        jButtonBusquedaEquipo = new javax.swing.JButton();
        jButtonInterfazGimnasio = new javax.swing.JButton();
        jButtonCerrarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jButtonBusquedaServicios.setText("Buscar servicios");
        jButtonBusquedaServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBusquedaServiciosActionPerformed(evt);
            }
        });

        jButtonBusquedaEquipo.setText("Buscar equipo");
        jButtonBusquedaEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBusquedaEquipoActionPerformed(evt);
            }
        });

        jButtonInterfazGimnasio.setText("Interfaz gimnasio");
        jButtonInterfazGimnasio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInterfazGimnasioActionPerformed(evt);
            }
        });

        jButtonCerrarSesion.setText("Cerrar sesión");
        jButtonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarSesionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Bienvenido");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonBusquedaServicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonBusquedaEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonInterfazGimnasio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel1)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jButtonBusquedaServicios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBusquedaEquipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonInterfazGimnasio)
                .addGap(28, 28, 28)
                .addComponent(jButtonCerrarSesion)
                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBusquedaServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBusquedaServiciosActionPerformed
        // TODO add your handling code here:
        ConsultarReservas cr = new ConsultarReservas();
        cr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonBusquedaServiciosActionPerformed

    private void jButtonBusquedaEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBusquedaEquipoActionPerformed
        // TODO add your handling code here:
        InterfazBuscarClase ibeq = new InterfazBuscarClase();
        ibeq.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButtonBusquedaEquipoActionPerformed

    private void jButtonInterfazGimnasioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInterfazGimnasioActionPerformed
        // TODO add your handling code here:
        InterfazGimnasio ig = new InterfazGimnasio();
        ig.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonInterfazGimnasioActionPerformed

    private void jButtonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCerrarSesionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBusquedaEquipo;
    private javax.swing.JButton jButtonBusquedaServicios;
    private javax.swing.JButton jButtonCerrarSesion;
    private javax.swing.JButton jButtonInterfazGimnasio;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
