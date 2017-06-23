package BehavioralPattern.Interpreter;

/**
 * Created by uonele on 2016/12/14.
 */
public class Client {
    public static void main(String[] args){
        String string = "0 or 0";
        Context context = new Context();
        context.parse(string);
        int result = context.execute();
        System.out.println(string+"=="+result);
    }
}
