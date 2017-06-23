package BehavioralPattern.Command;

/**
 * Created by uonele on 2016/12/22.
 */
public class Exit_System implements FunctionButton{
    private My_System my_system ;
    public Exit_System(){
        my_system = new My_System();
    }
    @Override
    public void execute() {
        my_system.Exit_system();
    }
}
