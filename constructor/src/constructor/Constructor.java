/*
    Constructores en Java
 **/
package constructor;

/**
 *
 * @author Fuentes Trejo Miguel Angel
 */
import java.util.Scanner;
public class Constructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Escriba cuanta gasolina desea ingresar al carro");
        coche auto=new coche(sc.nextLine());
    }
    
}
