package modelos.DietaBuilder;

import java.util.List;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:12
 */
public abstract class DietaBuilder {

    protected Dieta dieta;

    //Listas con los datos para asignar a las dietas
    protected List<String> listaDatosDesayunos = List.of("Cereales");
    protected List<String> listaDatosComidas = List.of("Macarrones boloñesa", "");
    protected List<String> listaDatosMeriendas = List.of("Cereales");
    protected List<String> listaDatosCenas = List.of("Cereales");

    public Dieta getDieta() {
        return dieta;
    }

    ;
    
    public void crearNuevaDieta() {
        dieta = new Dieta();
    }

    /**
     * Crea la dieta del lunes
     */
    public abstract void crearMenuLunes();

    /**
     * Crea la dieta del martes
     */
    public abstract void crearMenuMartes();

    /**
     * Crea la dieta del miercoles
     */
    public abstract void crearMenuMiercoles();

    /**
     * Crea la dieta del jueves
     */
    public abstract void crearMenuJueves();

    /**
     * Crea la dieta del viernes
     */
    public abstract void crearMenuViernes();

    /**
     * Crea la dieta del sabado
     */
    public abstract void crearMenuSabado();

    /**
     * Crea la dieta del domingo
     */
    public abstract void crearMenuDomingo();

    /**
     * Crea un plato de desayuno y en funcion del tipo de dieta le asigna unas
     * calorias u otras
     *
     * @param tipo
     * @return
     */
    protected Plato crearPlatoDesayuno(String tipo) {
        Plato plato = new Plato();

        int numeroCalorias;
        int numeroRandom = (int) (Math.random() * (listaDatosDesayunos.size() + 1));

        if (tipo.equals("definicion")) {
            numeroCalorias = (int) (Math.random() * (400 - 300 + 1) + 300); //random entre 300 y 400 kcal
        } else {
            numeroCalorias = (int) (Math.random() * (600 - 500 + 1) + 300); //random entre 300 y 400 kcal
        }

        plato.setCalorias(numeroCalorias);
        plato.setNombre(listaDatosDesayunos.get(numeroRandom));

        return plato;
    }

    protected Plato crearPlatoComida(String tipo) {
        Plato plato = new Plato();
        int numeroCalorias;
        int numeroRandom = (int) (Math.random() * (listaDatosDesayunos.size() + 1));

        if (tipo.equals("definicion")) {
            numeroCalorias = (int) (Math.random() * (700 - 600 + 1) + 600); //random entre 700 y 600 kcal
        } else {
            numeroCalorias = (int) (Math.random() * (900 - 800 + 1) + 800); //random entre 900 y 800 kcal
        }
        plato.setCalorias(numeroCalorias);
        plato.setNombre(listaDatosComidas.get(numeroRandom));

        return plato;
    }

    protected Plato crearPlatoMerienda(String tipo) {
        Plato plato = new Plato();
        int numeroCalorias;
        int numeroRandom = (int) (Math.random() * (listaDatosMeriendas.size() + 1));

        if (tipo.equals("definicion")) {
            numeroCalorias = (int) (Math.random() * (500 - 400 + 1) + 400); //random entre 500 y 400 kcal
        } else {
            numeroCalorias = (int) (Math.random() * (700 - 600 + 1) + 600); //random entre 700 y 600 kcal
        }

        plato.setCalorias(numeroCalorias);
        plato.setNombre(listaDatosMeriendas.get(numeroRandom));

        return plato;
    }

    protected Plato crearPlatoCena(String tipo) {
        Plato plato = new Plato();
        int numeroCalorias;
        int numeroRandom = (int) (Math.random() * (listaDatosCenas.size() + 1));

        if (tipo.equals("definicion")) {
            numeroCalorias = (int) (Math.random() * (600 - 500 + 1) + 500); //random entre 600 y 600 kcal
        } else {
            numeroCalorias = (int) (Math.random() * (800 - 700 + 1) + 700); //random entre 800 y 700 kcal
        }
        plato.setCalorias(numeroCalorias);
        plato.setNombre(listaDatosCenas.get(numeroRandom));

        return plato;
    }
}
