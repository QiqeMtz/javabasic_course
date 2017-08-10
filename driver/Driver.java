package driver;

public class Driver {
    private String nombre;
    private String tipoLicencia;

    public Driver(String nombre, String tipoLicencia) {
        this.nombre = nombre;
        this.tipoLicencia = tipoLicencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoLicencia() {
        return tipoLicencia;
    }

    public void setTipoLicencia(String tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }

    public void mostrarVehiculo(){
        System.out.println("Datos vehiculo");
    }
}
