package material.com.materialmodule.Mediator;

/**
 * @author: yuanbing
 * @date: 2017-04-26 10:20
 * @description <描述当前版本功能>
 */
public abstract class Colleague {

    protected AbstractMediator mediator;

    protected Colleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
