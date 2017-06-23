package StructuredPattern.Decorator;

/**
 * Created by uonele on 2016/12/12.
 */
public class RollBlackBoder extends Decorator{
    public RollBlackBoder(Component component) {
        super(component);
    }
    public void show(){
        System.out.print("加了黑框滚动条的");
        component.showContent();
    }
}
