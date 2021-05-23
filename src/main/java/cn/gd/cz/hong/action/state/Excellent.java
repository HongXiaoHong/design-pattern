package cn.gd.cz.hong.action.state;

/**
 * �����B
 *
 * @author ������
 * @version V1.0
 * @date 2019��7��14�� ����11:25:21
 */
public class Excellent extends AbstractState {

    {
        stateName = "����";
    }

    public Excellent(AbstractState state) {
        super(state);
    }

    @Override
    public void checkState() {
        if (score < 90) {
            if (score >= 80) {
                scoreContext.setState(new Good(this));
            } else {
                if (score >= 60) {
                    scoreContext.setState(new Pass(this));
                } else {
                    scoreContext.setState(new Fail(this));
                }
            }
        }
    }

}
