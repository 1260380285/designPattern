package material.com.materialmodule.Builder;

/**
 * @author: yuanbing
 * @date: 2017-04-25 15:20
 * @description <描述当前版本功能>
 */
public class BMWModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("BWM start");
    }

    @Override
    protected void stop() {
        System.out.println("BWM stop");
    }

    @Override
    protected void alarm() {
        System.out.println("BWM alarm");
    }
}
