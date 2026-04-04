/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.cc.fc.substitucion;

/**
 *
 * @author Usuario
 */
public class AffineCipher {
    
    public static String encrypt(String plainText,int a,int b){
        String result = "";
        return result;
        
    }
    public static String decrypt(String encryptText,int a ,int b){
        String result = "";
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println("Affine Cipher!");
        String original = "This is a plain text!";
        //key (A,B)
        int a = 11;
        int b = 6;
        String encrypted = encrypt(original,a,b);
        String decrypted = decrypt(encrypted,a,b);
        
        System.out.println("Original: "+ original);
        System.out.println("Encrypted:"+ encrypted);
        System.out.println("Decrypted: "+ decrypted);
    }
}
