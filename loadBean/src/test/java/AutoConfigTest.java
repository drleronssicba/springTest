import com.tx.byJava.config.AutoConfig;
import com.tx.byJava.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AutoConfig.class)
public class AutoConfigTest {
    @Autowired
    @Qualifier("sportUser")
    IUserService userService;

    @Test
    public void  testCreateBean(){
        userService.study();
    }

}
