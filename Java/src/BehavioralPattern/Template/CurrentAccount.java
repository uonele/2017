package BehavioralPattern.Template;

/**
 * Created by uonele on 2016/12/25.
 */
public class CurrentAccount extends Account{
    public CurrentAccount(double account){
        super(account);
        this.setTax();
    }
    @Override
    public void setTax() {
        this.tax = this.account * 0.05;
    }
}
