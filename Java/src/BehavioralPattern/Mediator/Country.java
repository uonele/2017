package BehavioralPattern.Mediator;

/**
 * Created by uonele on 2016/12/25.
 */
abstract class Country {
    private UN un;
    void setUN(UN un){
        this.un = un;
    }
    void declare(String message){
        un.declare(message,this);
    }
    public abstract void getMessage(String message);
}
