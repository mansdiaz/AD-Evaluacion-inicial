/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ad.evaluacioninicial;

/**
 *
 * @author TuNombre
 */
public class ProgramacionBasica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] numeros = {5,3,1,0,7};
       
       for (int i = 0;i<numeros.length;i++){
           System.out.println("Posición " + i + ": " + numeros[i]);
       }
       
        System.out.println("\n" + "Al revés" + "\n");
        
        for (int i = numeros.length - 1;i>=0;i--){
           System.out.println("Posición " + i + ": " + numeros[i]);
       }
    
    }
    
    
    
}
