package BehavioralPattern.Template;

/**
 * Created by uonele on 2016/12/25.
 */
public abstract class Account {
    protected double account;
    protected double tax;
    public Account(double account){
        this.account = account;
    }
    public void show(){
        System.out.println("利息为："+this.tax);
    }
    public abstract void setTax();
}
