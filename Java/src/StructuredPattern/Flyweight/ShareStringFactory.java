package StructuredPattern.Flyweight;

import java.util.Hashtable;

/**
 * Created by uonele on 2016/12/12.
 */
public class ShareStringFactory {
    private Hashtable ht ;
    public ShareStringFactory(){
        ht = new Hashtable();
    }
    public Flyweight getString(String string){
        if(ht.containsKey(string)){
            return (Flyweight)ht.get(string);
        }else {
            Flyweight flyweight = new Flyweight(string);
            ht.put(string,flyweight);
            return (Flyweight)ht.get(string);
        }
    }
}
