/*
 * O — Open/closed principle (Principio abierto/cerrado)
 */
package paquete04;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        
        ArrayList<Transporte> lista = new ArrayList<>();
        
        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();
        lista.add(bus);
        
        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();
        lista.add(taxi);
        
        TransporteTransvia t1 = new TransporteTransvia();
        t1.establecerCooperativaTransvia("Olivers INC.");
        t1.establecerTarifa();
        lista.add(t1);
        
        TiposTransporte tipos = new TiposTransporte();
        tipos.establecerTransportes(lista);
        tipos.establecerPromedioTarifas();
        
        System.out.printf("Promedio de Tarifas: %.2f\n", 
                tipos.obtenerPromedioTarifas());
        
    }
}
