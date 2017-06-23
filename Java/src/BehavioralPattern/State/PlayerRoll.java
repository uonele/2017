package BehavioralPattern.State;

/**
 * Created by uonele on 2016/12/25.
 */
public class PlayerRoll {
    private String name;
    private RollState rollState;
    public PlayerRoll(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setRollState(RollState rollState){
        this.rollState = rollState;
    }
    public void play(int score, String result){
        this.rollState.play(score, result);
    }
    public void doubleScore(int score, String result){
        this.rollState.doubleScore(score, result);
    }
    public void changeCards(){
        this.rollState.changeCards();
    }
    public void peekCards(){
        this.rollState.peekCards();
    }
}
