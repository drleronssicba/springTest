package run;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


/**
 * @author ：tx
 * @description：single
 * @date ：Created in 2019/1/18 14:52
 * @modified By：
 * @version: 1.0
 */
@Component
public class SingleStudy implements  Study {
//    @Value( "${mercury}")
    @Value( "#{T(System).currentTimeMillis()}")
    private String var;
    @Override
    public void study() {
        System.out.println(var+"single scope+++");
    }
}
