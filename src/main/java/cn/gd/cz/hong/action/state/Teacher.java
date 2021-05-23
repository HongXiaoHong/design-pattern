package cn.gd.cz.hong.action.state;

public class Teacher {

    public static void main(String[] args) {
        ScoreContext scoreContext = new ScoreContext();
        scoreContext.addScore(80);
        System.out.println("���ڵ�״̬�ǣ�" + scoreContext.getState());
        scoreContext.addScore(10);
        System.out.println("���ڵ�״̬�ǣ�" + scoreContext.getState());
        scoreContext.addScore(-25);
        System.out.println("���ڵ�״̬�ǣ�" + scoreContext.getState());
        scoreContext.addScore(-10);
        System.out.println("���ڵ�״̬�ǣ�" + scoreContext.getState());
    }

}/**
 * result:
 * ���ڵ�״̬�ǣ�State [score=80, stateName=����]
 * ���ڵ�״̬�ǣ�State [score=90, stateName=����]
 * ���ڵ�״̬�ǣ�State [score=65, stateName=����]
 * ���ڵ�״̬�ǣ�State [score=55, stateName=������]
 */
