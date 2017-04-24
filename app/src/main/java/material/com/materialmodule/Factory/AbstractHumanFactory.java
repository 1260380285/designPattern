package material.com.materialmodule.Factory;

/**
 * @author: yuanbing
 * @date: 2017-04-24 20:06
 * @description <描述当前版本功能>
 */
public abstract class AbstractHumanFactory {

    public abstract <T extends Human> T createHuman(Class<T> c);
}
