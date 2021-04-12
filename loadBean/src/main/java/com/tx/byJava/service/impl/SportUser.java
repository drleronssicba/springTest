package com.tx.byJava.service.impl;

import com.tx.byJava.service.IUserService;
import org.springframework.stereotype.Component;

@Component
public class SportUser implements IUserService {

    String userNmae;
    int age;

    public SportUser(){}

    public SportUser(String userName,int age){
        this.userNmae = userName;
        this.age = age;
    }

    @Override
    public void study() {
        System.out.println(userNmae+"---"+age+"--i am studying sports skills");
    }
}
