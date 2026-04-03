/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.cc.fc.substitucion.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;//
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
/**
 *
 * @author Usuario
 */
public class CaesarCipherServiceTest {
    private final CaesarCipherService cipher = new CaesarCipherService(5);
    
    
    @Test
    public void testEncryptBasic(){
        String input = "abc";
        String expected = "fgh";
        assertEquals(expected,cipher.encrypt(input));
    } 
    @Test
    public void testDecryptBasic(){
        String input ="fgh";
        String expected ="abc";    
        assertEquals(expected,cipher.decrypt(input));
    }
    @Test
    public void testEncryptDecryptIdentoty(){
        String input ="Hello world!";
        String encrypted = cipher.encrypt(input);
        String decrypted = cipher.decrypt(encrypted);
        assertEquals(input,decrypted);
    }
    @Test
    public void testWrapAround(){
        String input = "xyz";
        String excepted = "cde";
        assertEquals(excepted, cipher.encrypt(input));
    }
    @Test
    public void testNonLetters() {
        String input = "Hello worlds !!! 123.";
        String encrypted = cipher.encrypt(input);
        assertTrue(encrypted.contains("!"));
        assertTrue(encrypted.contains("."));
        assertTrue(encrypted.contains("123"));
        assertFalse(encrypted.contains("?"));
    }
    
    public void testUpperCase(){
        String input = "ABC";
        String expected ="FGH";
        assertEquals(expected, cipher.encrypt(input));
        
    }
    
}


