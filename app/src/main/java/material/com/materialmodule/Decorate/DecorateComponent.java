package material.com.materialmodule.Decorate;

/**
 * @author: yuanbing
 * @date: 2017-04-27 13:30
 * @description <描述当前版本功能>
 */
public abstract class DecorateComponent extends Component {
    private Component component;

    public DecorateComponent(Component component) {
        this.component = component;
    }

    @Override
    protected void operate() {
        this.component.operate();
    }
}
