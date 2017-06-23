package BehavioralPattern.Observer;

import java.util.ArrayList;

/**
 * Created by uonele on 2016/12/25.
 */
public class Anemy {
    private ArrayList<Player> players = new ArrayList<Player>();
    public void join(Player player){
        players.add(player);
    }

    public void quit(Player player){
        players.remove(player);
    }
    public void notify(String name){
        System.out.println(name+" 被攻击了，请求支援");
        for(Object object : players){
           if (!((Player)object).getName().equalsIgnoreCase(name)){
              ((Player) object).help();
           }
        }
    }
}
