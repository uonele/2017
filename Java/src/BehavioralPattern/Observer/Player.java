package BehavioralPattern.Observer;

/**
 * Created by uonele on 2016/12/25.
 */
interface Player {
    public String getName();
    public void setName(String name);
    public void help();
    public void beAttacked(Anemy anemy);
}
