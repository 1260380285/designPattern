package material.com.materialmodule.Strategy;

/**
 * @author: yuanbing
 * @date: 2017-04-27 13:57
 * @description 策略模式
 */
public class TestStrategy {
    public static void main(String[] args) {
        IStrategy first = new FirstStrategy();
        Context context = new Context(first);
        context.operate();

        IStrategy secondStrategy = new SecondStrategy();
        Context context1 = new Context(secondStrategy);
        context1.operate();

        IStrategy thirdStrategy = new ThirdStrategy();
        Context context2 = new Context(thirdStrategy);
        context2.operate();
    }
}
