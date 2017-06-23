package StructuredPattern.Decorator;

/**
 * Created by uonele on 2016/12/12.
 */
public class PictureView implements Component{
    @Override
    public void showContent() {
        System.out.println("展示图片");
    }
}
