package run;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ：tx
 * @description：@scope的测试类
 * @date ：Created in 2019/1/18 15:00
 * @modified By：
 * @version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AutoConfig.class})
public class RunTest {

   @Autowired
   @Qualifier(value = "singleStudy")
   Study study;


   @Test
   public void testPrototype(){
      study.study();
   }
}
