package interfaces;

import interfaces.VistasAdmin.InterfazAdmin;
import interfaces.VistasCliente.VistaUsuarios;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import modelos.Actividad;
import modelos.Aplicacion;
import modelos.Clase;
import modelos.Usuarios.Cliente;
import modelos.Usuarios.Monitor;
import modelos.Usuarios.Profesor;
import modelos.Usuarios.Recepcionista;
import modelos.Usuarios.Socio;
import modelos.Usuarios.Usuario;
import utiles.Enum.LoginEnum;
import utiles.Excepcion;
import interfaces.VistasCliente.InterfazBuscarClase;

public class VentanaLogin extends javax.swing.JFrame {

    private Usuario usuario;

    public VentanaLogin() {
        //Aplicacion.cargarDatos();
        initComponents();
        scrollLaminaRegistrarse.setVisible(false);
        inicializarDatos();

    }

    private void inicializarDatos() {
        Cliente c1 = new Cliente("123", "c1", "", LocalDate.of(2001, 5, 7), "", "");
        Cliente c2 = new Cliente("123", "c2", "", LocalDate.of(2002, 5, 17), "", "");
        Cliente c3 = new Cliente("123", "c3", "", LocalDate.of(2000, 7, 2), "", "");
        
        Socio s1 = new Socio("123", "s1", "", LocalDate.of(1999, 2, 13), "", "");
        Socio s2 = new Socio("123", "s2", "", LocalDate.of(1998, 12, 3), "", "");
        Socio s3 = new Socio("123", "s3", "", LocalDate.of(2000, 2, 5), "", "");

        Actividad act1 = new Actividad(utiles.Enum.DiaEnum.LUNES, LocalTime.of(10, 30), new ArrayList<>(), utiles.Enum.ActividadEnum.BODY_PUMP);
        Actividad act2 = new Actividad(utiles.Enum.DiaEnum.LUNES, LocalTime.of(17, 0), new ArrayList<>(), utiles.Enum.ActividadEnum.BOXEO);
        Actividad act3 = new Actividad(utiles.Enum.DiaEnum.MARTES, LocalTime.of(10, 30), new ArrayList<>(), utiles.Enum.ActividadEnum.SPINNING);
        Actividad act4 = new Actividad(utiles.Enum.DiaEnum.MARTES, LocalTime.of(17, 0), new ArrayList<>(), utiles.Enum.ActividadEnum.BODY_PUMP);
        Actividad act5 = new Actividad(utiles.Enum.DiaEnum.MIERCOLES, LocalTime.of(10, 30), new ArrayList<>(), utiles.Enum.ActividadEnum.YOGA);
        Actividad act6 = new Actividad(utiles.Enum.DiaEnum.MIERCOLES, LocalTime.of(17, 0), new ArrayList<>(), utiles.Enum.ActividadEnum.BOXEO);
        Actividad act7 = new Actividad(utiles.Enum.DiaEnum.JUEVES, LocalTime.of(10, 30), new ArrayList<>(), utiles.Enum.ActividadEnum.SPINNING);
        Actividad act8 = new Actividad(utiles.Enum.DiaEnum.JUEVES, LocalTime.of(17, 0), new ArrayList<>(), utiles.Enum.ActividadEnum.DEFENSA_PERSONAL);
        Actividad act9 = new Actividad(utiles.Enum.DiaEnum.VIERNES, LocalTime.of(12, 0), new ArrayList<>(), utiles.Enum.ActividadEnum.YOGA);

        Monitor m1 = new Monitor(new ArrayList<>(), new ArrayList<>(Arrays.asList(act1, act4, act3, act7)), utiles.Enum.TurnoEnum.MAÑANA, "123", "m1", "", LocalDate.of(1990, 5, 12), "", "");
        Monitor m2 = new Monitor(new ArrayList<>(), new ArrayList<>(Arrays.asList(act2, act6, act8)), utiles.Enum.TurnoEnum.TARDE, "123", "m2", "", LocalDate.of(1993, 7, 2), "", "");
        Monitor m3 = new Monitor(new ArrayList<>(), new ArrayList<>(Arrays.asList(act5, act9)), utiles.Enum.TurnoEnum.MAÑANA, "123", "m3", "", LocalDate.of(1986, 2, 5), "", "");
            
        Clase claseFutbol1 = new Clase(new HashMap<>() {{put(utiles.Enum.DiaEnum.MIERCOLES, LocalTime.of(19, 0));}}, utiles.Enum.NivelFutbolEnum.BENJAMIN, utiles.Enum.PistaFutbolEnum.PISTA1, utiles.Enum.ClaseEnum.FUTBOL, 10, new ArrayList<>());
        Clase claseFutbol2 = new Clase(new HashMap<>() {{put(utiles.Enum.DiaEnum.MARTES, LocalTime.of(19, 0)); put(utiles.Enum.DiaEnum.VIERNES, LocalTime.of(19, 0));}}, utiles.Enum.NivelFutbolEnum.CADETE, utiles.Enum.PistaFutbolEnum.PISTA1, utiles.Enum.ClaseEnum.FUTBOL, 13, new ArrayList<>());
        Clase claseFutbol3 = new Clase(new HashMap<>() {{put(utiles.Enum.DiaEnum.LUNES, LocalTime.of(19, 0)); put(utiles.Enum.DiaEnum.JUEVES, LocalTime.of(19, 0));}}, utiles.Enum.NivelFutbolEnum.SENIOR, utiles.Enum.PistaFutbolEnum.PISTA1, utiles.Enum.ClaseEnum.FUTBOL, 17, new ArrayList<>());
        
        Clase clasePadel1 = new Clase(new HashMap<>() {{put(utiles.Enum.DiaEnum.MIERCOLES, LocalTime.of(19, 0));}}, utiles.Enum.NivelPadelNatacionEnum.PRINCIPIANTE, utiles.Enum.PistaPadelEnum.PISTA1, utiles.Enum.ClaseEnum.PADEL, 7, new ArrayList<>());
        Clase clasePadel2 = new Clase(new HashMap<>() {{put(utiles.Enum.DiaEnum.MARTES, LocalTime.of(19, 0)); put(utiles.Enum.DiaEnum.VIERNES, LocalTime.of(19, 0));}}, utiles.Enum.NivelPadelNatacionEnum.INTERMEDIO, utiles.Enum.PistaPadelEnum.PISTA1, utiles.Enum.ClaseEnum.PADEL, 7, new ArrayList<>());
        Clase clasePadel3 = new Clase(new HashMap<>() {{put(utiles.Enum.DiaEnum.LUNES, LocalTime.of(19, 0)); put(utiles.Enum.DiaEnum.JUEVES, LocalTime.of(19, 0));}}, utiles.Enum.NivelPadelNatacionEnum.AVANZADO, utiles.Enum.PistaPadelEnum.PISTA1, utiles.Enum.ClaseEnum.PADEL, 7, new ArrayList<>());
        
        Clase claseNatacion1 = new Clase(new HashMap<>() {{put(utiles.Enum.DiaEnum.MIERCOLES, LocalTime.of(19, 0));}}, utiles.Enum.NivelPadelNatacionEnum.PRINCIPIANTE, utiles.Enum.PistaNatacionEnum.PISTA1, utiles.Enum.ClaseEnum.NATACION, 5, new ArrayList<>());
        Clase claseNatacion2 = new Clase(new HashMap<>() {{put(utiles.Enum.DiaEnum.MARTES, LocalTime.of(19, 0)); put(utiles.Enum.DiaEnum.VIERNES, LocalTime.of(19, 0));}}, utiles.Enum.NivelPadelNatacionEnum.INTERMEDIO, utiles.Enum.PistaNatacionEnum.PISTA1, utiles.Enum.ClaseEnum.NATACION, 5, new ArrayList<>());
        Clase claseNatacion3 = new Clase(new HashMap<>() {{put(utiles.Enum.DiaEnum.LUNES, LocalTime.of(19, 0)); put(utiles.Enum.DiaEnum.JUEVES, LocalTime.of(19, 0));}}, utiles.Enum.NivelPadelNatacionEnum.AVANZADO, utiles.Enum.PistaNatacionEnum.PISTA1, utiles.Enum.ClaseEnum.NATACION, 5, new ArrayList<>());
        
        Profesor p1 = new Profesor(utiles.Enum.TurnoEnum.TARDE, "123", "p1", "", LocalDate.of(1985, 5, 10), "", "", new ArrayList<>(Arrays.asList(claseFutbol1, claseFutbol2, claseFutbol3)));
        Profesor p2 = new Profesor(utiles.Enum.TurnoEnum.TARDE, "123", "p2", "", LocalDate.of(1987, 5, 8), "", "", new ArrayList<>(Arrays.asList(clasePadel1, clasePadel2, clasePadel3)));
        Profesor p3 = new Profesor(utiles.Enum.TurnoEnum.TARDE, "123", "p3", "", LocalDate.of(1985, 5, 3), "", "", new ArrayList<>(Arrays.asList(claseNatacion1, claseNatacion2, claseNatacion3)));
        
        Recepcionista r1 = new Recepcionista(utiles.Enum.TurnoEnum.MAÑANA, "123", "r1", "", LocalDate.of(1988, 5, 7), "", "");
        Recepcionista r2 = new Recepcionista(utiles.Enum.TurnoEnum.TARDE, "123", "r2", "", LocalDate.of(1985, 4, 7), "", "");
        
        try {
            app.registrarUsuario(c1);
            app.registrarUsuario(c2);
            app.registrarUsuario(c3);
            app.registrarUsuario(s1);
            app.registrarUsuario(s2);
            app.registrarUsuario(s3);
            app.registrarUsuario(m1);
            app.registrarUsuario(m2);
            app.registrarUsuario(m3);
            app.registrarUsuario(p1);
            app.registrarUsuario(p2);
            app.registrarUsuario(p3);
            app.registrarUsuario(r1);
            app.registrarUsuario(r2);
            
            app.anadirActividad(act1);
            app.anadirActividad(act2);
            app.anadirActividad(act3);
            app.anadirActividad(act4);
            app.anadirActividad(act5);
            app.anadirActividad(act6);
            app.anadirActividad(act7);
            app.anadirActividad(act8);
            app.anadirActividad(act9);
            
            app.anadirClase(claseFutbol1);
            app.anadirClase(claseFutbol2);
            app.anadirClase(claseFutbol3);
            app.anadirClase(clasePadel1);
            app.anadirClase(clasePadel2);
            app.anadirClase(clasePadel3);
            app.anadirClase(claseNatacion1);
            app.anadirClase(claseNatacion2);
            app.anadirClase(claseNatacion3);
        }catch (Excepcion ex) {
            System.out.println("Excepcion: "+ex.toString());
        }
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
        jButton1 = new javax.swing.JButton();
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

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                                .addComponent(checkBoxMostrarContraseña))))
                    .addGroup(laminaLoginLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jButton1)))
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
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addGap(40, 40, 40)
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
        
        if (iniciarSesion == LoginEnum.ADMIN){
            System.out.println("admin");
            InterfazAdmin iadmin = new InterfazAdmin();
            iadmin.setVisible(true);
            this.dispose();
        }
        else if (iniciarSesion == LoginEnum.SOCIO){
            System.out.println("socio");
            VistaUsuarios vu = new VistaUsuarios();
            vu.setVisible(true);
            this.dispose();
        }
        else if (iniciarSesion == LoginEnum.CLIENTE){
            System.out.println("cliente");
            VistaUsuarios vu = new VistaUsuarios();
            vu.setVisible(true);

            this.dispose();
        }
        else if (iniciarSesion == LoginEnum.MONITOR){
            System.out.println("monitor");
            VistaUsuarios vu = new VistaUsuarios();
            vu.setVisible(true);

            this.dispose();
        }
        else if (iniciarSesion == LoginEnum.PROFESOR){
            System.out.println("profesor");
            VistaUsuarios vu = new VistaUsuarios();
            vu.setVisible(true);

            this.dispose();
        }
        else if (iniciarSesion == LoginEnum.RECEPCIONISTA){
            System.out.println("recepcionista");
            VistaUsuarios vu = new VistaUsuarios();
            vu.setVisible(true);

            this.dispose();
        }
        else if (iniciarSesion == LoginEnum.ERROR_CONTRASENA) {
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new InterfazBuscarClase().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton jButton1;
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
