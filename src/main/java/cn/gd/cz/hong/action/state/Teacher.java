package cn.gd.cz.hong.action.state;

public class Teacher {

    public static void main(String[] args) {
        ScoreContext scoreContext = new ScoreContext();
        scoreContext.addScore(80);
        System.out.println("现在的状态是：" + scoreContext.getState());
        scoreContext.addScore(10);
        System.out.println("现在的状态是：" + scoreContext.getState());
        scoreContext.addScore(-25);
        System.out.println("现在的状态是：" + scoreContext.getState());
        scoreContext.addScore(-10);
        System.out.println("现在的状态是：" + scoreContext.getState());
    }

}/**
 * result:
 * 现在的状态是：State [score=80, stateName=良好]
 * 现在的状态是：State [score=90, stateName=优秀]
 * 现在的状态是：State [score=65, stateName=及格]
 * 现在的状态是：State [score=55, stateName=不及格]
 */
