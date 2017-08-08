package poov1;


public class Vehiculo {
    public Vehiculo(String matricula, String marca) {
        this.matricula = matricula;
        this.marca = marca;
    }

    public Vehiculo(String matricula, String marca, String modelo, int anio) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    // ATRIBUTOS
    private String matricula;
    private String marca;
    private String modelo;
    private int anio;

    // METODOS
    public void arrancar(){
        System.out.println("El vehiculo arrancó");
    }

    public void frenar(){
        System.out.println("El vehiculo freno");
    }

    public void reversa(){
        System.out.println("El vehiculo esta de reversa");
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}