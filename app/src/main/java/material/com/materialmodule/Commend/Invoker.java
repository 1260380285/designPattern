package material.com.materialmodule.Commend;

/**
 * @author: yuanbing
 * @date: 2017-04-26 13:29
 * @description <描述当前版本功能>
 */
public class Invoker {

    private Command command;


    public void setCommand(Command command){
        this.command=command;
    }

    public void action(){
        this.command.execute();
    }
}
