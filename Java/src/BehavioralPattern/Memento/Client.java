package BehavioralPattern.Memento;

/**
 * Created by uonele on 2016/12/25.
 */
public class Client {
    private static int index = -1;
    private static MementoCaretaker mementoCaretaker = new MementoCaretaker();
    public static void main(String[] args){
        Chessman chessman = new Chessman("马",1,1);
        play(chessman);
        chessman.setX(3);
        play(chessman);
        chessman.setX(5);
        play(chessman);
        undo(chessman,index);
        undo(chessman,index);
        redo(chessman,index);
        redo(chessman,index);
    }
    public static void play(Chessman chessman){
        mementoCaretaker.setChessman(chessman.save());
        index++;
        System.out.println(chessman.getLable() + "当前位置：第"+ chessman.getX() +"行 , 第"+chessman.getY()+"列");
    }
    public static void undo(Chessman chessman, int i){
        System.out.print("悔棋 ,");
        index--;
        chessman.restore(mementoCaretaker.getChessman(i-1));
        System.out.println(chessman.getLable() + "当前位置：第"+ chessman.getX() +"行 , 第"+chessman.getY()+"列");
    }
    public static void redo(Chessman chessman, int i){
        System.out.print("撤销悔棋, ");
        index++;
        chessman.restore(mementoCaretaker.getChessman(i+1));
        System.out.println(chessman.getLable() + "当前位置：第"+ chessman.getX() +"行 , 第"+chessman.getY()+"列");
    }
}
