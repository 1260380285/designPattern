package material.com.materialmodule.Commend;

/**
 * @author: yuanbing
 * @date: 2017-04-26 13:30
 * @description 命令模式
 */
public class TestCommand {

    public static void main(String[] args) {
        Command addRequestCommand = new AddRequestCommand();
        Invoker invoker = new Invoker();
        invoker.setCommand(addRequestCommand);
        invoker.action();

        Command deleteCommand = new DeleteCommand();
        Invoker deleteInvoker = new Invoker();
        deleteInvoker.setCommand(deleteCommand);
        deleteInvoker.action();
    }
}
