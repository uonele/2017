package BehavioralPattern.Mediator;

/**
 * Created by uonele on 2016/12/25.
 */
public class America extends Country {
    @Override
    public void getMessage(String message) {
        System.out.println("美国获取信息："+message);
    }
}
