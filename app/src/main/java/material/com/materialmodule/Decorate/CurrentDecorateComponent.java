package material.com.materialmodule.Decorate;

/**
 * @author: yuanbing
 * @date: 2017-04-27 13:32
 * @description <描述当前版本功能>
 */
public class CurrentDecorateComponent extends DecorateComponent {

    public CurrentDecorateComponent(Component component) {
        super(component);
    }

    private void init() {
        System.out.println("current CurrentDecorateComponent component init");
    }

    @Override
    protected void operate() {
        this.init();
        super.operate();
    }
}
