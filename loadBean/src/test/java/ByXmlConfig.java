import com.tx.byJava.service.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ByXmlConfig {

    @Test
    public void testXmlConfig(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:byXmlConfig.xml");
        /*IUserService user = (IUserService) ac.getBean("itUser");
        user.study();*/
       /* IUserService user = (IUserService)ac.getBean("swimUser");
        user.study();*/

        IUserService user = (IUserService)ac.getBean("sportUser");
        user.study();
    }
}
