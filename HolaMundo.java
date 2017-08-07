import java.util.Arrays;

public class HolaMundo {
    public static void main(String[] args){
        System.out.print("Hola Mundo\n");
        int [][] conjunto = new int[3][4];
        for(int i = 0; i<3; i++){
            for(int j = 0; j<4; j++){
                conjunto[i][j] = 1;
            }
        }
        for(int i = 0; i<3; i++){
            for(int j = 0; j<4; j++){
                System.out.print(conjunto[i][j]);
            }
            System.out.println();
        }
    }
}