package aop;

import org.aspectj.lang.ProceedingJoinPoint;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：tx
 * @description：定义在xml中的切面
 * @date ：Created in 2019/1/23 14:29
 * @modified By：
 * @version: 1.0
 */
public class XmlAop {

    /**
     保存运动员姓名 和对应的次数
     **/
    Map<String,Integer> countMap = new HashMap<String, Integer>();

    public void xmlBefore(){
        System.out.println("xml 鼓掌鼓掌");
    }

    public void xmlAfter(){
        System.out.println("xml 起立");
    }

    public void xmlAfterThrowing(){
        System.out.println("xml 打铁了");
    }


    public void xmlAround(ProceedingJoinPoint jp){
        System.out.println("aournd xml 鼓掌鼓掌");
        try {
            jp.proceed();
        } catch (Throwable throwable) {
            System.out.println("aournd xml 打铁了");
            throwable.printStackTrace();
        }
        System.out.println("aournd xml 起立");
    }

    public void beforeCount(String name){
        int nameCount = Integer.valueOf(getCount(name));
        countMap.put(name,++nameCount);
        System.out.println(name+"训练的次数是"+getCount(name));
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
