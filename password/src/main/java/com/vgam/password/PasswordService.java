package com.vgam.password;

public interface PasswordService {

    String hash(String input);
    String algorithm();
}