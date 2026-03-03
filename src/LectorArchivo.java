import java.io.*;
import java.util.Scanner;
public class LectorArchivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nombre del archivo: (archivo.txt)");
        String nombre = sc.nextLine();
        int lineas = 0;

        try(BufferedReader lector = new BufferedReader(new FileReader(nombre))){
            while (lector.readLine() != null){
                lineas++;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Numero de lineas: " + lineas);
    }
}