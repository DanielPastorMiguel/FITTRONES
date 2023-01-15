package modelos.Usuarios;

import java.time.LocalDate;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:36
 */
public class Usuario {

    private String contrasena;
    private String correo;
    private String dni;
    private LocalDate fechaNacimiento;
    private String nombre;
    private String telefono;

    public Usuario(String contrasena, String correo, String dni, LocalDate fechaNacimiento, String nombre, String telefono) {
        this.contrasena = contrasena;
        this.correo = correo;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Usuario{" + "contrasena=" + contrasena + ", correo=" + correo + ", dni=" + dni + ", fechaNacimiento=" + fechaNacimiento + ", nombre=" + nombre + ", telefono=" + telefono + '}';
    }

}//end Usuario
