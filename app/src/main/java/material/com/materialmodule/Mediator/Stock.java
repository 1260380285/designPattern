package material.com.materialmodule.Mediator;

/**
 * @author: yuanbing
 * @date: 2017-04-26 10:16
 * @description 库存
 */
public class Stock extends Colleague {

    private static int COMPUTER_NUMBER = 100;

    public Stock(AbstractMediator mediator) {
        super(mediator);
    }

    public void increase(int number) {
        COMPUTER_NUMBER = COMPUTER_NUMBER + number;
    }

    public void descrease(int number) {
        COMPUTER_NUMBER = COMPUTER_NUMBER - number;
    }

    public int getStockNum() {
        return COMPUTER_NUMBER;
    }

    public void clearStock() {
        super.mediator.execute("stock clear");
    }
}
