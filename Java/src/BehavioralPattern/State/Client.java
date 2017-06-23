package BehavioralPattern.State;

/**
 * Created by uonele on 2016/12/25.
 */
public class Client {
    public static void main(String[] args){

        PlayerRoll playerRoll = new PlayerRoll("吴文乐");  //初始化
        PrimaryState primaryState = new PrimaryState(playerRoll);
        playerRoll.setRollState(primaryState);
        System.out.println("******************************第一轮*****************************\n");
        playerRoll.play(2000,"win");
        playerRoll.doubleScore(450,"win");
        playerRoll.changeCards();
        playerRoll.peekCards();
        System.out.println("\n****************************第二轮*****************************\n");
        playerRoll.play(2000,"win");    //将等级调整到second
        playerRoll.doubleScore(450,"win");
        playerRoll.changeCards();
        playerRoll.peekCards();
        System.out.println("\n****************************第三轮*****************************\n");
        playerRoll.play(2000,"win");    //将等级调整到pro
        playerRoll.doubleScore(450,"win");
        playerRoll.changeCards();
        playerRoll.peekCards();
        System.out.println("\n****************************第四轮*****************************\n");
        playerRoll.play(5000,"win");    //将等级调整到second
        playerRoll.doubleScore(450,"win");
        playerRoll.changeCards();
        playerRoll.peekCards();
    }
}
