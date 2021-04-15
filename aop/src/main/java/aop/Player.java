package aop;

/**
 * @author ：tx
 * @description：运动员接口
 * @date ：Created in 2019/1/21 19:15
 * @modified By：
 * @version: 1.0
 */
public interface Player {
    void play() throws Exception;

    /**
     * @author tx
     * @description  哪个运行员工作
     * @date  2019/1/23 11:21
     * @param  * @Param: playerName
     * @return void
    **/
    void work(String playerName);
}
