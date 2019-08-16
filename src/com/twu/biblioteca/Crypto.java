package com.twu.biblioteca;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;

public class Crypto {

    private String keyword = "thoughtworks2019";
    private Cipher cipher;
    private Key aesKey;

    public Crypto() throws Exception {
        this.aesKey = new SecretKeySpec(this.keyword.getBytes(), "AES");
        this.cipher = Cipher.getInstance("AES");
    }

    public String encrypt(String str) {
        try {
            this.cipher.init(Cipher.ENCRYPT_MODE, this.aesKey);
            byte[] encrypted = this.cipher.doFinal(str.getBytes());

            StringBuilder password = new StringBuilder();
            for (byte b : encrypted) {
                password.append((char) b);
            }

            return password.toString();
        } catch (Exception e) {
            return "An error occured on encrypting text";
        }
    }

    public String decrypt(String str) {
        try {
            byte[] password = new byte[str.length()];
            for (int i = 0; i < str.length(); i++) {
                password[i] = (byte) str.charAt(i);
            }

            this.cipher.init(Cipher.DECRYPT_MODE, this.aesKey);
            String decrypted = new String(this.cipher.doFinal(password));
            return decrypted;
        } catch (Exception e) {
            return "An error occured on decrypting text";
        }
    }
}
