/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2bucles;
/**
 *
 * @author Miguel
 */
public class JavaApplication2Bucles {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
         Number ob1 = new Number();
        
         
         ob1.solicitudCantNumeros();
         ob1.returnSumaNumeros();
         
         System.out.println("Numeros positivos: "+ob1.getPositivo());
         System.out.println("Numeros Negativos: "+ob1.getNegativo());
         System.out.println("Numero Neutro: "+ob1.getNeutro());
         
         
    }
}
