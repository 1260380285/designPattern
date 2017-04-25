package material.com.materialmodule.Proxy;

/**
 * @author: yuanbing
 * @date: 2017-04-25 16:18
 * @description <描述当前版本功能>
 */
public class GamePlayerProxy implements IGamePlayer, IProxy {

    private IGamePlayer gamePlayer;

    public GamePlayerProxy(String name) {
        this.gamePlayer = new GamePlayer(name);
    }

    @Override
    public void login(String userName, String password) {
        this.gamePlayer.login(userName, password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
        //有必要接口吗
        expendMoney();
    }

    @Override
    public void expendMoney() {
        System.out.println("花的费用总共是: 150元");
    }
}
