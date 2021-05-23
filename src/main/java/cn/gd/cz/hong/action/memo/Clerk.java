package cn.gd.cz.hong.action.memo;

import java.util.Date;

/**
 * 文员类
 *
 * @author 洪晓鸿
 * @version V1.0
 * @date 2019年7月14日 下午9:08:23
 */
public class Clerk {
    /**
     * 我这里采用的是时间戳做状态
     * 这样碰撞的机会很小
     * 毕竟人类打字的速度还是很慢的
     *
     * @param args
     */
    public static void main(String[] args) {
        EditPanel panel = new EditPanel();
        Container container = new Container();
        System.out.println("编辑了一次 前：我喜欢  --》》》 后：我喜欢你");
        String state = String.valueOf(new Date().getTime());
        container.addMemo(panel.createMemo(state));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("编辑了一次 前：我喜欢你  --》》》 后：我喜欢你 北京北京");
        state = String.valueOf(new Date().getTime());
        container.addMemo(panel.createMemo(state));
        System.out.println("不好意思 打错了 达成 我喜欢你 北京北京 其实我想打是 我喜欢你  广州广州");
        System.out.println("准备撤销");
        System.out.println("现在的状态是：" + panel.getState());
        Memo memo = container.removeMemo();
        panel.restoreState(memo);
        System.out.println("撤销以后的状态是：" + panel.getState());
    }
}
