package modelos.OrdenadoActividadesStrategy;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import modelos.Actividad;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:32
 */
public class OrdenarTipo implements IntEstrategiaOrdenadoActividades {


    @Override
    public void ordenarActividades(List<Actividad> actividades) {
        Comparator TipoComp = new Comparator() {

            @Override
            public int compare(Object a1, Object a2) {
                Actividad act1 = (Actividad) a1;
                Actividad act2 = (Actividad) a2;

                return String.valueOf(act1.getTipo()).compareTo(String.valueOf(act2.getTipo()));
            }
        };

        Collections.sort(actividades, TipoComp);
    }
}//end OrdenarTipo