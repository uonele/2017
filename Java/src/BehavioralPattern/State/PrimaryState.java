package BehavioralPattern.State;

/**
 * Created by uonele on 2016/12/25.
 */
public class PrimaryState extends RollState{

    public PrimaryState(PlayerRoll roll){
        this.point = 0;
        this.grade = "入门级";
        this.roll = roll;
    }
    public PrimaryState(RollState rollState){
        this.point = rollState.point;
        this.grade = "入门级";
        this.roll = rollState.roll;
    }
    @Override
    public void play(int score, String result) {
        if(result.equalsIgnoreCase("win")){
            this.point += score;
            System.out.println(this.roll.getName()+"获胜，加 "+score+" 分,当前积分："+this.point);
        }else if(result.equalsIgnoreCase("lose")){
            this.point -= score;
            System.out.println(this.roll.getName()+"失败，扣 "+score+" 分,当前积分："+this.point);
        }
        this.check();
    }

    @Override
    public void doubleScore(int score, String result) {
        System.out.println("暂不支持该功能");
    }

    @Override
    public void changeCards() {
        System.out.println("暂不支持该功能");
    }

    @Override
    public void peekCards() {
        System.out.println("暂不支持该功能");
    }

    @Override
    public void check() {
        if(this.point >= 10000 ){
            this.roll.setRollState(new FinalState(this));
        }else if(this.point > 5000){
            this.roll.setRollState(new ProState(this));
        }else if(this.point > 3000 ){
            this.roll.setRollState(new SecondaryState(this));
        }
    }
}
