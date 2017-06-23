package BehavioralPattern.ChainOfResponsibility;

public class yingzhang extends Office{

    public yingzhang(String name){
        super(name);
    }
    @Override
    void handleRequest(Mission mission) {
        if (mission.num < 200){
            System.out.println("营长"+this.name +"下达作战命令。");

        }else {
            if (this.successor != null){
                this.successor.handleRequest(mission);
            }
        }
    }
}