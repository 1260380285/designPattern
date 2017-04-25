package material.com.materialmodule.Proxy_1;

import java.lang.reflect.InvocationHandler;


/**
 * @author: yuanbing
 * @date: 2017-04-25 16:20
 * @description 动态代理模式
 */
public class TestProxy {

    public static void main(String[] args) {
        IGamePlayer gamePlayer = new GamePlayer("zhangshan");
        InvocationHandler gamePlayerProxy = new GamePlayerHandler(gamePlayer);
        IGamePlayer proxy = DynamicProxy.newProxyInstance(gamePlayer.getClass().getInterfaces(), gamePlayerProxy);
        System.out.println("begin time" + System.currentTimeMillis());
        proxy.login("zhangsan", "123456");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("end time" + System.currentTimeMillis());

    }
}
