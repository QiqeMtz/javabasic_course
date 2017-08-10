package vehiculos;

import java.util.ArrayList;

public class Bus extends Vehicle {

    public ArrayList<String> getEstaciones() {
        return estaciones;
    }

    public void setEstaciones(ArrayList<String> estaciones) {
        this.estaciones = estaciones;
    }

    private ArrayList<String> estaciones = new ArrayList<String>();

    public Bus(String matricula, String marca, String modelo, int anio) {
        super(matricula, marca, modelo, anio);
    }
}
