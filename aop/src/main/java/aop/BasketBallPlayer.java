package aop;

import org.springframework.stereotype.Component;

/**
 * @author ：tx
 * @description：篮球运行员
 * @date ：Created in 2019/1/21 19:17
 * @modified By：
 * @version: 1.0
 */
@Component
public class BasketBallPlayer implements Player {
    @Override
    public void play() throws Exception {
        System.out.println("kobe play basketball!!");
        throw  new Exception("11");
    }

    @Override
    public void work(String playerName) {
        System.out.println(playerName+"is work!");
    }
}
