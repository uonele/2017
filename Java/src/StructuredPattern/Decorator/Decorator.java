package StructuredPattern.Decorator;

/**
 * Created by uonele on 2016/12/12.
 */
public class Decorator implements Component{
    Component component;
    public Decorator(Component component){
        this.component = component;
    }
    @Override
    public void showContent() {
        this.component.showContent();
    }
}
