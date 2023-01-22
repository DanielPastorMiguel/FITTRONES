/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces.VistasCliente;

import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelos.Actividad;
import modelos.Aplicacion;
import modelos.OrdenadoActividadesStrategy.OrdenarDia;
import modelos.OrdenadoActividadesStrategy.OrdenarHorario;
import modelos.OrdenadoActividadesStrategy.OrdenarTipo;
import utiles.ModeloTabla;

/**
 *
 * @author docto
 */
public class InterfazReservaActividades extends javax.swing.JFrame {

    private JFrame principal;
    private ModeloTabla modeloTabla;
    private Aplicacion app = Aplicacion.getInstancia();
    private String estado;

    /**
     * Creates new form InterfazReservaActividades
     *
     * @param ventana
     */
    public InterfazReservaActividades(JFrame ventana, String estado) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.estado = estado;
        principal = ventana;
        principal.setVisible(false);
        this.setVisible(true);
        inicializarTabla();
        inicializarVentana();
    }
    
    private void inicializarVentana(){
        if (estado.equals("RESERVAR")){
            jComboBoxOrdenado.setSelectedIndex(0);
            jLabelOrdenar.setText("Ordenar");
        } 
        else{
            jComboBoxOrdenado.setVisible(false);
            jLabelOrdenar.setText("Mis actividades");
            rellenarTabla(app.getActividadesUsuario(app.getUsuarioLogueado()));
        } 
    }

    private void inicializarTabla() {
        tabla.getTableHeader().setReorderingAllowed(false);
        String[] columnas = {"Tipo", "Dia", "Hora", "Plazas libres"};

        modeloTabla = new ModeloTabla(null, columnas);

        tabla.setModel(modeloTabla);
    }

    private void rellenarTabla(List<Actividad> actividades) {
        try {
            Object[] filaTabla = new Object[4];
            for (Actividad act : actividades) {
                filaTabla[0] = act.getTipo();
                filaTabla[1] = act.getDia();
                filaTabla[2] = act.getHora();
                filaTabla[3] = act.getAforo() - act.getUsuariosInscritos().size();
                modeloTabla.addRow(filaTabla);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    private void vaciarTabla() {
        for (int i = modeloTabla.getRowCount() - 1; i >= 0; i--) { //tiene que eliminarse de la ultima a la primera, porque si has eliminado varias, quedan 3 y la cuenta va por 4, no puedes eliminar la 4 porque solo quedan 3
            modeloTabla.removeRow(i);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabelOrdenar = new javax.swing.JLabel();
        jComboBoxOrdenado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        tabla.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tipo", "Dia", "Hora", "Plazas libres"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jLabelOrdenar.setText("Ordenar:");

        jComboBoxOrdenado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia", "Horario", "Tipo" }));
        jComboBoxOrdenado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOrdenadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 887, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelOrdenar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxOrdenado, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(386, 386, 386))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelOrdenar)
                    .addComponent(jComboBoxOrdenado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        principal.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void jComboBoxOrdenadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOrdenadoActionPerformed
        vaciarTabla();
        switch (String.valueOf(jComboBoxOrdenado.getSelectedItem())) {
            case "Horario":
                app.setEstrategiaOrdenadoActividades(new OrdenarHorario());
                app.ejecutarEstrategiaOrdenadoActividades();
                break;
            case "Tipo":
                app.setEstrategiaOrdenadoActividades(new OrdenarTipo());
                app.ejecutarEstrategiaOrdenadoActividades();
                break;
            default:
                app.setEstrategiaOrdenadoActividades(new OrdenarDia());
                app.ejecutarEstrategiaOrdenadoActividades();
                break;

        }
        rellenarTabla(app.getActividades());
    }//GEN-LAST:event_jComboBoxOrdenadoActionPerformed

    private void tablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMousePressed
        if (estado.equals("RESERVAR")) {
            int indiceActividad = tabla.rowAtPoint(evt.getPoint());
            Actividad act = app.getActividades().get(indiceActividad);

            if (act.getAforo() - act.getUsuariosInscritos().size() == 0) {
                JOptionPane.showMessageDialog(this, "La actividad seleccionada esta completa, por favor, seleccione otra actividad", "FITTRONES", JOptionPane.ERROR_MESSAGE);
            } else if (act.getUsuariosInscritos().contains(app.getUsuarioLogueado())) {
                JOptionPane.showMessageDialog(this, "Usted ya estaba apuntado a esta actividad", "FITTRONES", JOptionPane.ERROR_MESSAGE);
            } else {
                int eleccion = JOptionPane.showOptionDialog(this, "¿Esta seguro de que desea apuntarse a la actividad  " + act.getTipo() + " el " + act.getDia() + " a las " + act.getHora() + "?", "Mensaje de confirmación", 0, 0, null, new String[]{"SI", "NO"}, this);
                if (eleccion == JOptionPane.YES_OPTION) {
                    act.inscribirSocio(app.getUsuarioLogueado());
                    JOptionPane.showMessageDialog(this, "Ha alquilado la actividad correctamente", "FITTRONES", JOptionPane.INFORMATION_MESSAGE);
                    vaciarTabla();
                    rellenarTabla(app.getActividades());
                }
            }
        }
    }//GEN-LAST:event_tablaMousePressed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxOrdenado;
    private javax.swing.JLabel jLabelOrdenar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
