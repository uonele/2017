package BehavioralPattern.Template;

/**
 * Created by uonele on 2016/12/25.
 */
public class Client {
    public static void main(String[] args){
        Account account =new CurrentAccount(5000);
        account.show();
    }
}
