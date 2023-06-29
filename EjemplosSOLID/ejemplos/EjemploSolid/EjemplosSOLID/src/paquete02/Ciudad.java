package paquete02;

public class Ciudad {
    private String nombreCiudad;

    public Ciudad(String nom) {
        nombreCiudad = nom;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String n) {
        nombreCiudad = n;
    }

    @Override
    public String toString() {
        String m = String.format("%s\n",
                nombreCiudad);
        return m;
    }
    
    
}
