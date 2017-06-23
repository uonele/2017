package BehavioralPattern.Command;

/**
 * Created by uonele on 2016/12/22.
 */
public class Controller {
    private FunctionButton help,exit;
    public Controller(FunctionButton help,FunctionButton exit){
        this.help = help;
        this.exit = exit;
    }
    public void Display(){
        help.execute();
    }
    public void Exit(){
        exit.execute();
    }
}
