package material.com.materialmodule.Commend;

/**
 * @author: yuanbing
 * @date: 2017-04-26 13:24
 * @description <描述当前版本功能>
 */
public class AddRequestGroup extends Group {
    @Override
    protected void find() {
        System.out.println("add request find");
    }

    @Override
    protected void add() {
        System.out.println("add request add");
    }

    @Override
    protected void delete() {
        System.out.println("add request delete");
    }

    @Override
    protected void modify() {
        System.out.println("add request modify");
    }
}
