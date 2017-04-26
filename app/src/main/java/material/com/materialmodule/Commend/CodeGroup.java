package material.com.materialmodule.Commend;

/**
 * @author: yuanbing
 * @date: 2017-04-26 13:24
 * @description <描述当前版本功能>
 */
public class CodeGroup extends Group {
    @Override
    protected void find() {
        System.out.println("code request find");
    }

    @Override
    protected void add() {
        System.out.println("code request add");
    }

    @Override
    protected void delete() {
        System.out.println("code request delete");
    }

    @Override
    protected void modify() {
        System.out.println("code request modify");
    }
}
