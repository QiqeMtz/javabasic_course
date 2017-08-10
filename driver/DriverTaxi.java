package driver;

import vehiculos.Taxi;


public class DriverTaxi extends Driver {
    public Taxi getTaxi() {
        return taxi;
    }

    public void setTaxi(Taxi taxi) {
        this.taxi = taxi;
    }

    private Taxi taxi;

    public DriverTaxi(String nombre, String tipoLicencia) {
        super(nombre, tipoLicencia);
        this.taxi = taxi;
    }

    @Override
    public void mostrarVehiculo(){
        super.mostrarVehiculo();
        System.out.println(getTaxi().getMatricula());
    }
}
