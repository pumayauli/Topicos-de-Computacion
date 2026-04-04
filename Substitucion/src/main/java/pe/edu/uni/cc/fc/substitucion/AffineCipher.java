/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.cc.fc.substitucion;

import static pe.edu.uni.cc.fc.common.Constants.ALPHABET_SET_SIZE;

/**
 *
 * @author Usuario
 */
public class AffineCipher {
    
    public static String encrypt(String plainText,int a,int b){
        String result = "";
        for(int i=0;i<plainText.length();i++){
            char c = plainText.charAt(i);
            if(Character.isLetter(c)){
               System.out.println(c);   
               char offset = Character.isUpperCase(c)? 'A' : 'a';
               // x= c -offset
               c = (char)(((a*(c-offset)+b) % ALPHABET_SET_SIZE) + offset);
            }     
            result +=c;
        }
        return result;
        
    }
    public static String decrypt(String encryptText,int a ,int b){
        String result = "";
        //calculo del inverso modular
        int inv = 19;
        //
        for (int i=0;i<encryptText.length();i++){
            char c =encryptText.charAt(i);
            if(Character.isLetter(c)){
                char offset=Character.isUpperCase(c) ? 'A' : 'a';
                // x = c -offset
                int tmp = inv*(c-offset-b + ALPHABET_SET_SIZE);
                c = (char) (tmp % ALPHABET_SET_SIZE + offset);
                
            }
            result +=c;
        }
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
