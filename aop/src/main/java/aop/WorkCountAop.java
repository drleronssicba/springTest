package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：tx
 * @description：计算运动员的训练次数
 * @date ：Created in 2019/1/23 11:23
 * @modified By：
 * @version: 1.0
 */
@Aspect
@Component
public class WorkCountAop {

    /**
      保存运动员姓名 和对应的次数
    **/
    Map<String,Integer> countMap = new HashMap<String, Integer>();

    @Pointcut(value = "execution(* aop.BasketBallPlayer.work(String))"+"&& args(workerName)")  //把被通知方法的参数赋给workerName
    public void countWork(String workerName){
    }

    @Before(value = "countWork(workerName)")
    public void beforeWork(String workerName){ //实现了被通知方法的参数转移到通知中
        int nameCount = Integer.valueOf(getCount(workerName));
        countMap.put(workerName,++nameCount);
        System.out.println(workerName+"训练的次数是"+getCount(workerName));
    }
    
    
    /**
     * @author tx
     * @description  获取当前运动员的训练次数
     * @date  2019/1/23 11:34
     * @param  * @Param: name
     * @return java.lang.Integer
    **/
    public Integer getCount(String name){
        return countMap.get(name) == null ? 0: countMap.get(name);
    }
    
    


}
