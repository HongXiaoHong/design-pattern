package cn.gd.cz.hong.action.state;

/**
 * ״̬�ĳ�����
 *
 * @author ������
 * @version V1.0
 * @date 2019��7��14�� ����11:14:56
 */
public abstract class AbstractState {

    protected ScoreContext scoreContext;
    protected int score;
    protected String stateName;

    public AbstractState() {
        super();
    }

    public AbstractState(AbstractState state) {
        this.score = state.score;
        this.scoreContext = state.scoreContext;
    }

    public abstract void checkState();

    public void addScore(int score) {
        this.score += score;
        checkState();
    }

    @Override
    public String toString() {
        return "State [score=" + score + ", stateName=" + stateName + "]";
    }

}
