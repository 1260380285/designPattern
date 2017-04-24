package material.com.materialmodule.Singleton;

/**
 * @author: yuanbing
 * @date: 2017-04-24 19:43
 * @description <描述当前版本功能>
 */
public class Singleton_1 {
    /***
     * 饱汉模式
     */
    private Singleton_1() {
    }

    private static volatile Singleton_1 instance;

    public static Singleton_1 getInstance() {
        if (instance == null) {
            synchronized (Singleton_1.class) {
                if (instance == null) {
                    instance = new Singleton_1();
                }
            }
        }
        return instance;
    }

}
