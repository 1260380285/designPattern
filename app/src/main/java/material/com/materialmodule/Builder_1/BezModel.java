package material.com.materialmodule.Builder_1;

/**
 * @author: yuanbing
 * @date: 2017-04-25 15:20
 * @description <描述当前版本功能>
 */
public class BezModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("Bez start");
    }

    @Override
    protected void stop() {
        System.out.println("Bez stop");
    }

    @Override
    protected void alarm() {
        System.out.println("Bez alarm");
    }
}
