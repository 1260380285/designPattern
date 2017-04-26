package material.com.materialmodule.Commend;

/**
 * @author: yuanbing
 * @date: 2017-04-26 13:25
 * @description <描述当前版本功能>
 */
public abstract class Command {

    protected Group codeGroup = new CodeGroup();

    protected Group addRequestGroup = new AddRequestGroup();

    protected abstract void execute();
}
