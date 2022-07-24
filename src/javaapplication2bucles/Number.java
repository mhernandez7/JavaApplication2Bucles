/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2bucles;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Number {
     private float cantidadNumeros;
     private float number1;
     private float positivo;
     private float negativo;
     private float neutro;
     
     
     public Number(float cantidadNumeros, float number1)
     {
     this.cantidadNumeros = cantidadNumeros;
     this.number1 = number1;
     
     }
     
     public Number()
     {
        this.cantidadNumeros = 0;
        this.negativo = 0;
        this.neutro = 0;
        this.positivo = 0;
        this.number1 = 0;
     }
     public float getCantidadNumeros()
     {
     return cantidadNumeros;
     }

     public float getNegativo()
     {
     return negativo;
     }   
     public float getNeutro()
     {
     return neutro;
     }

    public float getPositivo() {
        return positivo;
    }

    public float getNumber1() {
        return number1;
    }
    
    public void solicitudCantNumeros(){
        
        Scanner read = new Scanner(System.in);
        
        System.out.println ("ingrese la cantidad de numeros que va a digitar: ");
         this.cantidadNumeros = read.nextFloat();
     
    }
    
     public void returnSumaNumeros()
     {
        Scanner pala = new Scanner(System.in); 
     for (int i = 1; i<= this.cantidadNumeros;i++)
     {    
         System.out.println("ingrese el numero: "+i);
         this.number1 = pala.nextFloat();
         
         if (this.number1 >0)
         {
         this.positivo ++;
         }
         else  if (this.number1 <0)
         {
         this.negativo ++;
         }
         else
         {
         this.neutro ++;
         }
         
     }
}
}
