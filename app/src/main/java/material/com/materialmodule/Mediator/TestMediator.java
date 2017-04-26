package material.com.materialmodule.Mediator;

/**
 * @author: yuanbing
 * @date: 2017-04-26 10:48
 * @description <描述当前版本功能>
 */
public class TestMediator {
    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();
        Purchase purchase = new Purchase(mediator);
        purchase.buyComputer(100);

        Saler saler = new Saler(mediator);
        saler.saleComputer(20);
        saler.offSale();

        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}
