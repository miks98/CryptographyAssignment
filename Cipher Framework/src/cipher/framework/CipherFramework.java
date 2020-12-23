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
        System.out.println("==============================================");
        System.out.println("Please Select the Cipher technique you want to run");
        System.out.println("Press 1 for PlayFair Cipher");
        System.out.println("Press 2 for Hill Cipher");
        System.out.println("\n\n Enter your option: ");
        int val = sc.nextInt();
        
        System.out.println("==============================================");
        if (val == 1) {
        Playfair_cipher pf = new Playfair_cipher();
        System.out.println("==============================================");
        System.out.println("Enter Keyword");
        String pk =sc.next();
        pf.setKey(pk);
        pf.generate_key();
        System.out.println("==============================================");
        System.out.println("Enter Text to Encrypt:  ");
        String text_pe =sc.next();
        String pe =pf.encrypt(text_pe);
        System.out.println("The Encrypted Text is   "+pe);
        System.out.println("==============================================");
        System.out.println("Enter Text to Decrypt");
        String text_pd =sc.next();
        String pd = pf.decrypt(text_pd);
        System.out.println("The Decrypted Text is    "+pd);
        System.out.println("==============================================");
        }
      /*  else if (val == 2) {
        
        
        System.out.println("Enter Keyword");
        String hk =sc.next();
       // hf.setKey(hk);
        hf.generate_key();
        System.out.println("Enter Text to Encrypt");
        String text_he =sc.next();
        hf.encrypt(text_he);
        
        System.out.println("Enter Text to Decrypt");
        String text_hd =sc.next();
        hf.decrypt(text_hd);
        }*/
        else{
            System.out.println("Press any key to Exit");
        }
        
        
            
        
    }
    
}
