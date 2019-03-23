/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopropuesto2;

/**
 *
 * @author jose
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Inicializamos un array de objectos (casas)
      Casa[] casas = new Casa[5];
      casas = generarSeisCasas(casas);
      
      //Mostramos listado de direcciones
      
      //Mostramos códigos postales
      
      //Mostramos número de habitaciones
      
      //Mostramos metros cuadrados
      
    }
    //Método que recibe un array de Casa y devuelve el mismo array con datos rellenos 
    private static Casa[] generarSeisCasas(Casa[] casas) {
        casas[0].Direccion = "Casa 1";
        casas[0].CP = 23710;
        casas[0].NHabitaciones = 5;
        casas[0].MCuadrados = 200;
        
        casas[1].Direccion = "Casa 2";
        casas[1].CP = 23700;
        casas[1].NHabitaciones = 1;
        casas[1].MCuadrados = 200;
        
        casas[2].Direccion = "Casa 3";
        casas[2].CP = 23710;
        casas[2].NHabitaciones = 7;
        casas[2].MCuadrados = 400;
        
        casas[3].Direccion = "Casa 4";
        casas[3].CP = 23700;
        casas[3].NHabitaciones = 15;
        casas[3].MCuadrados = 2000;
       
        casas[4].Direccion = "Casa 5";
        casas[4].CP = 23710;
        casas[4].NHabitaciones = 2;
        casas[4].MCuadrados = 150;
        
        casas[5].Direccion = "Casa 6";
        casas[5].CP = 23700;
        casas[5].NHabitaciones = 2;
        casas[5].MCuadrados = 220;
        
      
        return casas;
    }
    
}
