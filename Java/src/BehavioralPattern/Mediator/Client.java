package BehavioralPattern.Mediator;

/**
 * Created by uonele on 2016/12/25.
 */
public class Client {
    public static void main(String[] args){
    WTO wto = new WTO();
    China ch = new China();
    America am = new America();
    wto.setAmerica(am);
    wto.setChina(ch);
    ch.declare("中国发言了");
    am.declare("美国发言了");
    }
}
