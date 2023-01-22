package interfaces.VistasCliente;

import java.util.HashMap;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelos.Aplicacion;
import modelos.Usuarios.Cliente;
import modelos.Usuarios.Recepcionista;
import modelos.Usuarios.Socio;
import modelos.Usuarios.Usuario;

public class InterfazVerPerfil extends javax.swing.JFrame {

    private JFrame anterior;
    private Aplicacion app = Aplicacion.getInstancia();
    private Usuario usuario;
    private List<Usuario> listaUsuarios;
    private int i;
    private int max;

    public InterfazVerPerfil(JFrame anterior, Usuario usuario) {
        initComponents();
        this.anterior = anterior;
        this.usuario = usuario;
        inicializarComponentes();
    }
    public InterfazVerPerfil(JFrame anterior, List<Usuario> listaUsuarios) {
        initComponents();
        this.anterior = anterior;
        this.listaUsuarios = listaUsuarios;
        i=0;
        max = listaUsuarios.size();
        this.usuario = listaUsuarios.get(i);
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        String info = "";
        if (anterior.getClass() == VistaUsuarios.class) {
            jButtonSiguiente.setVisible(false);
            if (usuario.getClass() == Cliente.class) {
                jButtonDieta.setVisible(false);
                jButtonRutina.setVisible(false);
                Cliente c = (Cliente) usuario;
                info = c.getInformacionCliente();
            } else if (usuario.getClass() == Socio.class) {
                jButtonDieta.setVisible(true);
                jButtonRutina.setVisible(true);
                Socio s = (Socio) usuario;
                info = s.getInformacionCliente();
            }
        }else{ //recepcionista
            jButtonSiguiente.setVisible(true);
            if (usuario.getClass() == Cliente.class) {
                jButtonDieta.setVisible(false);
                jButtonRutina.setVisible(false);
                Cliente c = (Cliente) usuario;
                Recepcionista r = (Recepcionista) app.getUsuarioLogueado();
                r.setUsuario(c);
                info = r.getInformacionCliente();
            } else if (usuario.getClass() == Socio.class) {
                jButtonDieta.setVisible(true);
                jButtonRutina.setVisible(true);
                Socio s = (Socio) usuario;
                Recepcionista r = (Recepcionista) app.getUsuarioLogueado();
                r.setUsuario(s);
                info = r.getInformacionCliente();
            }
        }
        
        HashMap<String, String> infoMapa = separarDatos(info);
        jTextFieldCorreo.setText(infoMapa.get("Correo"));
        jTextFieldDni.setText(infoMapa.get("Dni"));
        jTextFieldNombre.setText(infoMapa.get("Nombre"));
        jTextFieldTelefono.setText(infoMapa.get("Telefono"));
        jTextFieldFechaNacimiento.setText(infoMapa.get("Fecha nacimiento"));
        if (infoMapa.get("Numero socio") != null) jTextFieldNumeroSocio.setText(infoMapa.get("Numero socio"));
        else jTextFieldNumeroSocio.setEnabled(false);
        if (infoMapa.get("Contraseña") != null) jTextFieldClave.setText(infoMapa.get("Contraseña"));
        else jTextFieldClave.setEnabled(false);
    }
    
    private HashMap<String, String> separarDatos(String datos){
        HashMap<String, String> mapa = new HashMap();
        String[] datosSplit = datos.split(";");
        String[] var;
        for (int i=0; i<datosSplit.length; i++){
            var = datosSplit[i].split(":");
            mapa.put(var[0], var[1]);
        }
        return mapa;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAtras = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldDni = new javax.swing.JTextField();
        jTextFieldCorreo = new javax.swing.JTextField();
        jTextFieldClave = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldNumeroSocio = new javax.swing.JTextField();
        jButtonVerServicios = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldFechaNacimiento = new javax.swing.JTextField();
        jButtonSiguiente = new javax.swing.JButton();
        jButtonRutina = new javax.swing.JButton();
        jButtonDieta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jButtonAtras.setText("Atras");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("DNI");

        jLabel3.setText("Correo");

        jLabel4.setText("Clave");

        jLabel5.setText("Telefono");

        jLabel6.setText("Nº socio");

        jTextFieldNombre.setEditable(false);

        jTextFieldDni.setEditable(false);

        jTextFieldCorreo.setEditable(false);

        jTextFieldClave.setEditable(false);

        jTextFieldTelefono.setEditable(false);

        jTextFieldNumeroSocio.setEditable(false);

        jButtonVerServicios.setText("Ver servicios adquiridos");
        jButtonVerServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerServiciosActionPerformed(evt);
            }
        });

        jLabel7.setText("Fecha Nacimiento");

        jTextFieldFechaNacimiento.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNumeroSocio, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(jTextFieldFechaNacimiento)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldClave, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jButtonVerServicios)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldNumeroSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonVerServicios)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jButtonSiguiente.setText("Siguiente");
        jButtonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguienteActionPerformed(evt);
            }
        });

        jButtonRutina.setText("Ver rutina");
        jButtonRutina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRutinaActionPerformed(evt);
            }
        });

        jButtonDieta.setText("Ver dieta");
        jButtonDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDietaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAtras)
                        .addGap(151, 151, 151)
                        .addComponent(jButtonSiguiente)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jButtonRutina)
                .addGap(42, 42, 42)
                .addComponent(jButtonDieta)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRutina)
                    .addComponent(jButtonDieta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAtras)
                    .addComponent(jButtonSiguiente))
                .addGap(12, 12, 12))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        if (anterior.getClass() == VistaUsuarios.class) {
            this.setVisible(false);
            anterior.setVisible(true);
        }else{
            if (i==0) i=max-1;
            else i--;
            usuario = listaUsuarios.get(i);
            inicializarComponentes();
        }
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.setVisible(false);
        anterior.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void jButtonVerServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerServiciosActionPerformed
        new InterfazServiciosAdquiridos(this, usuario, "SERVICIOS").setVisible(true);
    }//GEN-LAST:event_jButtonVerServiciosActionPerformed

    private void jButtonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguienteActionPerformed
        if (i == max-1) i=0;
        else i++;
        usuario = listaUsuarios.get(i);
        inicializarComponentes();
    }//GEN-LAST:event_jButtonSiguienteActionPerformed

    private void jButtonRutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRutinaActionPerformed
        Socio s = (Socio) usuario;
        if (s.getRutina() == null) JOptionPane.showMessageDialog(this, "Error, no dispone de rutina, pida a un monitor de sala una si la desea", "FITTRONES", JOptionPane.ERROR_MESSAGE);
        else new InterfazServiciosAdquiridos(this, usuario, "RUTINA").setVisible(true);
    }//GEN-LAST:event_jButtonRutinaActionPerformed

    private void jButtonDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDietaActionPerformed
        Socio s = (Socio) usuario;
        if (s.getDieta()== null) JOptionPane.showMessageDialog(this, "Error, no dispone de dieta, pida a un monitor de sala una si la desea", "FITTRONES", JOptionPane.ERROR_MESSAGE);
        else new InterfazServiciosAdquiridos(this, usuario, "DIETA").setVisible(true);
    }//GEN-LAST:event_jButtonDietaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonDieta;
    private javax.swing.JButton jButtonRutina;
    private javax.swing.JButton jButtonSiguiente;
    private javax.swing.JButton jButtonVerServicios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldClave;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldDni;
    private javax.swing.JTextField jTextFieldFechaNacimiento;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldNumeroSocio;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables

}
