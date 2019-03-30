/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es;

import java.util.ArrayList;

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
        ArrayList<Casa> casas = new ArrayList<>();
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
    private static  ArrayList<Casa> generarCincoCasas( ArrayList<Casa> casas) {
        casas.add( new Casa("Direccion Casa 1",23710,5,200 ));
        casas.add(  new Casa("Direccion Casa 2",23700,4,301 ));
        casas.add( new Casa("Direccion Casa 3",23710,3,420 ));
        casas.add( new Casa("Direccion Casa 4",23700,2,225 ));
        casas.add(  new Casa("Direccion Casa 5",23710,1,110) );
     
        
        return casas;
    }
    
    //Método que muestra por consula cualquier parámetro que reciba
    private static void mostrar(String texto) {
        System.out.println(texto);
    }

    //Método que recibe un array de objetos casa y lee solo la propiedad que se le pase como string del segundo parámetro
    private static void listasCasas(ArrayList<Casa> casas, String tipo) {
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
     
      for(int i = 0, fin = casas.size(); i<fin; i++) {
           switch(tipo) {
            case "Direccion": opcion = casas.get(i).Direccion;
            break;
            case "CP": opcion =  String.valueOf(casas.get(i).CP);
            break;
            case "NHabitaciones": opcion =  String.valueOf(casas.get(i).NHabitaciones);
            break;
            case "MCuadrados": opcion =  String.valueOf(casas.get(i).MCuadrados);
        }
           
          mostrar("Casa nº" + i + " " + opcion);
      }
    }
    
    
}
