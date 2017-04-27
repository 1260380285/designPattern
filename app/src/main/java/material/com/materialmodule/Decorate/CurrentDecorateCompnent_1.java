package material.com.materialmodule.Decorate;

/**
 * @author: yuanbing
 * @date: 2017-04-27 13:36
 * @description <描述当前版本功能>
 */
public class CurrentDecorateCompnent_1 extends DecorateComponent {

    public CurrentDecorateCompnent_1(Component component) {
        super(component);
    }

    private void init() {
        System.out.println("current CurrentDecorateCompnent_1 component init");
    }

    @Override
    protected void operate() {
        this.init();
        super.operate();
    }
}
