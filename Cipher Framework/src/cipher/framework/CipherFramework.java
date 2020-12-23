/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cipher.framework;

import java.util.Scanner;

/**
 *
 * @author Omer and MIKS
 */
public class CipherFramework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Select the Cipher technique you want to run");
        System.out.println("Press 1 for PlayFair Cipher");
        System.out.println("Press 2 for Hill Cipher");
        System.out.println("\n\n Enter your option: ");
        int val = sc.nextInt();
        
        if (val == 1) {
        Playfair_cipher pf;
        pf = new Playfair_cipher() {};
        pf.generate_key();
        pf.encrypt();
        pf.decrypt();
        }
        else if (true) {
            
        }
        else{
            System.out.println("Press any key to Exit");
        }
        
        
            
        
    }
    
}
