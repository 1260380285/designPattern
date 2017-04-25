package material.com.materialmodule.Builder;

import java.util.ArrayList;

/**
 * @author: yuanbing
 * @date: 2017-04-25 15:27
 * @description 建造者模式
 */
public class TestBuilder {
    public static void main(String[] args) {
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("start");
        sequence.add("alarm");
        sequence.add("stop");
        CarBuilder bezBuilder = new BezBuilder();
        bezBuilder.setSequence(sequence);
        CarModel carModel = bezBuilder.getCarModel();
        carModel.run();


        ArrayList<String> sequences = new ArrayList<>();
        sequences.add("start");
        sequences.add("stop");
        sequences.add("alarm");
        CarBuilder bwmBuilder = new BWMBuilder();
        bwmBuilder.setSequence(sequences);
        CarModel carModels = bwmBuilder.getCarModel();
        carModels.run();
    }
}
