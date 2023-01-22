package modelos.proxyProteccion;

import java.io.Serializable;
import modelos.Usuarios.Cliente;
import modelos.Usuarios.Socio;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:33
 */
public class ProxyProteccionClientes implements Serializable, IntCliente {

    private Cliente cliente;
    private Socio socio;
    String datosUsuario = "";

    public ProxyProteccionClientes() {}

    public void setCliente(Cliente c) {
        this.cliente = c;
        String datosCliente = c.getInformacionCliente();
        datosUsuario = datosCliente.substring(0,datosCliente.lastIndexOf("Contraseña")-1);
    }

    public void setSocio(Socio s) {
        this.socio = s;
        String datosSocio = s.getInformacionCliente();
        datosUsuario = datosSocio.substring(0,datosSocio.lastIndexOf("Contraseña")-1);
    }

    @Override
    public String getInformacionCliente() {
        return datosUsuario;
    }
}//end ProxyProteccionClientes