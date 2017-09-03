/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author mfuen
 */
public class constructor2 {
   float radio;
    constructor2(float radio){
        this.radio=radio;
        calcularArea();
    }

    private void calcularArea() {
        System.out.println("El área del circulo es "+(3.1416*radio*radio));
    }

   
}
