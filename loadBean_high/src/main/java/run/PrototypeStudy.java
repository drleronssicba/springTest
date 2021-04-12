package run;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


/**
 * @author ：tx
 * @description：prototype
 * @date ：Created in 2019/1/18 14:52
 * @modified By：
 * @version: 1.0
 */
@Component
public class PrototypeStudy implements  Study {

    @Value("mercury")
    private String var;

    @Override
    public void study() {
        System.out.println(var+"prototype scope+++");
    }
}
