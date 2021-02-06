package com.tx.byJava.config;

import com.tx.byJava.service.IEquip;
import com.tx.byJava.service.IUserService;
import com.tx.byJava.service.impl.SwimEquip;
import com.tx.byJava.service.impl.SwimUser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ByJavaConfig {

    @Bean
    public IUserService swimUserService(){
        return new SwimUser();
    }

    //bean之间的依赖关系
    @Bean
    public IEquip equip(){
        return new SwimEquip();
    }

    @Bean
    public IUserService relyOn(IEquip equip){ //通过构造方法的方式注入bean
        return new SwimUser(equip);
    }

}
