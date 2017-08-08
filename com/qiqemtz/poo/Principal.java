public class Principal {
    public static void main(String args[]){
        
        Vehiculo miVehiculo = new Vehiculo();
        miVehiculo.marca = "Hyundai";
        miVehiculo.modelo = "i10";
        miVehiculo.anio = 2014;

        System.out.println(miVehiculo.marca);
    }
}