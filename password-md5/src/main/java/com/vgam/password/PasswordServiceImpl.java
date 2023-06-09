package com.vgam.password;

import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Service
public class PasswordServiceImpl implements PasswordService {

    @Override
    public String hash(String input) {
        StringBuilder result = new StringBuilder();
        MessageDigest md;

        try {
            md = MessageDigest.getInstance("MD5");
            byte[] hashInBytes = md.digest(input.getBytes(StandardCharsets.UTF_8));

            for (byte b : hashInBytes) {
                result.append(String.format("%02x", b));
            }
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalArgumentException(e);
        }

        return result.toString();
    }

    @Override
    public String algorithm() {
        return "md5";
    }
}