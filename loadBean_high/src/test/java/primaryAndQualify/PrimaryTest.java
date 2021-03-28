package primaryAndQualify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ：tx
 * @description：测试类
 * @date ：Created in 2019/1/5 20:46
 * @modified By：
 * @version: 1.0
 */
@ContextConfiguration(classes = PrimaryConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class PrimaryTest {

    @Book
    @Autowired
    Study study;
//    @Qualifier("devStudy")



    @Test
    public void testPrimary(){
        study.study();
    }
}
