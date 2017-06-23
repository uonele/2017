package StructuredPattern.Proxy;

/**
 * Created by uonele on 2016/12/12.
 */
public class Client {
        public static void main(String[] args){
        System.out.println("不使用代理模式时结果如下：\n");
        App app = new App();
        app.run();

        System.out.println("使用代理模式时结果如下：\n");
        Pic pic = new Pic();
        pic.run();
    }
}
