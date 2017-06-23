package BehavioralPattern.Interpreter;

/**
 * Created by root on 16-12-23.
 */
public class NodeValue implements AbstractNode {
    private int value;
    public NodeValue(int value){
        this.value = value;
    }
    public int interpret() {
        return this.value;
    }

}
