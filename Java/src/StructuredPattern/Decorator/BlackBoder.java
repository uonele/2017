package StructuredPattern.Decorator;

/**
 * Created by uonele on 2016/12/12.
 */
public class BlackBoder extends Decorator{
    public BlackBoder(Component component) {
        super(component);
    }
    public void show(){
        System.out.print("初始化一个黑色边框的");
        component.showContent();
    }
}
