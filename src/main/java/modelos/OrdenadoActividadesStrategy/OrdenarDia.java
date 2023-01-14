/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.OrdenadoActividadesStrategy;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import modelos.Actividad;

/**
 *
 * @author Octavian
 */
public class OrdenarDia implements IntEstrategiaOrdenadoActividades{

    @Override
    public void ordenarActividades(List<Actividad> actividades) {
        Comparator diaComp = new Comparator() {

            @Override
            public int compare(Object a1, Object a2) {
                Actividad act1 = (Actividad) a1;
                Actividad act2 = (Actividad) a2;

                return String.valueOf(act1.getDia()).compareTo(String.valueOf(act2.getDia()));
            }
        };

        Collections.sort(actividades, diaComp);
    }
    
}
