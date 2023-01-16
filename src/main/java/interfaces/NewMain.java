package interfaces;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import modelos.Actividad;
import modelos.Usuarios.Cliente;
import modelos.Usuarios.Monitor;
import modelos.Usuarios.Socio;
import utiles.Enum.*;
import java.time.LocalDate;
import java.util.HashMap;
import modelos.Aplicacion;
import modelos.Clase;
import modelos.Sauna;
import modelos.Usuarios.Profesor;
import modelos.Usuarios.Recepcionista;
import utiles.Excepcion;

public class NewMain {

    public static void main(String[] args) {

        Aplicacion app = new Aplicacion();

        Cliente c1 = new Cliente("123", "c1", "", LocalDate.of(2001, 5, 7), "", "");
        Cliente c2 = new Cliente("123", "c2", "", LocalDate.of(2002, 5, 17), "", "");
        Cliente c3 = new Cliente("123", "c3", "", LocalDate.of(2000, 7, 2), "", "");
        
        Socio s1 = new Socio("123", "s1", "", LocalDate.of(1999, 2, 13), "", "");
        Socio s2 = new Socio("123", "s2", "", LocalDate.of(1998, 12, 3), "", "");
        Socio s3 = new Socio("123", "s3", "", LocalDate.of(2000, 2, 5), "", "");

        Actividad act1 = new Actividad(DiaEnum.LUNES, LocalTime.of(10, 30), new ArrayList<>(), ActividadEnum.BODY_PUMP);
        Actividad act2 = new Actividad(DiaEnum.LUNES, LocalTime.of(17, 0), new ArrayList<>(), ActividadEnum.BOXEO);
        Actividad act3 = new Actividad(DiaEnum.MARTES, LocalTime.of(10, 30), new ArrayList<>(), ActividadEnum.SPINNING);
        Actividad act4 = new Actividad(DiaEnum.MARTES, LocalTime.of(17, 0), new ArrayList<>(), ActividadEnum.BODY_PUMP);
        Actividad act5 = new Actividad(DiaEnum.MIERCOLES, LocalTime.of(10, 30), new ArrayList<>(), ActividadEnum.YOGA);
        Actividad act6 = new Actividad(DiaEnum.MIERCOLES, LocalTime.of(17, 0), new ArrayList<>(), ActividadEnum.BOXEO);
        Actividad act7 = new Actividad(DiaEnum.JUEVES, LocalTime.of(10, 30), new ArrayList<>(), ActividadEnum.SPINNING);
        Actividad act8 = new Actividad(DiaEnum.JUEVES, LocalTime.of(17, 0), new ArrayList<>(), ActividadEnum.DEFENSA_PERSONAL);
        Actividad act9 = new Actividad(DiaEnum.VIERNES, LocalTime.of(12, 0), new ArrayList<>(), ActividadEnum.YOGA);

        Monitor m1 = new Monitor(new ArrayList<>(), new ArrayList<>(Arrays.asList(act1, act4, act3, act7)), TurnoEnum.MAÑANA, "123", "m1", "", LocalDate.of(1990, 5, 12), "", "");
        Monitor m2 = new Monitor(new ArrayList<>(), new ArrayList<>(Arrays.asList(act2, act6, act8)), TurnoEnum.TARDE, "123", "m2", "", LocalDate.of(1993, 7, 2), "", "");
        Monitor m3 = new Monitor(new ArrayList<>(), new ArrayList<>(Arrays.asList(act5, act9)), TurnoEnum.MAÑANA, "123", "m3", "", LocalDate.of(1986, 2, 5), "", "");
            
        Clase claseFutbol1 = new Clase(new HashMap<>() {{put(DiaEnum.MIERCOLES, LocalTime.of(19, 0));}}, NivelFutbolEnum.BENJAMIN, PistaFutbolEnum.PISTA1, ClaseEnum.FUTBOL, 10, new ArrayList<>());
        Clase claseFutbol2 = new Clase(new HashMap<>() {{put(DiaEnum.MARTES, LocalTime.of(19, 0)); put(DiaEnum.VIERNES, LocalTime.of(19, 0));}}, NivelFutbolEnum.CADETE, PistaFutbolEnum.PISTA1, ClaseEnum.FUTBOL, 13, new ArrayList<>());
        Clase claseFutbol3 = new Clase(new HashMap<>() {{put(DiaEnum.LUNES, LocalTime.of(19, 0)); put(DiaEnum.JUEVES, LocalTime.of(19, 0));}}, NivelFutbolEnum.SENIOR, PistaFutbolEnum.PISTA1, ClaseEnum.FUTBOL, 17, new ArrayList<>());
        
        Clase clasePadel1 = new Clase(new HashMap<>() {{put(DiaEnum.MIERCOLES, LocalTime.of(19, 0));}}, NivelPadelNatacionEnum.PRINCIPIANTE, PistaPadelEnum.PISTA1, ClaseEnum.PADEL, 7, new ArrayList<>());
        Clase clasePadel2 = new Clase(new HashMap<>() {{put(DiaEnum.MARTES, LocalTime.of(19, 0)); put(DiaEnum.VIERNES, LocalTime.of(19, 0));}}, NivelPadelNatacionEnum.INTERMEDIO, PistaPadelEnum.PISTA1, ClaseEnum.PADEL, 7, new ArrayList<>());
        Clase clasePadel3 = new Clase(new HashMap<>() {{put(DiaEnum.LUNES, LocalTime.of(19, 0)); put(DiaEnum.JUEVES, LocalTime.of(19, 0));}}, NivelPadelNatacionEnum.AVANZADO, PistaPadelEnum.PISTA1, ClaseEnum.PADEL, 7, new ArrayList<>());
        
        Clase claseNatacion1 = new Clase(new HashMap<>() {{put(DiaEnum.MIERCOLES, LocalTime.of(19, 0));}}, NivelPadelNatacionEnum.PRINCIPIANTE, PistaNatacionEnum.PISTA1, ClaseEnum.NATACION, 5, new ArrayList<>());
        Clase claseNatacion2 = new Clase(new HashMap<>() {{put(DiaEnum.MARTES, LocalTime.of(19, 0)); put(DiaEnum.VIERNES, LocalTime.of(19, 0));}}, NivelPadelNatacionEnum.INTERMEDIO, PistaNatacionEnum.PISTA1, ClaseEnum.NATACION, 5, new ArrayList<>());
        Clase claseNatacion3 = new Clase(new HashMap<>() {{put(DiaEnum.LUNES, LocalTime.of(19, 0)); put(DiaEnum.JUEVES, LocalTime.of(19, 0));}}, NivelPadelNatacionEnum.AVANZADO, PistaNatacionEnum.PISTA1, ClaseEnum.NATACION, 5, new ArrayList<>());
        
        Profesor p1 = new Profesor(TurnoEnum.TARDE, "123", "p1", "", LocalDate.of(1985, 5, 10), "", "", new ArrayList<>(Arrays.asList(claseFutbol1, claseFutbol2, claseFutbol3)));
        Profesor p2 = new Profesor(TurnoEnum.TARDE, "123", "p2", "", LocalDate.of(1987, 5, 8), "", "", new ArrayList<>(Arrays.asList(clasePadel1, clasePadel2, clasePadel3)));
        Profesor p3 = new Profesor(TurnoEnum.TARDE, "123", "p3", "", LocalDate.of(1985, 5, 3), "", "", new ArrayList<>(Arrays.asList(claseNatacion1, claseNatacion2, claseNatacion3)));
        
        Recepcionista r1 = new Recepcionista(TurnoEnum.MAÑANA, "123", "r1", "", LocalDate.of(1988, 5, 7), "", "");
        Recepcionista r2 = new Recepcionista(TurnoEnum.TARDE, "123", "r2", "", LocalDate.of(1985, 4, 7), "", "");
        
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
            
            System.out.println(app.iniciarSesion("s2", "123"));
            System.out.println(app.getUsuarioLogueado());
            System.out.println(app.getUsuariosRegistrados().size());
            System.out.println(app.getActividades().size());
            System.out.println(app.getClases().size());            
        } catch (Excepcion ex) {
            System.out.println("Excepcion: "+ex.toString());
        }
    }
}
