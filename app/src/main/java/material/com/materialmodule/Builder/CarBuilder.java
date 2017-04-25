package material.com.materialmodule.Builder;

import java.util.ArrayList;

/**
 * @author: yuanbing
 * @date: 2017-04-25 15:23
 * @description <描述当前版本功能>
 */
public abstract class CarBuilder {

    protected abstract CarModel getCarModel();

    protected abstract void setSequence(ArrayList<String> sequence);
}
