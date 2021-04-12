package scope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author ：tx
 * @description：single
 * @date ：Created in 2019/1/18 14:52
 * @modified By：
 * @version: 1.0
 */
@Component
@Scope("singleton")  //spring默认是单例的
public class SingleStudy implements  Study {


    @Override
    public void study() {
        System.out.println("single scope+++");
    }
}
