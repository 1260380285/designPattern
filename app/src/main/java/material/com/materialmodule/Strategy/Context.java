package material.com.materialmodule.Strategy;

/**
 * @author: yuanbing
 * @date: 2017-04-27 13:56
 * @description <描述当前版本功能>
 */
public class Context {

    private IStrategy iStrategy;

    public Context(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }

    public void operate() {
        iStrategy.operate();
    }
}
