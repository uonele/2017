package StructuredPattern.Proxy;

/**
 * Created by uonele on 2016/12/12.
 */
public class Pic implements Application{
    private App app;
    @Override
    public void run() {
        System.out.print("使用代理来");
        app = new App();
        app.run();

    }
}
