package material.com.materialmodule.Factory;

/**
 * @author: yuanbing
 * @date: 2017-04-24 19:57
 * @description <描述当前版本功能>
 */
public class WhiteHuman implements Human{

    @Override
    public void getColor() {
        System.out.println("white color");
    }

    @Override
    public void getTalk() {
        System.out.println("white talk");
    }
}
