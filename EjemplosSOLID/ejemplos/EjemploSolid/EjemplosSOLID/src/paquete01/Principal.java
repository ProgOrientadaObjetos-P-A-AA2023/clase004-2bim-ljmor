package paquete01;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Persona persona01 = new Persona("Luis", 19);
        Persona persona02 = new Persona("Oliver", 27);

        System.out.printf("%s\n", persona01.obtenerEdad());
        System.out.printf("%s\n", persona02.obtenerEdad());
        
        ArrayList<Persona> list = new ArrayList<>();
        list.add(persona01);
        list.add(persona02);
        
        double prom = persona01.promedioEdades(list);
        System.out.printf("%.2f\n", prom);
    }
}
