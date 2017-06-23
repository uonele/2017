package BehavioralPattern.ChainOfResponsibility;

/**
 * Created by uonele on 2016/12/19.
 */
public class Mission {
    int num;
    String code ="";
    public Mission(String code,int num){
        this.code = code;
        this.num = num;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getCode(){
        return this.code;
    }
    public void setNum(int num){
        this.num = num;
    }
    public int getNum(){
        return this.num;
    }
}
