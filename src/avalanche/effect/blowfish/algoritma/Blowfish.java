/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avalanche.effect.blowfish.algoritma;

import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author aldiariq
 */
public class Blowfish {
    
    public String enkripsi(String myText, String key){
 
        try {
            SecretKeySpec KS = new SecretKeySpec(key.getBytes(), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(Cipher.ENCRYPT_MODE, KS);
            byte[] encrypted = cipher.doFinal(myText.getBytes());
            return Base64.getEncoder().withoutPadding().encodeToString(encrypted);
 
        } catch (Exception e) {
            return "ERROR:"+e.getMessage();
        }
    }
 
    public String dekripsi(String chiperText, String key){
        try {
            SecretKeySpec KS = new SecretKeySpec(key.getBytes(), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(Cipher.DECRYPT_MODE, KS);
            byte[] decrypted = cipher.doFinal(Base64.getDecoder().decode(chiperText));
            return new String(decrypted);
 
        } catch (Exception e) {
            return "ERROR";
        }
 
    }
    
}
