package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author ：tx
 * @description：切面
 * @date ：Created in 2019/1/21 19:40
 * @modified By：
 * @version: 1.0
 */
@Component
@Aspect
public class AopDoing {
    @Pointcut(value = "execution(* *.play(..))")
    public void aopMethod(){}

    @Before("aopMethod()")
    public void beforePlay(){
        System.out.println("before 鼓掌鼓掌！");
    }

    @After(value="execution(* aop.Player.play(..))") //在切入点结尾处切入内容
    public void afterPlay(){
        System.out.println("after 起立");
    }

    @AfterReturning(value="execution(* aop.Player.play(..))") //在切入点返回内容后 切入内容
    public void afterReturnPlay(JoinPoint joinPoint){
        System.out.println(joinPoint.getArgs());
        System.out.println("after return 再次起立");
    }

    @AfterThrowing(value="execution(* *.play(..))")
    public void afterThrowingPlay(){
        System.out.println("after throwing 打铁了");
    }

}
