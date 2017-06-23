package BehavioralPattern.Command;

/**
 * Created by uonele on 2016/12/14.
 */
public class Client {
    public static void main(String[] args){
        FunctionButton help;
        FunctionButton exit = (FunctionButton)XMLUtil.getBean();
        help = new Display_help();
        Controller controller = new Controller(help,exit);
        controller.Display();
        controller.Exit();
    }
}
