package BehavioralPattern.Memento;

/**
 * Created by uonele on 2016/12/25.
 */
public class ChessmanMemento {
    private int x, y;
    private String lable;
    public ChessmanMemento(String lable, int x, int y){
        this.lable = lable;
        this.x = x;
        this.y = y;
    }
    public void setX(int x){
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    public String getLable() {
        return lable;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }
}
