package material.com.materialmodule.Chain;

/**
 * @author: yuanbing
 * @date: 2017-04-27 11:13
 * @description 责任链模式
 */
public abstract class CustomHandler {

    private CustomHandler customHandler;

    public void setCustomHandler(CustomHandler customHandler) {
        this.customHandler = customHandler;
    }

    public CustomHandler getCustomHandler() {
        return this.customHandler;
    }

    protected abstract void doHandler(String user,double money);

}
