package cn.gd.cz.hong.action.responsibility;

/**
 * 相关部门
 * 外国人来找相关部门办案
 * 呵呵
 *
 * @author 洪晓鸿
 * @version V1.0
 * @date 2019年7月13日 下午11:14:13
 */
public class Department {

    private Department dep;
    private String name;

    public Department(String name) {
        super();
        this.name = name;
    }

    public void setDep(Department dep) {
        this.dep = dep;
    }

    public void execute(String depName) {
        System.out.println("您好 " + name + "为您服务 您要找的是：" + depName);
        if (name.equals(depName)) {
            System.out.println(depName + "受理服务   请稍候");
            System.out.println("已经完成办理  ");
            return;
        }
        System.out.println("请到相关部门进行办理 ");
        if (dep != null) {
            dep.execute(depName);
        } else {
            System.out.println("无人处理  。。。 好尴尬呀");
        }
    }
}
