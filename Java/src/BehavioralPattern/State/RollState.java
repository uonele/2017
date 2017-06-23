package BehavioralPattern.State;

/**
 * Created by uonele on 2016/12/25.
 */
abstract class RollState {
    protected int point;
    protected PlayerRoll roll;
    protected String grade;
    public abstract void play(int score, String result);
    public abstract void doubleScore(int score, String result);
    public abstract void changeCards();
    public abstract void peekCards();
    public abstract void check();
}
