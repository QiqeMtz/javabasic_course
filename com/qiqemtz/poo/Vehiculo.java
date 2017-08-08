import org.omg.CORBA.PUBLIC_MEMBER;

public class Vehiculo {
    
    // ATRIBUTOS
    String matricula;
    String marca;
    String modelo;
    int anio;

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
}