package material.com.materialmodule.Proxy_1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author: yuanbing
 * @date: 2017-04-25 19:54
 * @description <描述当前版本功能>
 */
public class DynamicProxy {

    public static <T> T newProxyInstance(Class<?>[] interfaces, InvocationHandler h){
        return (T)Proxy.newProxyInstance(h.getClass().getClassLoader(),interfaces,h);
    }
}
