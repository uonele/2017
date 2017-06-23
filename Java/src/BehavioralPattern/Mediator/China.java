package BehavioralPattern.Mediator;

/**
 * Created by uonele on 2016/12/25.
 */
public class China extends Country {
    @Override
    public void getMessage(String message) {
        System.out.println("中国获取信息："+ message);
    }
}
