package scope;

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
@Scope("prototype")
public class PrototypeStudy implements  Study {

    @Override
    public void study() {
        System.out.println("prototype scope+++");
    }
}
