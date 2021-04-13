import aop.Player;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ：tx
 * @description：切面测试类
 * @date ：Created in 2019/1/21 19:53
 * @modified By：
 * @version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= AutoConfig.class)
public class AopTest {

    @Autowired
    Player player;

    @Test
    public void testAdvice(){
        try {
            player.play();
        }catch (Exception e){

        }
    }
}
