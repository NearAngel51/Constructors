/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author mfuen
 */
import java.util.Scanner;
public class coche {
    Scanner sc=new Scanner(System.in);
    String gasolina;
    public coche(){
        //Constructor sin nada
    }
    public coche(String gasolina) {
        this.gasolina=gasolina;
        acelera();
    }
    public void acelera(){
        int cant=Integer.parseInt(gasolina);
        if(cant==0){
            System.out.println("Tu carro no ha avanzado, no tienes gasolina");
        }else{
            System.out.println("Tu carro ha avanzado "+(cant*2)+" kilometros");
            System.out.println("Segundo constructor---");
            System.out.println("Objeto-circulo, método obtenerArea()");
            System.out.println("Escriba el radio del circulo");
            constructor2 tel=new constructor2(sc.nextFloat());
        }
    }
}
