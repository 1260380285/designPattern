package material.com.materialmodule.Mediator;

/**
 * @author: yuanbing
 * @date: 2017-04-26 10:20
 * @description <描述当前版本功能>
 */
public abstract class AbstractMediator {

    protected Purchase purchase;

    protected Saler saler;

    protected Stock stock;

    public AbstractMediator() {
        this.purchase = new Purchase(this);
        this.saler = new Saler(this);
        this.stock = new Stock(this);
    }

    public abstract void execute(String str, Object... objects);
}
