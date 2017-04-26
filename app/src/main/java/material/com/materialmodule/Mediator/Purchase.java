package material.com.materialmodule.Mediator;

/**
 * @author: yuanbing
 * @date: 2017-04-26 10:17
 * @description <描述当前版本功能>
 */
public class Purchase extends Colleague {

    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    public void buyComputer(int number) {
        super.mediator.execute("buy", number);
    }

    public void refuseComputer() {
        System.out.println("do not purchase computer");
    }
}
