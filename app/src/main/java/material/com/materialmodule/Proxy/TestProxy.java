package material.com.materialmodule.Proxy;

/**
 * @author: yuanbing
 * @date: 2017-04-25 16:20
 * @description 代理模式
 */
public class TestProxy {

    public static void main(String[] args) {
        IGamePlayer gamePlayerProxy = new GamePlayerProxy("zhangsan");
        System.out.println("begin time" + System.currentTimeMillis());
        gamePlayerProxy.login("zhangsan", "123456");
        gamePlayerProxy.killBoss();
        gamePlayerProxy.upgrade();
        System.out.println("end time" + System.currentTimeMillis());
    }
}
