package material.com.materialmodule.Mediator;

/**
 * @author: yuanbing
 * @date: 2017-04-26 10:16
 * @description <描述当前版本功能>
 */
public class Mediator extends AbstractMediator {

    @Override
    public void execute(String str, Object... objects) {
        if (str.equals("sell")) {
            sellComputer((Integer) objects[0]);
        } else if (str.equals("buy")) {
            buyComputer(200);
        } else if (str.equals("off sell")) {
            offSale();
        } else if (str.equals("stock clear")) {
            clearStock();
        }
    }

    private void buyComputer(int number) {
        int saleStatus = super.saler.getSaleStatus();
        if (saleStatus > 80) {
            System.out.println("采购电脑" + number);
            super.stock.increase(number);
        } else {
            int buyNumber = number / 2;
            System.out.println("采购电脑-" + buyNumber);
        }
    }

    private void sellComputer(int number) {
        if (super.stock.getStockNum() < number) {
            super.stock.descrease(120);
        }
        super.stock.descrease(20);
        System.out.println("卖出电脑" + number);
    }

    private void offSale() {
        System.out.println("折价销售" + stock.getStockNum());
    }


    private void clearStock() {
        super.saler.offSale();
        super.purchase.refuseComputer();
        System.out.println("清空库存");
    }
}
