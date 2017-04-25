package material.com.materialmodule.Builder;

import java.util.ArrayList;

/**
 * @author: yuanbing
 * @date: 2017-04-25 15:23
 * @description <描述当前版本功能>
 */
public class BezBuilder extends CarBuilder {

    private BezModel bezModel = new BezModel();

    @Override
    protected CarModel getCarModel() {
        return bezModel;
    }

    @Override
    protected void setSequence(ArrayList<String> sequence) {
        bezModel.setSequence(sequence);
    }
}
