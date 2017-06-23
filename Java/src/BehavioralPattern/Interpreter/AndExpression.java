package BehavioralPattern.Interpreter;

/**
 * Created by root on 16-12-23.
 */
public class AndExpression implements AbstractNode {
    private AbstractNode a,b;
    public AndExpression(AbstractNode a,AbstractNode b){
        this.a = a;
        this.b = b;
    }
    @Override
    public int interpret() {
        if (a.interpret() == 1 && b.interpret() == 1){
            return 1;
        }else {
            return 0;
        }
    }
}
