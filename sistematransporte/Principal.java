package sistematransporte;

import basedatos.DataBase;
import vehiculos.Taxi;
import vehiculos.TaxiCRUD;

import java.sql.SQLException;

public class Principal {
    public static void main(String args[]) throws SQLException {
        
        /*Vehicle miVehiculo = new Vehicle("GXP666", "Honda");

        System.out.println(miVehiculo.getMarca());

        ArrayList<Vehicle> miLista = new ArrayList<Vehicle>();
        miLista.add(miVehiculo);

        miLista.add(new Vehicle("KKK999", "Nissan", "EX", 1990));

        for (Vehicle vehiculo: miLista){
            System.out.println(vehiculo.getMatricula());
            System.out.println(vehiculo.getMarca());
            System.out.println(vehiculo.getAnio());
            System.out.println(vehiculo.getModelo());
        }*/

        //DataBase bd = new DataBase();
        //bd.connect();

        Taxi taxi = new Taxi("AAA123", "Hyundai", "Accent", 2017);

        TaxiCRUD taxiCrud = new TaxiCRUD();

        taxiCrud.add(taxi);
    }
}