/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.cc.fc.substitucion.App;

import pe.edu.uni.cc.fc.substitucion.service.CaesarCipherService;

/**
 *
 * @author Usuario
 */
public class MainCaesarCipher {
    public static void main(String[] args) {
        int key = 5;
        CaesarCipherService cipher = new CaesarCipherService(key);
        String original ="This is a plain text!";
        String encrypted = cipher.encrypt(original);
        String decrypted = cipher.decrypt(encrypted);
        
        System.out.println("Original: "+ original);
        System.out.println("Encrypted: "+ encrypted);
        System.out.println("Decrypted: "+decrypted);
    }
}
