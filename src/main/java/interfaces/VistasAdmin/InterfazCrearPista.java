package interfaces.VistasAdmin;

import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelos.AlquilerDecorator.Luces;
import modelos.AlquilerDecorator.Material;
import modelos.AlquilerDecorator.Pista;
import modelos.Aplicacion;

public class InterfazCrearPista extends javax.swing.JFrame {

    private JFrame anterior;
    private Aplicacion app = Aplicacion.getInstancia();
    
    public InterfazCrearPista(JFrame anterior) {
        initComponents();
        this.anterior = anterior;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxTipoPista = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCheckBoxLuces = new javax.swing.JCheckBox();
        jCheckBoxMaterial = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jComboBoxTipoPista.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBoxTipoPista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PADEL", "FUTBOL" }));

        jLabel1.setText("Tipo");

        jLabel2.setText("Extras");

        jCheckBoxLuces.setText("Luces");

        jCheckBoxMaterial.setText("Material");

        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("CREAR PISTA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jCheckBoxLuces)
                                    .addGap(18, 18, 18)
                                    .addComponent(jCheckBoxMaterial))
                                .addComponent(jComboBoxTipoPista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jButton1)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxTipoPista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCheckBoxLuces)
                    .addComponent(jCheckBoxMaterial))
                .addGap(47, 47, 47)
                .addComponent(jButton1)
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        anterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String tipoPista = String.valueOf(jComboBoxTipoPista.getSelectedItem());
        boolean luces = jCheckBoxLuces.isSelected();
        boolean material = jCheckBoxMaterial.isSelected();
        Pista nuevaPista = null;
        if(tipoPista.equals("PADEL")) {
            if (app.getPistasPadel().isEmpty()){ //si no hay ninguna pista para clonar
                nuevaPista = new Pista(
                    new HashMap<>() {{put("16:00-17:00", null); put("17:00-18:00", null); put("18:00-19:00", null); put("19:00-20:00", null); put("21:00-22:00", null);}},
                    new HashMap<>() {{put("16:00-17:00", null); put("17:00-18:00", null); put("18:00-19:00", null); put("19:00-20:00", null); put("21:00-22:00", null);}},
                    new HashMap<>() {{put("16:00-17:00", null); put("17:00-18:00", null); put("18:00-19:00", null); put("19:00-20:00", null); put("21:00-22:00", null);}},
                    new HashMap<>() {{put("16:00-17:00", null); put("17:00-18:00", null); put("18:00-19:00", null); put("19:00-20:00", null); put("21:00-22:00", null);}},
                    new HashMap<>() {{put("16:00-17:00", null); put("17:00-18:00", null); put("18:00-19:00", null); put("19:00-20:00", null); put("21:00-22:00", null);}},
                    1,
                    "",
                    "PADEL"
                );
            }else{
                try {
                    nuevaPista = (Pista) app.getPistasPadel().get(0).clone();
                    app.vaciarPista(nuevaPista);
                    nuevaPista.setNumPista(app.getPistasPadel().size()+1);
                } catch (CloneNotSupportedException ex) {
                    JOptionPane.showMessageDialog(this, "Ha surgido un error a la hora de crear una pista a traves de la clonacion de una existente", "FITTRONES", JOptionPane.ERROR_MESSAGE);
                }
            }
        }else{
            if (app.getPistasFutbol().isEmpty()){ //si no hay ninguna pista para clonar
                nuevaPista = new Pista(
                    new HashMap<>() {{put("16:00-17:00", null); put("17:00-18:00", null); put("18:00-19:00", null); put("19:00-20:00", null); put("21:00-22:00", null);}},
                    new HashMap<>() {{put("16:00-17:00", null); put("17:00-18:00", null); put("18:00-19:00", null); put("19:00-20:00", null); put("21:00-22:00", null);}},
                    new HashMap<>() {{put("16:00-17:00", null); put("17:00-18:00", null); put("18:00-19:00", null); put("19:00-20:00", null); put("21:00-22:00", null);}},
                    new HashMap<>() {{put("16:00-17:00", null); put("17:00-18:00", null); put("18:00-19:00", null); put("19:00-20:00", null); put("21:00-22:00", null);}},
                    new HashMap<>() {{put("16:00-17:00", null); put("17:00-18:00", null); put("18:00-19:00", null); put("19:00-20:00", null); put("21:00-22:00", null);}},
                    1,
                    "",
                    "FUTBOL"
                );
            }else{
                try {
                    nuevaPista = (Pista) app.getPistasFutbol().get(0).clone();
                    app.vaciarPista(nuevaPista);
                    nuevaPista.setNumPista(app.getPistasFutbol().size()+1);
                } catch (CloneNotSupportedException ex) {
                    JOptionPane.showMessageDialog(this, "Ha surgido un error a la hora de crear una pista a traves de la clonacion de una existente", "FITTRONES", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        if (luces) nuevaPista = new Luces(nuevaPista);
        if (material) nuevaPista = new Material(nuevaPista);
        app.anadirPista(nuevaPista);
        JOptionPane.showMessageDialog(this, "Se ha añadido la pista correctamente", "FITTRONES", JOptionPane.INFORMATION_MESSAGE);
        anterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBoxLuces;
    private javax.swing.JCheckBox jCheckBoxMaterial;
    private javax.swing.JComboBox<String> jComboBoxTipoPista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

}
