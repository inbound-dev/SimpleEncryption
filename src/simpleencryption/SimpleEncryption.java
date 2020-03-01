/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simpleencryption;
import javax.swing.*;
/**
 *
 * @author joham3169
 */
public class SimpleEncryption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        int shiftAmount;
        int ParsedIn;
        int DecryptStepsInt;
        
        
        String PreParsedIn;
        String UserMessage;
        String Encrypted = "";
        String DecryptIn;
        String DecryptSteps;
        String Decrypted = "";
        
        boolean Encrypt = false;
        boolean Decrypt = false;

        
        String UserInput = JOptionPane.showInputDialog("Would you like to encrypt or decrypt");
        
        if(UserInput.equals("1") ||UserInput.equals("encrypt") ){
                Encrypt = true;      
        }
        else{
            Encrypt = false;
            Decrypt = true;
        }
        while(Encrypt == true && Decrypt == false){
            Encrypt = false;
            PreParsedIn = JOptionPane.showInputDialog("OK! How Many Steps in the encryption?");
            
            ParsedIn = Integer.parseInt(PreParsedIn);
            shiftAmount = ParsedIn;  
            
            UserMessage = JOptionPane.showInputDialog("Finally, What is The Message");
            
            for(int i = 0; i < UserMessage.length(); i++){
                int UnicodeValues = UserMessage.charAt(i) + shiftAmount;
                Encrypted += (char)UnicodeValues;
                
            }
            System.out.println(Encrypted);
            
        }
        while(Decrypt == true && Encrypt == false){
            Decrypt = false;
            
            DecryptSteps = JOptionPane.showInputDialog("How Mant Steps Were in the Encryption?");
            DecryptStepsInt = Integer.parseInt(DecryptSteps);
            
            DecryptIn = JOptionPane.showInputDialog("OK! What is The Encrypted Message?");
            
            for(int i = 0; i < DecryptIn.length(); i++){
                int UnicodeValues = DecryptIn.charAt(i) - DecryptStepsInt;
                Decrypted += (char)UnicodeValues;
            }
            System.out.println(Decrypted);
            
            
        }
    }
    
}