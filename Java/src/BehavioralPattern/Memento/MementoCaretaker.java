package BehavioralPattern.Memento;

import java.util.ArrayList;

/**
 * Created by uonele on 2016/12/25.
 */
public class MementoCaretaker {
    private ArrayList arrayList = new ArrayList();

    public void setChessman(ChessmanMemento chessman){
        this.arrayList.add(chessman);
    }
    public ChessmanMemento getChessman(int i){
        return (ChessmanMemento)arrayList.get(i);
    }
}
