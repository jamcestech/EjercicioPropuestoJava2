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
      listasCasas(casas, "Direccion");
      
      //Mostramos códigos postales
       listasCasas(casas, "CP");
      //Mostramos número de habitaciones
       listasCasas(casas, "NHabitaciones");
      //Mostramos metros cuadrados
      listasCasas(casas, "MCuadrados");
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
    
    //Método que muestra por consula cualquier parámetro que reciba
    private static void mostrar(String texto) {
        System.out.println(texto);
    }

    private static void listasCasas(Casa[] casas, String tipo) {
        String opcion = "";
        switch(tipo) {
            case "Direccion": opcion = "las direcciones";
            break;
            case "CP": opcion = "los códigos postales";
            break;
            case "NHabitaciones": opcion = "el número de habitaciones";
            break;
            case "MCuadrados": opcion = "los metros cuadrados";
        }
        
        mostrar("Aqui se muestran " + opcion + " de las casas");
     
      for(int i = 0, fin = casas.length; i<fin; i++) {
           switch(tipo) {
            case "Direccion": opcion = casas[i].Direccion;
            break;
            case "CP": opcion =  String.valueOf(casas[i].CP);
            break;
            case "NHabitaciones": opcion =  String.valueOf(casas[i].NHabitaciones);
            break;
            case "MCuadrados": opcion =  String.valueOf(casas[i].MCuadrados);
        }
           
          mostrar("Casa nº" + i + " " + opcion);
      }
    }
    
    
}
