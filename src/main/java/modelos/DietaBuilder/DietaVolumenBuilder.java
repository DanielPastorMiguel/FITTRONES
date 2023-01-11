package modelos.DietaBuilder;

/**
 * @author Daniel
 * @version 1.0
 * @created 06-ene.-2023 17:48:13
 */
public class DietaVolumenBuilder extends DietaBuilder {

 
    @Override
    public void crearMenuLunes() {
        Menu menu = new Menu();
        /*
        Crear platos para el menu de desayuno comida merienda y cena
        Cada uno de los platos tiene unas calorias y nombre
         */
        dieta.setTipoDieta("Volumen");
        
        menu.setDesayuno(crearPlatoDesayuno("Volumen"));
        menu.setComida(crearPlatoComida("Volumen"));
        menu.setMerienda(crearPlatoMerienda("Volumen"));
        menu.setCena(crearPlatoCena("Volumen"));
        
        dieta.setLunes(menu);
    }

    @Override
    public void crearMenuMartes() {
        Menu menu = new Menu();
        
        dieta.setTipoDieta("Volumen");
        
        menu.setDesayuno(crearPlatoDesayuno("Volumen"));
        menu.setComida(crearPlatoComida("Volumen"));
        menu.setMerienda(crearPlatoMerienda("Volumen"));
        menu.setCena(crearPlatoCena("Volumen"));

        dieta.setMartes(menu);
    }

    @Override
    public void crearMenuMiercoles() {
        Menu menu = new Menu();
        
        dieta.setTipoDieta("Volumen");
        
        menu.setDesayuno(crearPlatoDesayuno("Volumen"));
        menu.setComida(crearPlatoComida("Volumen"));
        menu.setMerienda(crearPlatoMerienda("Volumen"));
        menu.setCena(crearPlatoCena("Volumen"));

        dieta.setMiercoles(menu);
    }

    @Override
    public void crearMenuJueves() {
        Menu menu = new Menu();
        
        dieta.setTipoDieta("Volumen");
        
        menu.setDesayuno(crearPlatoDesayuno("Volumen"));
        menu.setComida(crearPlatoComida("Volumen"));
        menu.setMerienda(crearPlatoMerienda("Volumen"));
        menu.setCena(crearPlatoCena("Volumen"));

        dieta.setJueves(menu);
    }

    @Override
    public void crearMenuViernes() {
        Menu menu = new Menu();
        
        dieta.setTipoDieta("Volumen");
        
        menu.setDesayuno(crearPlatoDesayuno("Volumen"));
        menu.setComida(crearPlatoComida("Volumen"));
        menu.setMerienda(crearPlatoMerienda("Volumen"));
        menu.setCena(crearPlatoCena("Volumen"));

        dieta.setViernes(menu);
    }

    @Override
    public void crearMenuSabado() {
       Menu menu = new Menu();
        
        dieta.setTipoDieta("Volumen");
        
        menu.setDesayuno(crearPlatoDesayuno("Volumen"));
        menu.setComida(crearPlatoComida("Volumen"));
        menu.setMerienda(crearPlatoMerienda("Volumen"));
        menu.setCena(crearPlatoCena("Volumen"));

        dieta.setSabado(menu);
    }

    @Override
    public void crearMenuDomingo() {
       Menu menu = new Menu();
        
        dieta.setTipoDieta("Volumen");
        
        menu.setDesayuno(crearPlatoDesayuno("Volumen"));
        menu.setComida(crearPlatoComida("Volumen"));
        menu.setMerienda(crearPlatoMerienda("Volumen"));
        menu.setCena(crearPlatoCena("Volumen"));

        dieta.setDomingo(menu);
    }
    

   
}//end DietaVolumenBuilder
