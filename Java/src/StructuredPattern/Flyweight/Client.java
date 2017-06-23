package StructuredPattern.Flyweight;

/**
 * Created by uonele on 2016/12/12.
 */
public class Client {
    public static void main(String[] args){
        Flyweight flyweight;
        ShareStringFactory shareStringFactory = new ShareStringFactory();
        flyweight = shareStringFactory.getString("Java");
        flyweight.setColor(new Color("黄色"));
        flyweight.setSize(new Size(8));
        flyweight.show();
    }
}
