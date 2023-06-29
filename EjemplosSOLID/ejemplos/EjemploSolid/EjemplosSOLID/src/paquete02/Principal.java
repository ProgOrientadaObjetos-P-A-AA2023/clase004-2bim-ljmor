package paquete02;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        Ciudad ciudad01 = new Ciudad("Loja");
        Ciudad ciudad02 = new Ciudad("Quito");

        Persona persona01 = new Persona("Luis", 19, ciudad01);
        Persona persona02 = new Persona("Oliver", 27, ciudad02);

        OperacionesEstudiantes op1 = new OperacionesEstudiantes();

        ArrayList<Persona> list = new ArrayList<>();
        list.add(persona01);
        list.add(persona02);
        list.add(new Persona("Jose", 14, new Ciudad("Cuenca")));

        op1.establecerEstudiante(list);
        op1.establecerPromedioEdades();

        System.out.printf("\nPromedio Edades: %.2f\n",
                op1.obtenerPromedioEdades());

        op1.establecerEdadminima();
        System.out.printf("\nEdad mínima: %d\n",
                op1.obtenerEdadminima());

        op1.establecerEdadmaxima();
        System.out.printf("\nEdad máxima: %d\n",
                op1.obtenerEdadmaxima());
        
        op1.establecerListaCiudadesEstudiantes();
        System.out.printf("\nLista de ciudades:\n%s\n",
                op1.obtenerListaCiudadesEstudiantes());
    }
}
