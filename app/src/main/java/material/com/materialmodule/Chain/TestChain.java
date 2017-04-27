package material.com.materialmodule.Chain;

/**
 * @author: yuanbing
 * @date: 2017-04-27 11:23
 * @description <描述当前版本功能>
 */
public class TestChain {
    public static void main(String[] args) {
        CustomHandler firstCustomHandler = new FirstCustomHandler();
        CustomHandler secondCustomHandler = new SecondCustomHandler();
        CustomHandler thirdCustomHandler = new ThirdCustomHandler();
        firstCustomHandler.setCustomHandler(secondCustomHandler);
        secondCustomHandler.setCustomHandler(thirdCustomHandler);
        firstCustomHandler.doHandler("first", 400);
        firstCustomHandler.doHandler("first", 600);
    }
}
