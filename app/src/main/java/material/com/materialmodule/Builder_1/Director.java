package material.com.materialmodule.Builder_1;

import java.util.ArrayList;

/**
 * @author: yuanbing
 * @date: 2017-04-25 15:38
 * @description <描述当前版本功能>
 */
public class Director {
    private CarBuilder bwmBuilder = new BWMBuilder();
    private CarBuilder bezBuilder = new BezBuilder();
    private ArrayList<String> sequence = new ArrayList<>();


    public CarModel getABezBuilder() {
        this.sequence.clear();
        sequence.add("start");
        sequence.add("stop");
        bezBuilder.setSequence(sequence);
        return bezBuilder.getCarModel();

    }

    public CarModel getABWMBuilder() {
        this.sequence.clear();
        sequence.add("start");
        sequence.add("alarm");
        bwmBuilder.setSequence(sequence);
        return bwmBuilder.getCarModel();
    }

}
