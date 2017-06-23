package StructuredPattern.Decorator;

/**
 * Created by uonele on 2016/12/12.
 */
public class Client
{
    public static void main(String[] args){

        Component component;
        component = new TextView();
        System.out.println("_____________before______________________");
        component.showContent();
        System.out.println("_____________after______________________");
        System.out.println("黑框的：");
        BlackBoder blackBoder = new BlackBoder(component);
        blackBoder.show();
        System.out.println("滚动的：");
        Roll roll = new Roll(component);
        roll.show();
        System.out.println("黑框滚动的：");
        RollBlackBoder rollBlackBoder = new RollBlackBoder(component);
        rollBlackBoder.show();
    }
}
