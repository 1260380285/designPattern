package material.com.materialmodule.Proxy_1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: yuanbing
 * @date: 2017-04-25 16:18
 * @description <描述当前版本功能>
 */
public class GamePlayerHandler implements InvocationHandler {

    Object object = null;

    public GamePlayerHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] objects) throws Throwable {
        return method.invoke(object, objects);
    }
}
