package condition;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConditionalConfig.class)
public class ConditionTest {
    @Autowired
  Study study;

    @Test
    public void testCondition(){
       /* ApplicationContext ac = new AnnotationConfigApplicationContext(ConditionalConfig.class);
        Study study = (Study)ac.getBean("deStudy");
        study.study();*/
        study.study();
    }

   @BeforeClass
    public static void setProty(){
        System.setProperty("dev","1");
    }
}