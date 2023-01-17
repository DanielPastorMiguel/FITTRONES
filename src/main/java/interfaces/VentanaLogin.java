package interfaces;

import interfaces.VistasAdmin.InterfazAdmin;
import interfaces.VistasCliente.VistaUsuarios;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;
import modelos.Aplicacion;
import modelos.Usuarios.Cliente;
import modelos.Usuarios.Monitor;
import modelos.Usuarios.Profesor;
import modelos.Usuarios.Recepcionista;
import modelos.Usuarios.Socio;
import modelos.Usuarios.Usuario;
import utiles.Enum.LoginEnum;
import utiles.Excepcion;

public class VentanaLogin extends javax.swing.JFrame {

    private Usuario usuario;

    public VentanaLogin() {
        //Aplicacion.cargarDatos();
        initComponents();
        scrollLaminaRegistrarse.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        laminaLogin = new javax.swing.JPanel();
        textoCorreo = new javax.swing.JLabel();
        textoContrasenna = new javax.swing.JLabel();
        campoCorreo = new javax.swing.JTextField();
        botonIniciarSesion = new javax.swing.JButton();
        textoRegistrarse = new javax.swing.JLabel();
        textoClickAqui = new javax.swing.JLabel();
        campoContrasenna = new javax.swing.JPasswordField();
        checkBoxMostrarContraseña = new javax.swing.JCheckBox();
        scrollLaminaRegistrarse = new javax.swing.JScrollPane();
        laminaRegistrarse = new javax.swing.JPanel();
        laminaBotonRegistrarse = new javax.swing.JPanel();
        botonAtrasRegistrarse = new javax.swing.JButton();
        botonRegistrarse = new javax.swing.JButton();
        laminaObjetosRegistrarse = new javax.swing.JPanel();
        textoTipoCuenta = new javax.swing.JLabel();
        desplegableTipoCliente = new javax.swing.JComboBox<>();
        textoNombreUsuarioRegistro = new javax.swing.JLabel();
        campoNombreUsuarioRegistro = new javax.swing.JTextField();
        textocontrasennaRegistro = new javax.swing.JLabel();
        campoContrasennaRegistro = new javax.swing.JTextField();
        textoDNI = new javax.swing.JLabel();
        campoDNI = new javax.swing.JTextField();
        textoCorreoRegistro = new javax.swing.JLabel();
        campoCorreoRegistro = new javax.swing.JTextField();
        textoTelefono = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JTextField();
        textoFechaNacimiento = new javax.swing.JLabel();
        campoFechaNacimiento = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fittrones");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        laminaLogin.setBackground(new java.awt.Color(83, 82, 83));

        textoCorreo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        textoCorreo.setForeground(new java.awt.Color(255, 255, 255));
        textoCorreo.setText("Correo:");

        textoContrasenna.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        textoContrasenna.setForeground(new java.awt.Color(255, 255, 255));
        textoContrasenna.setText("Contraseña:");

        campoCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoCorreoKeyTyped(evt);
            }
        });

        botonIniciarSesion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonIniciarSesion.setForeground(new java.awt.Color(102, 102, 102));
        botonIniciarSesion.setText("Iniciar Sesión");
        botonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarSesionActionPerformed(evt);
            }
        });

        textoRegistrarse.setForeground(new java.awt.Color(212, 212, 212));
        textoRegistrarse.setText("¿No tienes una cuenta?, regístrate haciendo click ");

        textoClickAqui.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textoClickAqui.setForeground(new java.awt.Color(103, 140, 249));
        textoClickAqui.setText("aquí");
        textoClickAqui.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textoClickAquiMousePressed(evt);
            }
        });

        campoContrasenna.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoContrasennaKeyTyped(evt);
            }
        });

        checkBoxMostrarContraseña.setBackground(new java.awt.Color(83, 82, 83));
        checkBoxMostrarContraseña.setForeground(new java.awt.Color(255, 255, 255));
        checkBoxMostrarContraseña.setText("Mostrar contraseña");
        checkBoxMostrarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxMostrarContraseñaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout laminaLoginLayout = new javax.swing.GroupLayout(laminaLogin);
        laminaLogin.setLayout(laminaLoginLayout);
        laminaLoginLayout.setHorizontalGroup(
            laminaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(laminaLoginLayout.createSequentialGroup()
                .addGroup(laminaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(laminaLoginLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(botonIniciarSesion))
                    .addGroup(laminaLoginLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(textoRegistrarse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoClickAqui))
                    .addGroup(laminaLoginLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(laminaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCorreo)
                            .addComponent(textoContrasenna))
                        .addGap(18, 18, 18)
                        .addGroup(laminaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoCorreo)
                            .addComponent(campoContrasenna, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .addGroup(laminaLoginLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(checkBoxMostrarContraseña)))))
                .addGap(37, 37, 37))
        );
        laminaLoginLayout.setVerticalGroup(
            laminaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(laminaLoginLayout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addGroup(laminaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoCorreo)
                    .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(laminaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoContrasenna)
                    .addComponent(campoContrasenna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(checkBoxMostrarContraseña)
                .addGap(43, 43, 43)
                .addComponent(botonIniciarSesion)
                .addGap(89, 89, 89)
                .addGroup(laminaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoRegistrarse)
                    .addComponent(textoClickAqui))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        scrollLaminaRegistrarse.setBackground(new java.awt.Color(83, 82, 83));

        laminaRegistrarse.setBackground(new java.awt.Color(83, 82, 83));
        laminaRegistrarse.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 20, 1));

        laminaBotonRegistrarse.setBackground(new java.awt.Color(83, 82, 83));
        laminaBotonRegistrarse.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 50, 25, 50));
        laminaBotonRegistrarse.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonAtrasRegistrarse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonAtrasRegistrarse.setText("ATRAS");
        botonAtrasRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasRegistrarseActionPerformed(evt);
            }
        });
        laminaBotonRegistrarse.add(botonAtrasRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 0, -1, -1));

        botonRegistrarse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonRegistrarse.setText("REGISTRARSE");
        botonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarseActionPerformed(evt);
            }
        });
        laminaBotonRegistrarse.add(botonRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 128, -1));

        laminaObjetosRegistrarse.setBackground(new java.awt.Color(83, 82, 83));
        laminaObjetosRegistrarse.setBorder(javax.swing.BorderFactory.createEmptyBorder(35, 10, 30, 0));
        laminaObjetosRegistrarse.setLayout(new java.awt.GridLayout(0, 2, 25, 40));

        textoTipoCuenta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textoTipoCuenta.setForeground(new java.awt.Color(255, 255, 255));
        textoTipoCuenta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textoTipoCuenta.setText("Tipo de cuenta:");
        laminaObjetosRegistrarse.add(textoTipoCuenta);

        desplegableTipoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente normal", "Socio" }));
        desplegableTipoCliente.setSelectedIndex(0);
        laminaObjetosRegistrarse.add(desplegableTipoCliente);

        textoNombreUsuarioRegistro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textoNombreUsuarioRegistro.setForeground(new java.awt.Color(255, 255, 255));
        textoNombreUsuarioRegistro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textoNombreUsuarioRegistro.setText("Nombre de usuario:");
        laminaObjetosRegistrarse.add(textoNombreUsuarioRegistro);
        laminaObjetosRegistrarse.add(campoNombreUsuarioRegistro);

        textocontrasennaRegistro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textocontrasennaRegistro.setForeground(new java.awt.Color(255, 255, 255));
        textocontrasennaRegistro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textocontrasennaRegistro.setText("Contraseña:");
        laminaObjetosRegistrarse.add(textocontrasennaRegistro);
        laminaObjetosRegistrarse.add(campoContrasennaRegistro);

        textoDNI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textoDNI.setForeground(new java.awt.Color(255, 255, 255));
        textoDNI.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textoDNI.setText("DNI:");
        laminaObjetosRegistrarse.add(textoDNI);
        laminaObjetosRegistrarse.add(campoDNI);

        textoCorreoRegistro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textoCorreoRegistro.setForeground(new java.awt.Color(255, 255, 255));
        textoCorreoRegistro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textoCorreoRegistro.setText("Correo electrónico:");
        laminaObjetosRegistrarse.add(textoCorreoRegistro);
        laminaObjetosRegistrarse.add(campoCorreoRegistro);

        textoTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textoTelefono.setForeground(new java.awt.Color(255, 255, 255));
        textoTelefono.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textoTelefono.setText("Telefono");
        laminaObjetosRegistrarse.add(textoTelefono);
        laminaObjetosRegistrarse.add(campoTelefono);

        textoFechaNacimiento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textoFechaNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        textoFechaNacimiento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textoFechaNacimiento.setText("Fecha nacimiento");
        laminaObjetosRegistrarse.add(textoFechaNacimiento);
        laminaObjetosRegistrarse.add(campoFechaNacimiento);

        javax.swing.GroupLayout laminaRegistrarseLayout = new javax.swing.GroupLayout(laminaRegistrarse);
        laminaRegistrarse.setLayout(laminaRegistrarseLayout);
        laminaRegistrarseLayout.setHorizontalGroup(
            laminaRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(laminaObjetosRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(laminaBotonRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        laminaRegistrarseLayout.setVerticalGroup(
            laminaRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(laminaRegistrarseLayout.createSequentialGroup()
                .addComponent(laminaObjetosRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(laminaBotonRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        scrollLaminaRegistrarse.setViewportView(laminaRegistrarse);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(laminaLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(scrollLaminaRegistrarse, javax.swing.GroupLayout.Alignment.TRAILING))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(laminaLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(scrollLaminaRegistrarse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private String arrayCharToString(char[] array) {
        String mensaje = "";
        for (char letra : array) {
            mensaje = mensaje.concat(String.valueOf(letra));
        }
        return mensaje;
    }

    private void botonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarSesionActionPerformed
        Enum iniciarSesion = app.iniciarSesion(campoCorreo.getText(), arrayCharToString(campoContrasenna.getPassword()));
        usuario = Aplicacion.getInstancia().getUsuarioLogueado();

        if (iniciarSesion == LoginEnum.ADMIN) {
            System.out.println("admin");
            InterfazAdmin iadmin = new InterfazAdmin();
            iadmin.setVisible(true);
            this.dispose();

        } else if (iniciarSesion == LoginEnum.SOCIO) {
            System.out.println("socio");
            VistaUsuarios vu = new VistaUsuarios();
            vu.setVisible(true);
            this.dispose();

        } else if (iniciarSesion == LoginEnum.CLIENTE) {
            System.out.println("cliente");
            VistaUsuarios vu = new VistaUsuarios();
            vu.setVisible(true);

            this.dispose();

        } else if (iniciarSesion == LoginEnum.MONITOR) {
            System.out.println("monitor");
            VistaUsuarios vu = new VistaUsuarios();
            vu.setVisible(true);

            this.dispose();

        } else if (iniciarSesion == LoginEnum.PROFESOR) {
            System.out.println("profesor");
            VistaUsuarios vu = new VistaUsuarios();
            vu.setVisible(true);

            this.dispose();

        } else if (iniciarSesion == LoginEnum.RECEPCIONISTA) {
            System.out.println("recepcionista");
            VistaUsuarios vu = new VistaUsuarios();
            vu.setVisible(true);

            this.dispose();

        } else if (iniciarSesion == LoginEnum.ERROR_CONTRASENA) {
            JOptionPane.showMessageDialog(this, "Contraseña incorrecta", "ERROR", JOptionPane.ERROR_MESSAGE);
            campoCorreo.setBackground(Color.white);
            campoContrasenna.setBackground(Color.red);
        } else {
            JOptionPane.showMessageDialog(this, "Correo electrónico incorrecto", "ERROR", JOptionPane.ERROR_MESSAGE);
            campoCorreo.setBackground(Color.red);
            campoContrasenna.setBackground(Color.white);
        }
    }//GEN-LAST:event_botonIniciarSesionActionPerformed

    private void textoClickAquiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoClickAquiMousePressed
        laminaLogin.setVisible(false);
        scrollLaminaRegistrarse.setVisible(true);
    }//GEN-LAST:event_textoClickAquiMousePressed

    private void botonAtrasRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasRegistrarseActionPerformed
        reiniciarCamposLogin();
        laminaLogin.setVisible(true);
        scrollLaminaRegistrarse.setVisible(false);
        scrollLaminaRegistrarse.getVerticalScrollBar().setValue(scrollLaminaRegistrarse.getVerticalScrollBar().getMinimum()); //subir la barra de scroll arriba por si vuelve a darle a registrar
    }//GEN-LAST:event_botonAtrasRegistrarseActionPerformed

    private void checkBoxMostrarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxMostrarContraseñaActionPerformed
        if (checkBoxMostrarContraseña.isSelected()) {
            campoContrasenna.setEchoChar((char) 0);
        } else {
            campoContrasenna.setEchoChar('*');
        }
    }//GEN-LAST:event_checkBoxMostrarContraseñaActionPerformed

    private void botonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarseActionPerformed
        Usuario usuarioNuevo;
        if (desplegableTipoCliente.getSelectedIndex() == 0) {
            usuarioNuevo = new Cliente(campoContrasennaRegistro.getText(), campoCorreoRegistro.getText(), campoDNI.getText(), stringToDate(campoFechaNacimiento.getText()), campoNombreUsuarioRegistro.getText(), campoTelefono.getText());
        } else {
            usuarioNuevo = new Socio(campoContrasennaRegistro.getText(), campoCorreoRegistro.getText(), campoDNI.getText(), stringToDate(campoFechaNacimiento.getText()), campoNombreUsuarioRegistro.getText(), campoTelefono.getText());
        }

        try {
            app.registrarUsuario(usuarioNuevo);
            app.setUsuarioLogueado(usuarioNuevo);
            //VentanaPrincipal ventanaPrincipalCliente = new VentanaPrincipal(Usuario.USUARIO);
            this.dispose();
        } catch (Excepcion ex) {
            JOptionPane.showMessageDialog(this, "Error, " + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonRegistrarseActionPerformed

    private void campoContrasennaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoContrasennaKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            botonIniciarSesion.doClick(); //da un click al boton de iniciar sesion
        }
    }//GEN-LAST:event_campoContrasennaKeyTyped

    private void campoCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCorreoKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            campoContrasenna.requestFocus(); //le pasa el foco al campo contraseña
        }
    }//GEN-LAST:event_campoCorreoKeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        //Aplicacion.guardarDatos();
    }//GEN-LAST:event_formWindowClosing

    private LocalDate stringToDate(String fecha) {
        try {
            String[] fechaSplit = fecha.split("/");
            return LocalDate.of(Integer.parseInt(fechaSplit[2]), Integer.parseInt(fechaSplit[1]), Integer.parseInt(fechaSplit[0]));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "La fecha introducida no es correcta, usar formato 'dia/mes/año'", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    private void reiniciarCamposLogin() {
        campoCorreo.setText("");
        campoContrasenna.setText("");
        campoCorreo.setBackground(Color.white);
        campoContrasenna.setBackground(Color.white);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtrasRegistrarse;
    private javax.swing.JButton botonIniciarSesion;
    private javax.swing.JButton botonRegistrarse;
    private javax.swing.JPasswordField campoContrasenna;
    private javax.swing.JTextField campoContrasennaRegistro;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoCorreoRegistro;
    private javax.swing.JTextField campoDNI;
    private javax.swing.JTextField campoFechaNacimiento;
    private javax.swing.JTextField campoNombreUsuarioRegistro;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JCheckBox checkBoxMostrarContraseña;
    private javax.swing.JComboBox<String> desplegableTipoCliente;
    private javax.swing.JPanel laminaBotonRegistrarse;
    private javax.swing.JPanel laminaLogin;
    private javax.swing.JPanel laminaObjetosRegistrarse;
    private javax.swing.JPanel laminaRegistrarse;
    private javax.swing.JScrollPane scrollLaminaRegistrarse;
    private javax.swing.JLabel textoClickAqui;
    private javax.swing.JLabel textoContrasenna;
    private javax.swing.JLabel textoCorreo;
    private javax.swing.JLabel textoCorreoRegistro;
    private javax.swing.JLabel textoDNI;
    private javax.swing.JLabel textoFechaNacimiento;
    private javax.swing.JLabel textoNombreUsuarioRegistro;
    private javax.swing.JLabel textoRegistrarse;
    private javax.swing.JLabel textoTelefono;
    private javax.swing.JLabel textoTipoCuenta;
    private javax.swing.JLabel textocontrasennaRegistro;
    // End of variables declaration//GEN-END:variables

    private Aplicacion app = Aplicacion.getInstancia();

}
