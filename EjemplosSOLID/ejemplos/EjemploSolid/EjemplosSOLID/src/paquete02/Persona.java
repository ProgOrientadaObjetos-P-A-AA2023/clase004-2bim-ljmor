/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;

public class Persona {
    private String nombre;
    private int edad;
    private Ciudad ciudad;
    
    public Persona(String n, int e, Ciudad ciu){
        nombre = n;
        edad = e;
        ciudad = ciu;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerEdad(int n){
        edad = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public int obtenerEdad(){
        return edad;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    public void establecerCiudad(Ciudad n) {
        ciudad = n;
    }
    
}
