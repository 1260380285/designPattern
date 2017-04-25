package material.com.materialmodule.Builder_1;

import java.util.ArrayList;

/**
 * @author: yuanbing
 * @date: 2017-04-25 15:24
 * @description <描述当前版本功能>
 */
public class BWMBuilder extends CarBuilder {
    private BMWModel bmwModel = new BMWModel();

    @Override
    protected CarModel getCarModel() {
        return bmwModel;
    }

    @Override
    protected void setSequence(ArrayList<String> sequence) {
        bmwModel.setSequence(sequence);
    }
}
