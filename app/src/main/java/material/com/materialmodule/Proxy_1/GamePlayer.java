package material.com.materialmodule.Proxy_1;

/**
 * @author: yuanbing
 * @date: 2017-04-25 16:15
 * @description <描述当前版本功能>
 */
public class GamePlayer implements IGamePlayer {

    private String mName;

    public GamePlayer(String name) {
        this.mName = name;
    }

    @Override
    public void login(String userName, String password) {
        System.out.println("登录名：" + userName + "," + mName + "登录成功");
    }

    @Override
    public void killBoss() {
        System.out.println("kill boss");
    }

    @Override
    public void upgrade() {
        System.out.println("upgrade");
    }
}
