package com.tx.byJava.service.impl;

import com.tx.byJava.service.IEquip;
import com.tx.byJava.service.IUserService;

public class SwimUser implements IUserService {
    IEquip equip;

    public SwimUser(){}

    public SwimUser(IEquip equip){
        this.equip = equip;
    }

    @Override
    public void study() {
        System.out.println("i am swimming");
        if(equip != null) {
            equip.canDo();
        }
    }

    public void testSwimUser(){}
}
