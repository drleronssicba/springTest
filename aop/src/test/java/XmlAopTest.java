import aop.Action;
import aop.Player;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：tx
 * @description：xml aop测试类
 * @date ：Created in 2019/1/23 14:34
 * @modified By：
 * @version: 1.0
 */
public class XmlAopTest {

    /**
     * @author tx
     * @description  测试xml aop
     * @date  2019/1/23 14:35
     * @param  * @Param:
     * @return void
    **/
    @Test
    public void testXmlAop(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:AopResources.xml");
        Player player = (Player)ac.getBean("basketBallPlayer");
        try {
            player.play();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * @author tx
     * @description  测试传递参数
     * @date  2019/1/23 15:06
     * @param  * @Param:
     * @return void
    **/
    @Test
    public void testCountXmlAop(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:AopResources.xml");
        Player player = (Player)ac.getBean("basketBallPlayer");
       player.work("kobe");
       player.work("kobe");
    }


    /**
     * @author tx
     * @description  给player新特性
     * @date  2019/1/23 15:09
     * @param  * @Param: 
     * @return void
    **/
    @Test
    public void testDeclareParents(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:AopResources.xml");
        Player player = (Player)ac.getBean("basketBallPlayer");
        player.work("kobe");

        Action action  = (Action)player;
        action.makeMoney();
    }


}
