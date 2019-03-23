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
public class Casa {
    protected String Direccion;
    protected int CP;
    protected int NHabitaciones;
    protected double MCuadrados;

    public Casa(String Direccion, int CP, int NHabitaciones, double MCuadrados) {
        this.Direccion = Direccion;
        this.CP = CP;
        this.NHabitaciones = NHabitaciones;
        this.MCuadrados = MCuadrados;
    }
    
    
    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getCP() {
        return CP;
    }

    public void setCP(int CP) {
        this.CP = CP;
    }

    public int getNHabitaciones() {
        return NHabitaciones;
    }

    public void setNHabitaciones(int NHabitaciones) {
        this.NHabitaciones = NHabitaciones;
    }

    public double getMCuadrados() {
        return MCuadrados;
    }

    public void setMCuadrados(double MCuadrados) {
        this.MCuadrados = MCuadrados;
    }
    
    
}
