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
public class area {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); //Se crea el lector

        System.out.println("Por favor ingrese su nombre");//Se pide un dato al usuario

        String nombre = sc.nextLine(); //Se lee el nombre con nextLine() que retorna un String con el dato

        System.out.println("Bienvenido " + nombre + ". Por favor ingrese su edad");//Se pide otro dato al usuario

        int edad = sc.nextInt(); //Se guarda la edad directamente con nextInt()

        //Nótese que ya no hubo necesidad de usar parseInt() pues nextInt nos retorna un entero derectamente

        System.out.println("Gracias " + nombre + " en 20 años usted tendrá " + (edad + 20) + " años."); //Operacion numerica con la edad
    }
}
