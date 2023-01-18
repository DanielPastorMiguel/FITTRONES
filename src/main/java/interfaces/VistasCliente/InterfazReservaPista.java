/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces.VistasCliente;

import interfaces.VistasAdmin.*;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.AlquilerDecorator.Pista;
import modelos.Aplicacion;
import utiles.Excepcion;
import utiles.ModeloTabla;

/**
 *
 * @author Octavian
 */
public class InterfazReservaPista extends javax.swing.JFrame {

    /**
     * Creates new form ConsultarReservas
     */
    public InterfazReservaPista() {
        initComponents();
        inicializarTabla();
        jComboBoxTipoPista.setSelectedIndex(0);
    }

    private void inicializarTabla() {
        tabla.getTableHeader().setReorderingAllowed(false);
        String[] columnas = {"Nº Pista", "16:00-17:00", "17:00-18:00", "18:00-19:00", "19:00-20:00", "20:00-21:00", "21:00-22:00"};

        modeloTabla = new ModeloTabla(null, columnas);

        tabla.setModel(modeloTabla);
    }

    private void rellenarTabla(DefaultTableModel modeloTabla, List<Pista> pistas, utiles.Enum.DiaEnum dia) {
        try {
            Object[] filaTabla = new Object[7];
            for (Pista pista : pistas) {
                filaTabla[0] = pista.getNumPista();
                switch (String.valueOf(dia)) {
                    case "LUNES":
                        if (pista.getAlquilerLunes().get("16:00-17:00") == null) filaTabla[1] = "Libre";
                        else filaTabla[1] = "Ocupado";
                        if (pista.getAlquilerLunes().get("17:00-18:00") == null) filaTabla[2] = "Libre";
                        else filaTabla[2] = "Ocupado";
                        if (pista.getAlquilerLunes().get("18:00-19:00") == null) filaTabla[3] = "Libre";
                        else filaTabla[3] = "Ocupado";
                        if (pista.getAlquilerLunes().get("19:00-20:00") == null) filaTabla[4] = "Libre";
                        else filaTabla[4] = "Ocupado";
                        if (pista.getAlquilerLunes().get("20:00-21:00") == null) filaTabla[5] = "Libre";
                        else filaTabla[5] = "Ocupado";
                        if (pista.getAlquilerLunes().get("21:00-22:00") == null) filaTabla[6] = "Libre";
                        else filaTabla[6] = "Ocupado";
                        break;
                    case "MARTES":
                        if (pista.getAlquilerMartes().get("16:00-17:00") == null) filaTabla[1] = "Libre";
                        else filaTabla[1] = "Ocupado";
                        if (pista.getAlquilerMartes().get("17:00-18:00") == null) filaTabla[2] = "Libre";
                        else filaTabla[2] = "Ocupado";
                        if (pista.getAlquilerMartes().get("18:00-19:00") == null) filaTabla[3] = "Libre";
                        else filaTabla[3] = "Ocupado";
                        if (pista.getAlquilerMartes().get("19:00-20:00") == null) filaTabla[4] = "Libre";
                        else filaTabla[4] = "Ocupado";
                        if (pista.getAlquilerMartes().get("20:00-21:00") == null) filaTabla[5] = "Libre";
                        else filaTabla[5] = "Ocupado";
                        if (pista.getAlquilerMartes().get("21:00-22:00") == null) filaTabla[6] = "Libre";
                        else filaTabla[6] = "Ocupado";
                        break;
                    case "MIERCOLES":
                        if (pista.getAlquilerMiercoles().get("16:00-17:00") == null) filaTabla[1] = "Libre";
                        else filaTabla[1] = "Ocupado";
                        if (pista.getAlquilerMiercoles().get("17:00-18:00") == null) filaTabla[2] = "Libre";
                        else filaTabla[2] = "Ocupado";
                        if (pista.getAlquilerMiercoles().get("18:00-19:00") == null) filaTabla[3] = "Libre";
                        else filaTabla[3] = "Ocupado";
                        if (pista.getAlquilerMiercoles().get("19:00-20:00") == null) filaTabla[4] = "Libre";
                        else filaTabla[4] = "Ocupado";
                        if (pista.getAlquilerMiercoles().get("20:00-21:00") == null) filaTabla[5] = "Libre";
                        else filaTabla[5] = "Ocupado";
                        if (pista.getAlquilerMiercoles().get("21:00-22:00") == null) filaTabla[6] = "Libre";
                        else filaTabla[6] = "Ocupado";
                        break;
                    case "JUEVES":
                        if (pista.getAlquilerJueves().get("16:00-17:00") == null) filaTabla[1] = "Libre";
                        else filaTabla[1] = "Ocupado";
                        if (pista.getAlquilerJueves().get("17:00-18:00") == null) filaTabla[2] = "Libre";
                        else filaTabla[2] = "Ocupado";
                        if (pista.getAlquilerJueves().get("18:00-19:00") == null) filaTabla[3] = "Libre";
                        else filaTabla[3] = "Ocupado";
                        if (pista.getAlquilerJueves().get("19:00-20:00") == null) filaTabla[4] = "Libre";
                        else filaTabla[4] = "Ocupado";
                        if (pista.getAlquilerJueves().get("20:00-21:00") == null) filaTabla[5] = "Libre";
                        else filaTabla[5] = "Ocupado";
                        if (pista.getAlquilerJueves().get("21:00-22:00") == null) filaTabla[6] = "Libre";
                        else filaTabla[6] = "Ocupado";
                        break;
                    case "VIERNES":
                        if (pista.getAlquilerViernes().get("16:00-17:00") == null) filaTabla[1] = "Libre";
                        else filaTabla[1] = "Ocupado";
                        if (pista.getAlquilerViernes().get("17:00-18:00") == null) filaTabla[2] = "Libre";
                        else filaTabla[2] = "Ocupado";
                        if (pista.getAlquilerViernes().get("18:00-19:00") == null) filaTabla[3] = "Libre";
                        else filaTabla[3] = "Ocupado";
                        if (pista.getAlquilerViernes().get("19:00-20:00") == null) filaTabla[4] = "Libre";
                        else filaTabla[4] = "Ocupado";
                        if (pista.getAlquilerViernes().get("20:00-21:00") == null) filaTabla[5] = "Libre";
                        else filaTabla[5] = "Ocupado";
                        if (pista.getAlquilerViernes().get("21:00-22:00") == null) filaTabla[6] = "Libre";
                        else filaTabla[6] = "Ocupado";
                        break;
                    default:
                        break;
                }
                modeloTabla.addRow(filaTabla);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxTipoPista = new javax.swing.JComboBox<>();
        jComboBoxDia = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Reservas");

        jLabel2.setText("Tipo de pista");

        jLabel3.setText("Seleccionar dia");

        jComboBoxTipoPista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PADEL", "FUTBOL" }));
        jComboBoxTipoPista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoPistaActionPerformed(evt);
            }
        });

        jComboBoxDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES" }));
        jComboBoxDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDiaActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxTipoPista, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jButton1)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxTipoPista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxTipoPistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoPistaActionPerformed
        
    }//GEN-LAST:event_jComboBoxTipoPistaActionPerformed

    private void jComboBoxDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDiaActionPerformed

    }//GEN-LAST:event_jComboBoxDiaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        vaciarTabla();
        if (String.valueOf(jComboBoxTipoPista.getSelectedItem()).equals("PADEL")) rellenarTabla(modeloTabla, app.getPistasPadel(), utiles.Enum.DiaEnum.valueOf(String.valueOf(jComboBoxDia.getSelectedItem())));
        else rellenarTabla(modeloTabla, app.getPistasFutbol(), utiles.Enum.DiaEnum.valueOf(String.valueOf(jComboBoxDia.getSelectedItem())));
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMousePressed
        int pista = tabla.rowAtPoint(evt.getPoint());
        int hora = tabla.columnAtPoint(evt.getPoint()) - 1;
        
        String[] horas = {"16:00-17:00", "17:00-18:00", "18:00-19:00", "19:00-20:00", "20:00-21:00", "21:00-22:00"};
        
        Object pistaSeleccionada = null; 
        if(String.valueOf(jComboBoxTipoPista.getSelectedItem()).equals("PADEL")){
            switch (String.valueOf(jComboBoxDia.getSelectedItem())) {
                    case "LUNES":
                        pistaSeleccionada = app.getPistasPadel().get(pista).getAlquilerLunes().get(horas[hora]);
                        break;
                    case "MARTES":
                        pistaSeleccionada = app.getPistasPadel().get(pista).getAlquilerMartes().get(horas[hora]);
                        break;
                    case "MIERCOLES":
                        pistaSeleccionada = app.getPistasPadel().get(pista).getAlquilerMiercoles().get(horas[hora]);
                        break;
                    case "JUEVES":
                        pistaSeleccionada = app.getPistasPadel().get(pista).getAlquilerJueves().get(horas[hora]);
                        break;
                    case "VIERNES":
                        pistaSeleccionada = app.getPistasPadel().get(pista).getAlquilerViernes().get(horas[hora]);
                        break;
                    default:
                        break;
            }
        }else{
            switch (String.valueOf(jComboBoxDia.getSelectedItem())) {
                    case "LUNES":
                        pistaSeleccionada = app.getPistasFutbol().get(pista).getAlquilerLunes().get(horas[hora]);
                        break;
                    case "MARTES":
                        pistaSeleccionada = app.getPistasFutbol().get(pista).getAlquilerMartes().get(horas[hora]);
                        break;
                    case "MIERCOLES":
                        pistaSeleccionada = app.getPistasFutbol().get(pista).getAlquilerMiercoles().get(horas[hora]); 
                        break;
                    case "JUEVES":
                        pistaSeleccionada = app.getPistasFutbol().get(pista).getAlquilerJueves().get(horas[hora]);
                        break;
                    case "VIERNES":
                        pistaSeleccionada = app.getPistasFutbol().get(pista).getAlquilerViernes().get(horas[hora]);
                        break;
                    default:
                        break;
            }
        }
        
        if (pistaSeleccionada == null){
            int eleccion=JOptionPane.showOptionDialog(this, "¿Esta seguro de que desea alquilar la pista? ", "Mensaje de confirmación", 0, 0, null, new String[]{"SI", "NO"}, this);     
            if (eleccion==JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(this, "Ha alquilado la pista correctamente", "FITTRONES", JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "La pista se encuentra reservada a la hora seleccionada, por favor, seleccione una hora libre", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tablaMousePressed

    private void vaciarTabla(){
        for (int i=modeloTabla.getRowCount()-1;i>=0;i--){ //tiene que eliminarse de la ultima a la primera, porque si has eliminado varias, quedan 3 y la cuenta va por 4, no puedes eliminar la 4 porque solo quedan 3
            modeloTabla.removeRow(i);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxDia;
    private javax.swing.JComboBox<String> jComboBoxTipoPista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
    ModeloTabla modeloTabla;
    Aplicacion app = Aplicacion.getInstancia();
}
