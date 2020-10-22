package com.macro.mall;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author zf
 * @create 2020-10-22 17:40
 */
public class PasswordTest {

    public static void main(String[] args){
        String pwd = "123456";
        String ePwd = encodePassword(pwd);
        System.out.println(pwd+"加密后： "+ePwd); //123456 加密后： $2a$10$8Jqr5OO5HKYKtPF3LIDMfu1sjRv4AHP3s9fDvCpqMhemxPeO3XUh6

    }

    public static String encodePassword(String password){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder.encode(password);
    }

}
