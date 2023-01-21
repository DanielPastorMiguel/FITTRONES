package interfaces.VistasCliente;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelos.AlquilerDecorator.Pista;
import modelos.Aplicacion;
import modelos.Clase;
import modelos.Usuarios.Socio;
import modelos.Usuarios.Usuario;
import utiles.ModeloTabla;

public class InterfazServiciosAdquiridos extends javax.swing.JFrame {
    
    private JFrame anterior;
    private ModeloTabla modeloTabla;
    private Aplicacion app = Aplicacion.getInstancia();
    private Usuario usuario;
    private List<List<Object>> listaTabla = new ArrayList<>();
    
    public InterfazServiciosAdquiridos(JFrame anterior, Usuario usuario) {
        initComponents();
        this.anterior = anterior;
        this.usuario = usuario;
        inicializarTabla();
        rellenarTabla(usuario);
    }
    
    private void inicializarTabla() {
        tabla.getTableHeader().setReorderingAllowed(false);
        String[] columnas = {"Tipo", "Deporte", "Dia", "Hora", "Num Pista"};

        modeloTabla = new ModeloTabla(null, columnas);

        tabla.setModel(modeloTabla);
    }
    
    private List<String[]> getDatosPistaAlquiladaUser(Pista p, Usuario user){
        List<String[]> lista = new ArrayList<>();
        p.getAlquilerLunes().forEach((k,v) -> {
            if(v != null && v.equals(user)){
                String[] datos = new String[5];
                datos[0] = "Alquiler pista";
                datos[1] = p.getTipo();
                datos[2] = "Lunes";
                datos[3] = String.valueOf(k);
                datos[4] = String.valueOf(p.getNumPista());
                lista.add(datos);
            }
        });
        p.getAlquilerMartes().forEach((k,v) -> {
            if(v != null && v.equals(user)){
                String[] datos = new String[5];
                datos[0] = "Alquiler pista";
                datos[1] = p.getTipo();
                datos[2] = "Martes";
                datos[3] = String.valueOf(k);
                datos[4] = String.valueOf(p.getNumPista());
                lista.add(datos);
            }
        });
        p.getAlquilerMiercoles().forEach((k,v) -> {
            if(v != null && v.equals(user)){
                String[] datos = new String[5];
                datos[0] = "Alquiler pista";
                datos[1] = p.getTipo();
                datos[2] = "Miercoles";
                datos[3] = String.valueOf(k);
                datos[4] = String.valueOf(p.getNumPista());
                lista.add(datos);
            }
        });
        p.getAlquilerJueves().forEach((k,v) -> {
            if(v != null && v.equals(user)){
                String[] datos = new String[5];
                datos[0] = "Alquiler pista";
                datos[1] = p.getTipo();
                datos[2] = "Jueves";
                datos[3] = String.valueOf(k);
                datos[4] = String.valueOf(p.getNumPista());
                lista.add(datos);
            }
        });
        p.getAlquilerViernes().forEach((k,v) -> {
            if(v != null && v.equals(user)){
                String[] datos = new String[5];
                datos[0] = "Alquiler pista";
                datos[1] = p.getTipo();
                datos[2] = "Viernes";
                datos[3] = String.valueOf(k);
                datos[4] = String.valueOf(p.getNumPista());
                lista.add(datos);
            }
        });
        return lista;
    }
    
    private void rellenarTabla(Usuario user) {
        List lista = new ArrayList();
        if (user.getClass() == Socio.class){
            for (Clase clase : app.getClases()){
                if (clase.estaInscrito((Socio) user)) lista.add(clase);
            }
        }
        for (Pista pista : app.getPistas()){
            if (pista.aAlquilado(user)) lista.add(pista);
        }
        try {
            Object[] filaTabla = new Object[5];
            for (Object servicio : lista) {
                if (servicio.getClass() == Clase.class){
                    Clase c = (Clase) servicio;
                    filaTabla[0] = "Clase";
                    filaTabla[1] = String.valueOf(c.getTipo());
                    filaTabla[2] = String.valueOf(c.getHorario().keySet().toString());
                    filaTabla[3] = String.valueOf(c.getHorario().values());
                    filaTabla[4] = String.valueOf(c.getNumPista());
                    listaTabla.add(List.of(c, filaTabla));
                    modeloTabla.addRow(filaTabla);
                }else{
                    Pista p = (Pista) servicio;
                    List<String[]> datos = getDatosPistaAlquiladaUser(p, user);
                    for (String[] datosString : datos){
                        listaTabla.add(List.of(p, datosString));
                        modeloTabla.addRow(datosString);
                    }
                }
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout());

        tabla.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        anterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void tablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMousePressed
        int indiceServicio = tabla.rowAtPoint(evt.getPoint());
        Object servicio = listaTabla.get(indiceServicio).get(0);
        Object[] fila = (Object[]) listaTabla.get(indiceServicio).get(1);
        if (String.valueOf(fila[0]).equals("Clase")){
            Clase c = (Clase) servicio;
            int eleccion = JOptionPane.showOptionDialog(this, "¿Esta seguro de que desea desapuntarse de la clase  " + c.getTipo() + ":  " + c.getNivel()+"?", "Mensaje de confirmación", 0, 0, null, new String[]{"SI", "NO"}, this);
                if (eleccion == JOptionPane.YES_OPTION) {
                    c.desapuntarSocioClase((Socio) usuario);
                    JOptionPane.showMessageDialog(this, "Se ha desapuntado correctamente", "FITTRONES", JOptionPane.INFORMATION_MESSAGE);
                    vaciarTabla();
                    listaTabla =  new ArrayList<>();
                    rellenarTabla(usuario);
                }
            
        }
    }//GEN-LAST:event_tablaMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

}
