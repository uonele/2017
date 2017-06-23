package BehavioralPattern.ChainOfResponsibility;

/**
 * Created by uonele on 2016/12/19.
 */
public abstract class Office {
    protected String name;
    protected Office successor = null;
    public Office(String name){
        this.name = name;
    }
    public void setSuccessor(Office successor){
        this.successor = successor;
    }
    abstract void handleRequest(Mission mission);
}
