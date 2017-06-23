package StructuredPattern.Decorator;

/**
 * Created by uonele on 2016/12/12.
 */
public class Roll extends Decorator{
    public Roll(Component component) {
        super(component);
    }
    public void show(){
        System.out.print("加了滚动条的");
        component.showContent();

    }
}
