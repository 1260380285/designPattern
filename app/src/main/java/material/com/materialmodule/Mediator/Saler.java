package material.com.materialmodule.Mediator;

import java.util.Random;

/**
 * @author: yuanbing
 * @date: 2017-04-26 10:17
 * @description <描述当前版本功能>
 */
public class Saler extends Colleague {

    public Saler(AbstractMediator mediator) {
        super(mediator);
    }

    public void saleComputer(int number) {
        super.mediator.execute("sell", number);
    }

    public void offSale() {
        super.mediator.execute("off sell");
    }

    public int getSaleStatus() {
        Random random = new Random(System.currentTimeMillis());
        int status = random.nextInt();
        return status;
    }
}
