package modelos.OrdenadoActividadesStrategy;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import modelos.Actividad;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:31
 */
public class OrdenarHorario implements IntEstrategiaOrdenadoActividades {

    @Override
    public void ordenarActividades(List<Actividad> actividades) {
        Comparator horarioComp = new Comparator() {

            @Override
            public int compare(Object a1, Object a2) {
                Actividad act1 = (Actividad) a1;
                Actividad act2 = (Actividad) a2;

                return String.valueOf(act1.getHora()).compareTo(String.valueOf(act2.getHora()));
            }
        };

        Collections.sort(actividades, horarioComp);
    }
}//end OrdenarHorario