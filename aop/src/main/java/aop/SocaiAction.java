package aop;

/**
 * @author ：tx
 * @description：社会行为
 * @date ：Created in 2019/1/23 13:40
 * @modified By：
 * @version: 1.0
 */
public class SocaiAction implements Action {
    @Override
    public void makeMoney() {
        System.out.println("拥有社会行为 ---赚钱");
    }
}
