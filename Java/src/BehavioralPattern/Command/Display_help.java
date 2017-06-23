package BehavioralPattern.Command;

/**
 * Created by uonele on 2016/12/22.
 */
public class Display_help implements FunctionButton{
    private My_System my_system;
    public Display_help(){
        my_system = new My_System();
    }
    @Override
    public void execute() {
        my_system.Open_help();
    }
}

