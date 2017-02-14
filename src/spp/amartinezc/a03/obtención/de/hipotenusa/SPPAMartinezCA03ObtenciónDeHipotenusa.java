/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.amartinezc.a03.obtención.de.hipotenusa;
import java.util.*;
/**
 *
 * @author andres
 */
public class SPPAMartinezCA03ObtenciónDeHipotenusa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
       double catetoA, catetoB, hipotenusa;
       Scanner kb=new Scanner(System.in);
        System.out.println("Teorema de pitágoras");
        
        System.out.println("Ingrese el valor del cateto A");
        catetoA=kb.nextDouble();
        System.out.println("Ingrese el valor del cateto B");
        catetoB=kb.nextDouble();
        
       //Operación matemática
       hipotenusa=Math.sqrt(Math.pow(catetoA,2)+Math.pow(catetoB,2)); //Métodos "Math.pow":para elevar a una potencia y "Math.sqrt" para obtener una raiz cuadrada
        
       //Mostrar resultado
        System.out.println("Hipotenusa= "+hipotenusa);
    }
}
    

