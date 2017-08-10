package vehiculos;

import basedatos.DataBase;

import java.sql.SQLException;
import java.sql.Statement;

public class TaxiCRUD {

    private final int V_TYPE = 1;

    public void add(Taxi taxi) throws SQLException {
        String query = "";
        Statement sentence = null;

        DataBase db = new DataBase();
        sentence = db.connect().createStatement();

        query = "INSERT INTO \"vehiculo\" " +
                "(\"matricula\", \"marca\", \"modelo\", \"anio\", \"id_tipo_vehiculo\") " +
                "VALUES ('"+ taxi.getMatricula() +"', '"+ taxi.getMarca() +"', '"+ taxi.getModelo() +"', " +
                "'"+ taxi.getAnio() +"', "+ V_TYPE +")";

        if (sentence.executeUpdate(query) > 0){
            System.out.printf("Record inserted!");
        } else {
            System.out.println("Can't insert the record");
            System.out.println(query);
        }
        db.disconnect();
    }

    public void editar(Taxi taxi){}

    public void eliminar(Taxi taxi){}
}
