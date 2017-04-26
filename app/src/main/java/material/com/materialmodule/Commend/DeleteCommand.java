package material.com.materialmodule.Commend;

/**
 * @author: yuanbing
 * @date: 2017-04-26 13:28
 * @description <描述当前版本功能>
 */
public class DeleteCommand extends Command {

    @Override
    protected void execute() {
        super.addRequestGroup.delete();
        super.codeGroup.delete();
    }
}
