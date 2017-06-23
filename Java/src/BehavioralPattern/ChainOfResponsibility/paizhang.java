package BehavioralPattern.ChainOfResponsibility;

public class paizhang extends Office{

    public paizhang(String name){
        super(name);
    }
    @Override
    void handleRequest(Mission mission) {
        if (mission.num < 50){
            System.out.println("排长"+this.name +"下达作战命令。");

        }else {
            if (this.successor != null){
                this.successor.handleRequest(mission);
            }
        }
    }
}