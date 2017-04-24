package material.com.materialmodule.Factory;

/**
 * @author: yuanbing
 * @date: 2017-04-24 20:10
 * @description <描述当前版本功能>
 */
public class TestFactory {

    public static void main(String[] args) {
        AbstractHumanFactory humanFactory = new HumanFactory();
        BlackHuman blackHuman = humanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.getTalk();

        WhiteHuman whiteHuman = humanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.getTalk();

        YellowHuman yellowHuman = humanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.getTalk();
    }
}
