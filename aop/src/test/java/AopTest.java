import aop.Action;
import aop.Player;
import aop.WorkCountAop;
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

    @Autowired
    WorkCountAop workCountAop;

    @Test
    public void testAdvice(){
        try {
            player.play();
        }catch (Exception e){

        }
    }
    
    
    /**
     * @author tx
     * @description  测试被通知类 给通知传递参数
     * @date  2019/1/23 11:37
     * @param  * @Param: 
     * @return void
    **/
    @Test
    public void testParams(){
        player.work("kobe");
        System.out.println(workCountAop.getCount("kobe"));
    }


    /**
     * @author tx
     * @description  测试@DecalreParents
     *                  相当于让Player拥有了Action这个特性
     * @date  2019/1/23 14:00
     * @param  * @Param: 
     * @return void
    **/
    @Test
    public void testDecalreParents(){
        player.work("curry");
        Action action = (Action)player;
        action.makeMoney();
    }
}
