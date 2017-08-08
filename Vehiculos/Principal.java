package poov1;

import java.util.ArrayList;

public class Principal {
    public static void main(String args[]){
        
        Vehiculo miVehiculo = new Vehiculo("GXP666", "Honda");

        System.out.println(miVehiculo.getMarca());

        ArrayList<Vehiculo> miLista = new ArrayList<Vehiculo>();
        miLista.add(miVehiculo);

        miLista.add(new Vehiculo("KKK999", "Nissan", "EX", 1990));

        for (Vehiculo vehiculo: miLista){
            System.out.println(vehiculo.getMatricula());
            System.out.println(vehiculo.getMarca());
            System.out.println(vehiculo.getAnio());
            System.out.println(vehiculo.getModelo());
        }
    }
}