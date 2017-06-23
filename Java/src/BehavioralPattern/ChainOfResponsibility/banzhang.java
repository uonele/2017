package BehavioralPattern.ChainOfResponsibility;

public class banzhang extends Office{

    public banzhang(String name){
        super(name);
    }
    @Override
    void handleRequest(Mission mission) {
        if (mission.num < 10){
            System.out.println("班长"+this.name +"下达作战命令。");

        }else {
            if (this.successor != null){
                this.successor.handleRequest(mission);
            }
        }
    }
}
