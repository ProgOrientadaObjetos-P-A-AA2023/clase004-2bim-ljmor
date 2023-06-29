/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;

import java.util.ArrayList;

public class OperacionesEstudiantes {
    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    private int edadminima;
    private int edadmaxima;
    private String listaCiudadesEstudiantes;
    
    public void establecerEstudiante(ArrayList<Persona> lista){
        estudiantes = lista;
    }
    
    public ArrayList<Persona> obtenerEstudiante(){
        return estudiantes;
    }
    
    public void establecerPromedioEdades(){
        double suma = 0;
        for(Persona e: obtenerEstudiante()){
            suma += e.obtenerEdad();
        }
        promedioEdades = suma/obtenerEstudiante().size();
    }
    
    public double obtenerPromedioEdades(){
        
        return promedioEdades;
    }

    public int obtenerEdadminima() {
        return edadminima;
    }

    public void establecerEdadminima() {
        int edadMenor = Integer.MAX_VALUE;
        
        for (Persona e : estudiantes) {
            if (e.obtenerEdad() < edadMenor) {
                edadMenor = e.obtenerEdad();
            }
        }
        edadminima = edadMenor;
    }    

    public int obtenerEdadmaxima() {
        return edadmaxima;
    }

    public void establecerEdadmaxima() {
       int edadMayor = Integer.MIN_VALUE;
        
        for (Persona e : estudiantes) {
            if (e.obtenerEdad() > edadMayor) {
                edadMayor = e.obtenerEdad();
            }
        }
        edadmaxima = edadMayor;
    }

    public String obtenerListaCiudadesEstudiantes() {
        return listaCiudadesEstudiantes;
    }

    public void establecerListaCiudadesEstudiantes() {
        listaCiudadesEstudiantes = "";
        for (Persona e : estudiantes) {
            listaCiudadesEstudiantes = 
                    String.format("%s%s", 
                            listaCiudadesEstudiantes,
                            e.obtenerCiudad());
        }
    }
    
    
}
