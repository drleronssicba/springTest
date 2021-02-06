package com.tx.byJava.service.impl;

import com.tx.byJava.service.IEquip;

public class SwimEquip implements IEquip {
    @Override
    public void canDo() {
        System.out.println("help swim");
    }
}
