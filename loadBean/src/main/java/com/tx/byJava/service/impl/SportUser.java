package com.tx.byJava.service.impl;

import com.tx.byJava.service.IUserService;
import org.springframework.stereotype.Component;

@Component
public class SportUser implements IUserService {

    @Override
    public void study() {
        System.out.println("i am studying sports skills");
    }
}
