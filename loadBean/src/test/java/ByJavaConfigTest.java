import com.tx.byJava.config.ByJavaConfig;
import com.tx.byJava.service.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/*@RunWith(SpringJUnit4ClassRunner.class) //1.创建spring上下文
@ContextConfiguration(classes = ByJavaConfig.class) //2.运行config文件 即加载对象 */
public class ByJavaConfigTest {

   /* @Resource(name = "swimUserService") //3.注入对象
    IUserService user;*/

   //测试bean的创建
    @Test
    public void  testCreateBean(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(ByJavaConfig.class); //1.获取上下文对象  2.把bean装入到容器中
        IUserService swimUser = (IUserService) ac.getBean("swimUserService"); //3.获取bean
        swimUser.study();
    }

    //测试bean之间的依赖关系
    @Test
    public void  testRelyOnBean(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(ByJavaConfig.class);
        IUserService swimUser = (IUserService) ac.getBean("relyOn");
        swimUser.study();
    }

}
