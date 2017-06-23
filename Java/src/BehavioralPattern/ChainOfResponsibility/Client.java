package BehavioralPattern.ChainOfResponsibility;
import java.util.*;
/**
 * Created by uonele on 2016/12/14.
 */
public class Client {
    public static void main(String[] args){
        Mission mission = new Mission("abc",5);
        Office banzhang01 = new banzhang("李涛");
        Office paizhang01 = new paizhang("吴文乐");
        Office yingzhang01 = new yingzhang("张品");
        banzhang01.setSuccessor(paizhang01);
        paizhang01.setSuccessor(yingzhang01);
        banzhang01.handleRequest(mission);

    }
}
