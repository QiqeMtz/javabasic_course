package practicas;

import java.io.FileWriter;

public class IO_data {
    public static void main(String[] args) {
        String text = "Hola PlatziJava";
        String fileRoute = "/Users/qiqemtz/Documents/Cursos/Java_Basic_Platzi/";
        String fileName = "myfile.txt";

        try {
            FileWriter file = new FileWriter(fileRoute+fileName);
            file.write(text);
            file.close();
        } catch (Exception e) {

        }
    }
}
