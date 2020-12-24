package cipher.framework;
// @author Omer & MIKS
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Omer and MIKS
 */
public class CipherFramework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
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
        else if (val == 2) {
        
        
        Hill_cipher obj = new Hill_cipher() {};
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the line: ");
        String line = in.readLine();
        System.out.println("Enter the key: ");
        String key = in.readLine();
        double sq = Math.sqrt(key.length());
        if (sq != (long) sq)
            System.out
                    .println("Invalid key length!!! Does not form a square matrix...");
        else
        {
            int s = (int) sq;
            if (obj.check(key, s))
            {
                System.out.println("Result:");
                obj.divide(line, s);
                obj.cofact(obj.keymatrix, s);
            }
        }
        
        }

        else{
            System.out.println("Error Encountered");
        }
    }
}
