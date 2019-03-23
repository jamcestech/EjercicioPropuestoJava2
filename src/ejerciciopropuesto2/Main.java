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
      casas = generarCincoCasas(casas);
      
      //Mostramos listado de direcciones
      System.out.println("Aquí se muestran las direcciones de las casas");
      for(int i = 0, fin = casas.length; i<fin; i++) {
           System.out.println("Casa nº" + i + " " + casas[0].Direccion);
      }
      //Mostramos códigos postales
      
      //Mostramos número de habitaciones
      
      //Mostramos metros cuadrados
      
    }
    //Método que recibe un array de Casa y devuelve el mismo array con datos rellenos 
    private static Casa[] generarCincoCasas(Casa[] casas) {
        casas[0] = new Casa("Direccion Casa 1",23710,5,200 );
        casas[1] = new Casa("Direccion Casa 2",23700,4,301 );
        casas[2] = new Casa("Direccion Casa 3",23710,3,420 );
        casas[3] = new Casa("Direccion Casa 4",23700,2,225 );
        casas[4] = new Casa("Direccion Casa 5",23710,1,110 );
     
        
        return casas;
    }
    
}
