package utiles;

public class Enum {

    public enum ActividadEnum {
        BODY_PUMP, BOXEO, SPINNING, YOGA, DEFENSA_PERSONAL;
    }
    
    public enum ClaseEnum {
        FUTBOL, PADEL, NATACION;
    }
    
    public enum NivelPadelNatacionEnum {
        PRINCIPIANTE, INTERMEDIO, AVANZADO;
    }
    
    public enum NivelFutbolEnum {
        BENJAMIN, CADETE, SENIOR;
    }
    
    public enum PistaEnum {
        FUTBOL, PADEL;
    }
    
    public enum PistaFutbolEnum {
        PISTA1, PISTA2;
    }
    
    public enum PistaPadelEnum {
        PISTA1, PISTA2, PISTA3, PISTA4, PISTA5, PISTA6;
    }
    
    public enum PistaNatacionEnum {
        PISTA1;
    }
    
    public enum TurnoEnum {
        MAÑANA, TARDE;
    }
    
    public enum EjercicioEnum {
        EMPUJE, TIRON, PIERNA;
    }
    
    public enum SalaEnum {
        SALA1, SALA2, SALA3, SALA4, SALA5;
    }
    
    public enum DiaEnum {
        LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO;
    }
    
    public enum LoginEnum {
        CLIENTE, SOCIO, MONITOR, RECEPCIONISTA, PROFESOR, ERROR_CORREO, ERROR_CONTRASENA;
    }
}
