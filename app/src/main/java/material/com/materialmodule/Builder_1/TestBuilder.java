package material.com.materialmodule.Builder_1;

/**
 * @author: yuanbing
 * @date: 2017-04-25 15:27
 * @description 建造者模式:主要功能是基本方法的调用的顺序的安排，也就是这些基本的方法已经实现了，通俗的说就是
 * 零件的装配，顺序不同产生的对象也不同，而工厂方法的重点是创建，创建零件是它的主要的职责，组装顺序则不是它关心的
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
