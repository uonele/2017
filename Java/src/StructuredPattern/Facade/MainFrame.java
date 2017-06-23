package StructuredPattern.Facade;

/**
 * Created by uonele on 2016/12/12.
 */
public class MainFrame {
    OS os;
    CPU cpu;
    HardDisk hardDisk;
    Memory memory;
    public void on(){
        os = new OS();
        cpu = new CPU();
        hardDisk = new HardDisk();
        memory = new Memory();
        try{
            memory.check();
            cpu.run();
            hardDisk.read();
            os.load();
            System.out.println("开机成功");
        }catch (Exception e){
            System.out.println("开机失败");
        }

    }
    public void close(){
        try{
            os.shutdown();
            hardDisk.closeread();
            cpu.shutdown();
            memory.close();
            System.out.println("成功关闭");
        }catch (Exception e){
            System.out.println("成功失败");
        }
    }
    public static void main(String[] args){
        MainFrame mainFrame = new MainFrame();
        mainFrame.on();
        System.out.println("----------------------------");
        mainFrame.close();
    }
}
