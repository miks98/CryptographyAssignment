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
        Cipher_Interface cf = new Playfair_cipher();
        System.out.println("Enter Keyword");
        String k =sc.next();
        pf.setKey(k);
        pf.generate_key();
        System.out.println("Enter Text to Encrypt");
        String text_e =sc.next();
        pf.encrypt(text_e);
        pf.decrypt();
        }
        else if (true) {
            
        }
        else{
            System.out.println("Press any key to Exit");
        }
        
        
            
        
    }
    
}
