/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cipher.framework;

/**
 *
 * @author Omer & MIKS
 */
public interface Cipher_Interface {
    
    
public  void generate_key();
public  String encrypt(String Source);
public  String decrypt(String Code);
public  void cryptoanalysis();


    
}
