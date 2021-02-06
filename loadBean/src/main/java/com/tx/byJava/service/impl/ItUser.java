package com.tx.byJava.service.impl;

import com.tx.byJava.service.IUserService;
import org.springframework.stereotype.Component;

@Component
public class ItUser implements IUserService {
    @Override
    public void study() {
        System.out.println("i am studying java!");
    }
}
