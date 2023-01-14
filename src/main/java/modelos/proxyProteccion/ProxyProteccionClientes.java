package modelos.proxyProteccion;

import modelos.Usuarios.Cliente;
import modelos.Usuarios.Socio;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:33
 */
public class ProxyProteccionClientes implements IntCliente {

    private Cliente cliente;
    private Socio socio;
    String datosUsuario;

    public ProxyProteccionClientes() {
    }

    public void setCliente(Cliente c) {
        this.cliente = c;
        String datosCliente = c.getInformacionCliente();
        String[] datos = datosCliente.split(";", 5);
        for (String s : datos) {
            datosUsuario = datosUsuario.concat(s);
        }
    }

    public void setSocio(Socio s) {
        this.socio = s;
        String datosSocio = s.getInformacionCliente();
        String[] datos = datosSocio.split(";", 5);
        for (String st : datos) {
            datosUsuario = datosUsuario.concat(st);
        }
    }

    @Override
    public String getInformacionCliente() {
        return datosUsuario;
    }
}//end ProxyProteccionClientes
