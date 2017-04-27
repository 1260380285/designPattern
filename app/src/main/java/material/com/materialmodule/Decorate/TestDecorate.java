package material.com.materialmodule.Decorate;

/**
 * @author: yuanbing
 * @date: 2017-04-27 13:34
 * @description 装饰者模式
 */
public class TestDecorate {

    public static void main(String[] args) {
        Component component = new CurrentComponent();
        Component decorateCompnent = new CurrentDecorateComponent(component);
        decorateCompnent.operate();

        Component component1 = new CurrentComponent();
        Component decorateCompnent1 = new CurrentDecorateCompnent_1(component1);
        decorateCompnent1.operate();
    }
}
