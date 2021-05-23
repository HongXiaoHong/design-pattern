package cn.gd.cz.hong.action.state;

/**
 * �����B
 *
 * @author ������
 * @version V1.0
 * @date 2019��7��14�� ����11:25:21
 */
public class Pass extends AbstractState {

    {
        stateName = "����";
    }

    public Pass(AbstractState state) {
        super(state);
    }

    @Override
    public void checkState() {
        if (score >= 60) {
            if (score >= 90) {
                scoreContext.setState(new Excellent(this));
            } else {
                if (score >= 80)
                    scoreContext.setState(new Good(this));
            }
        } else {
            scoreContext.setState(new Fail(this));
        }
    }

}
