package BehavioralPattern.Observer;

/**
 * Created by uonele on 2016/12/25.
 */
public class Players implements Player{
    private String name;
    public Players(String name){
        this.name = name;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void help() {
        System.out.println("坚持住，"+this.name+" 来支援了");
    }


    @Override
    public void beAttacked(Anemy anemy) {
        anemy.notify(this.name);
    }
}
