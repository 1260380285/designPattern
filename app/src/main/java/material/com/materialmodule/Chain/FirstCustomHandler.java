package material.com.materialmodule.Chain;

/**
 * @author: yuanbing
 * @date: 2017-04-27 11:16
 * @description <描述当前版本功能>
 */
public class FirstCustomHandler extends CustomHandler {
    @Override
    protected void doHandler(String user, double money) {
        if (money < 500) {
            if (user.equals("first")) {
                System.out.println("报销" + user + ":" + money);
            } else {
                System.out.println("不予报销");
            }
        } else {
            if (getCustomHandler() != null) {
                getCustomHandler().doHandler(user, money);
            }
        }
    }
}
