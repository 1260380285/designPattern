package material.com.materialmodule.Builder_1;

/**
 * @author: yuanbing
 * @date: 2017-04-25 15:27
 * @description 建造者模式
 */
public class TestBuilder {
    public static void main(String[] args) {
        Director director = new Director();
        for (int i = 0; i < 10; i++) {
            CarModel aBezBuilder = director.getABezBuilder();
            aBezBuilder.run();
        }
        for (int i = 0; i < 10; i++) {
            CarModel abwmBuilder = director.getABWMBuilder();
            abwmBuilder.run();
        }
    }
}
