/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchcase;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class SwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // switch case 28/08
        String letra;
        Scanner leitor = new Scanner(System.in);
        letra = leitor.next();
        
        switch (letra) {
            case "a":
                System.out.println("Abacaxi");
                break;
            case "b":
                System.out.println("Banana");
                break;
            case "c":
                System.out.println("Caju");
                break;
            case "d":
                System.out.println("Damasco");
                break;
            default: 
                    System.out.println("Letra inválida");
                    
                
        }
        
    }
    
}
