/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;
import java.util.Scanner;
/**
 *
 * @author Van
 */
public class Edad {

   public static void main(String[] args) {
        double area;
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese ancho del rectangulo");
        double a=sc.nextDouble();  
        System.out.println("ingrese alto del rectangulo");
        double b=sc.nextDouble(); 
        area=a*b;
        System.out.println(area);                
     }
}
    

