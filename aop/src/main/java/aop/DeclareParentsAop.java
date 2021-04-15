package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * @author ：tx
 * @description：DecalreParents注解
 * @date ：Created in 2019/1/23 13:43
 * @modified By：
 * @version: 1.0
 */
@Component
@Aspect
public class DeclareParentsAop {

    @DeclareParents(value="aop.Player+",defaultImpl = SocaiAction.class)  //给aop.Player下的所有类  都添加SocailAction下的方法
    Action action;
}
