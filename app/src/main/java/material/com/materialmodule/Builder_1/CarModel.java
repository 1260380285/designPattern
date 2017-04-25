package material.com.materialmodule.Builder_1;

import java.util.ArrayList;

/**
 * @author: yuanbing
 * @date: 2017-04-25 15:14
 * @description <描述当前版本功能>
 */
public abstract class CarModel {

    private ArrayList<String> sequence = new ArrayList<>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    final public void run() {
        for (int i = 0; i < sequence.size(); i++) {
            if (sequence.get(i).equals("start")) {
                this.start();
            } else if (sequence.get(i).equals("alarm")) {
                this.alarm();
            } else if (sequence.get(i).equals("stop")) {
                this.stop();
            }
        }
    }

    final public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }
}
