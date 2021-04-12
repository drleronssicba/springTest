package scope;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ：tx
 * @description：@scope的测试类
 * @date ：Created in 2019/1/18 15:00
 * @modified By：
 * @version: 1.0
 */
/*@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AutoConfig.class})*/
public class ScopeTest {

//    @Autowired
//    Study study;
//
//    @Test
//    public void testSingle(){
//        study.study();
//    }

   @Test
   public void testPrototype(){
       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoConfig.class);
       Study s1 = context.getBean(PrototypeStudy.class);
       Study s2 = context.getBean(PrototypeStudy.class);
       System.out.println(s1==s2);
       s1.study();
   }
}
