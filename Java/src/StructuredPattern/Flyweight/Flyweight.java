package StructuredPattern.Flyweight;

/**
 * Created by uonele on 2016/12/12.
 */
public class Flyweight {
    private String content = "";
    private Color color;
    private Size size;
    public Flyweight(String content){
        this.content = content;
    }
    public void setColor(Color color){
        this.color = color;
    }
    public void setSize(Size size){
        this.size = size;
    }
    public void show(){
        System.out.println("初始化了一个大小为："+String.valueOf(this.size.getSize()) + "  颜色为：" + this.color.getColor() + "" +
                "字体");
    }
}
