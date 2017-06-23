package BehavioralPattern.State;

/**
 * Created by uonele on 2016/12/25.
 */
public class FinalState extends RollState{
    public FinalState(RollState rollState){
        this.roll = rollState.roll;
        this.point = rollState.point;
        this.grade = rollState.grade;
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
        if(result.equalsIgnoreCase("win")){
            this.point += 2 * score;
            System.out.println(this.roll.getName()+"获胜，加 2 * "+score+" 分,当前积分："+this.point);
        }else if(result.equalsIgnoreCase("lose")){
            this.point -= 2 * score;
            System.out.println(this.roll.getName()+"失败，扣 2 *"+score+" 分,当前积分："+this.point);
        }
        this.check();
    }

    @Override
    public void changeCards() {
        this.point -= 800;
        System.out.println(this.roll.getName()+"换牌，扣 "+800+" 分,当前积分："+this.point);
        this.check();
    }

    @Override
    public void peekCards() {
        this.point -= 1000;
        System.out.println(this.roll.getName()+"作弊，扣 "+1000+" 分,当前积分："+this.point);
        this.check();
    }

    @Override
    public void check() {
        if(this.point < 3000 ){
            this.roll.setRollState(new PrimaryState(this));
        }else if(this.point < 5000){
            this.roll.setRollState(new SecondaryState(this));
        }else if(this.point < 10000){
            this.roll.setRollState(new ProState(this));
        }
    }
}
