package driver;

import vehiculos.Bus;

public class DriverBus extends Driver {
    private Bus bus;

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public DriverBus(String nombre, String tipoLicencia) {
        super(nombre, tipoLicencia);
    }

    @Override
    public void mostrarVehiculo(){
        super.mostrarVehiculo();
        System.out.println(getBus().getMarca());
    }
}
