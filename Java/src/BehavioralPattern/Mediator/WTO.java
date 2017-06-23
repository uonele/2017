package BehavioralPattern.Mediator;

/**
 * Created by uonele on 2016/12/25.
 */
public class WTO extends UN{
    private China china;
    private America america;
    protected void setChina(China china){
        china.setUN(this);
        this.china = china;

    }
    protected void setAmerica(America america){
        america.setUN(this);
        this.america = america;
    }

    @Override
    void declare(String message, Country country) {
        if (country == this.china){
            this.china.getMessage(message);
        }else {
            this.america.getMessage(message);
        }
    }
}
