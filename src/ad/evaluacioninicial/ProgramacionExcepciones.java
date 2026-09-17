/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ad.evaluacioninicial;

import java.util.Scanner;

/**
 *
 * @author awakte
 */
public class ProgramacionExcepciones {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a, b;
    double result;
        System.out.println("Introduce el primer numero");
        a = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce el segundo número");
        b = sc.nextInt();
        sc.nextLine();
        
        result = a / b;
        
        System.out.println("Resultado: " + result);
    
            
    }
    
}
