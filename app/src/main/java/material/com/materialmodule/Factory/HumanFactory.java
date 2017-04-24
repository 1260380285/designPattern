package material.com.materialmodule.Factory;

/**
 * @author: yuanbing
 * @date: 2017-04-24 20:07
 * @description <描述当前版本功能>
 */
public class HumanFactory extends AbstractHumanFactory {

    @Override
    public <T extends Human> T createHuman(Class<T> c) {

        Human human = null;
        try {
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) human;
    }
}
