package BehavioralPattern.Memento;

/**
 * Created by uonele on 2016/12/25.
 */
public class Chessman {
    private int x, y;
    private String lable;
    public Chessman(String lable,int x, int y){
        this.lable = lable;
        this.x = x;
        this.y = y;
    }
    public void setX(int x){
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
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
    public ChessmanMemento save( ){
        return new ChessmanMemento(this.lable, this.x, this.y);
    }
    public void restore(ChessmanMemento chessmanMemento){
        this.lable = chessmanMemento.getLable();
        this.x = chessmanMemento.getX();
        this.y = chessmanMemento.getY();
    }
}
