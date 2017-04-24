package material.com.materialmodule.Singleton;

/**
 * @author: yuanbing
 * @date: 2017-04-24 19:41
 * @description <描述当前版本功能>
 */
public class Singleton {
    /****
     * 恶汉模式
     */
    private Singleton() {
    }

    private static final Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}
