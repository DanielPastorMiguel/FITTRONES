package interfaces.VistasAdmin;

import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelos.Actividad;
import modelos.Aplicacion;
import utiles.Enum.ActividadEnum;
import utiles.Enum.DiaEnum;

public class InterfazCrearActividad extends javax.swing.JFrame {

    private JFrame anterior;
    private Aplicacion app = Aplicacion.getInstancia();
    
    public InterfazCrearActividad(JFrame anterior) {
        initComponents();
        this.anterior = anterior;
        anterior.setVisible(false);
    }
    
    private boolean validarAforo(String texto){
        try{
            Integer.valueOf(texto);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxTipo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxDia = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxHora = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldAforo = new javax.swing.JTextField();
        jButtonCrear = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BODY_PUMP", "BOXEO, SPINNING", "YOGA", "DEFENSA_PERSONAL" }));

        jLabel1.setText("Tipo");

        jLabel2.setText("Dia");

        jComboBoxDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES" }));

        jLabel3.setText("Hora");

        jComboBoxHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "17:00", "17:30", "18:00", "18:30", "19:00" }));

        jLabel4.setText("Aforo");

        jButtonCrear.setText("Crear");
        jButtonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Crear actividad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBoxTipo, 0, 1, Short.MAX_VALUE)
                    .addComponent(jComboBoxDia, 0, 138, Short.MAX_VALUE)
                    .addComponent(jComboBoxHora, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldAforo))
                .addGap(85, 85, 85))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jButtonCrear))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel5)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAforo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jButtonCrear)
                .addGap(19, 19, 19))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        anterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosed

    private void jButtonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearActionPerformed
        if (validarAforo(jTextFieldAforo.getText())){
            String[] horaSplit = String.valueOf(jComboBoxHora.getSelectedItem()).split(":");
            Actividad actNueva = new Actividad(DiaEnum.valueOf(String.valueOf(jComboBoxDia.getSelectedItem())), LocalTime.of(Integer.parseInt(horaSplit[0]), Integer.parseInt(horaSplit[1])), new ArrayList<>(), ActividadEnum.valueOf(String.valueOf(jComboBoxTipo.getSelectedItem())), Integer.parseInt(jTextFieldAforo.getText()));
            app.anadirActividad(actNueva);
            JOptionPane.showMessageDialog(this, "La actividad se ha añadido correctamente", "FITTRONES", JOptionPane.INFORMATION_MESSAGE);
            anterior.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(this, "El aforo introducido no es correcto, debe introducir un numero entero", "FITTRONES", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonCrearActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCrear;
    private javax.swing.JComboBox<String> jComboBoxDia;
    private javax.swing.JComboBox<String> jComboBoxHora;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextFieldAforo;
    // End of variables declaration//GEN-END:variables

}
