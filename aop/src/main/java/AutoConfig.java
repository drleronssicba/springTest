import aop.BasketBallPlayer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author ：tx
 * @description：配置类
 * @date ：Created in 2019/1/21 19:48
 * @modified By：
 * @version: 1.0
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"aop"})
public class AutoConfig {
    /*(basePackageClasses = {BasketBallPlayer.class,aop.AopDoing.class})*/
}
