package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author ：tx
 * @description：环绕通知
 * @date ：Created in 2019/1/21 20:58
 * @modified By：
 * @version: 1.0
 */
@Aspect
@Component
public class AroundAop {

    @Around(value = "execution(* *.play(..))")
    public void aroundAop(ProceedingJoinPoint jp){
        System.out.println("around 鼓掌");
        try {
            jp.proceed();
            System.out.println("around 起立");
        }catch (Throwable e){
            System.out.println("around 打铁了");
        }


    }
}
