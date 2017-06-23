package BehavioralPattern.Observer;

/**
 * Created by uonele on 2016/12/25.
 */
public class Client {
    public static void main(String[] args){
        Anemy anemy = new Anemy();
        Players p1 = new Players("张三");
        Players p2 = new Players("王二");
        Players p3 = new Players("李四");

        anemy.join(p1);
        anemy.join(p2);
        anemy.join(p3);
        p1.beAttacked(anemy);
    }


}
