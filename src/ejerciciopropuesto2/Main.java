/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es;

import java.util.ArrayList;
import java.util.Scanner;

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
        ArrayList<String> calle = new ArrayList<>();
        ArrayList<Integer> cp = new ArrayList<>();
        ArrayList<Integer> nHabitaciones = new ArrayList<>();
        ArrayList<Double> mCuadrados = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la calle, 0 para salir");
        while (sc.hasNext()) {
            if(sc.hasNextInt() && sc.nextInt() == 0) break;
            calle.add(sc.next());
        }
        String algo = sc.next();

        System.out.println("Introduce CP, 0 para salir");

        while (sc.hasNext()) {
            if(sc.hasNextInt() && sc.nextInt() == 0) break;
            cp.add(sc.nextInt());
        }
        sc.nextLine();
        System.out.println("Introduce el número de habitaciones, 0 para salir");
        while (sc.hasNext()) {
            if(sc.hasNextInt() && sc.nextInt() == 0) break;
            nHabitaciones.add(sc.nextInt());
        }
        sc.nextLine();
        System.out.println("Introduce los metros cuadrados, 0 para salir");
        while (sc.hasNext()) {
            if(sc.hasNextInt() && sc.nextInt() == 0) break;
            mCuadrados.add(sc.nextDouble());
        }

        int menor = calle.size();
        if(menor  > cp.size()) {
            menor = cp.size();
        }
        if(menor > nHabitaciones.size()) {
            menor = nHabitaciones.size();
        }

        if(menor > mCuadrados.size()) {
            menor = mCuadrados.size();
        }

        for (int i = 0; i < menor ; i++) {
            casas.add( new Casa(calle.get(i),cp.get(i),nHabitaciones.get(i),mCuadrados.get(i) ));
        }




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
