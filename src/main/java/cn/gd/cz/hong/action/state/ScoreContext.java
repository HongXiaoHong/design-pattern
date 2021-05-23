package cn.gd.cz.hong.action.state;

public class ScoreContext {

    private AbstractState state;

    public ScoreContext() {
        state = new Fail(this);
    }

    public void addScore(int score) {
        state.addScore(score);
    }

    public AbstractState getState() {
        return state;
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

}
