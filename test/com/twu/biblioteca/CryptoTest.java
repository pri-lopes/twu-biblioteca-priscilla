package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class CryptoTest {

    Crypto encrypter = new Crypto();

    public CryptoTest() throws Exception {

    }

    @Test
    public void shouldEncryptText() {
        String original = "potato";
        String encrypted = encrypter.encrypt(original);
        assertEquals("OKￒﾁD7\u0016\u001FAq￭4Z/ﾜﾃ", encrypted);
    }

    @Test
    public void shouldDecryptText() {
        String encrypted = "OKￒﾁD7\u0016\u001FAq￭4Z/ﾜﾃ";
        String original = encrypter.decrypt(encrypted);
        assertEquals("potato", original);
    }
}