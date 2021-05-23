package cn.gd.cz.hong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * java操作dom4j报错java.lang.ClassNotFoundException: org.jaxen.JaxenException
 * 没有引入jaxen.jar
 * Caused by: java.lang.ClassNotFoundException: org.jaxen.JaxenException
 * at java.net.URLClassLoader.findClass(URLClassLoader.java:382)
 * at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
 * at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:349)
 * at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
 * ... 5 more
 * <p>
 * 设计模式启动类
 * <p>
 * 参考 [Spring Boot非Web项目运行的方法](https://www.jb51.net/article/169744.htm)
 * 只运行一次就结束
 * <p>
 * 如果想要不停止 可以实现 CommandLineRunner
 * 重写 run方法为
 *
 * @Override public void run(String... args) throws Exception {
 * Thread.currentThread().join();
 * }
 * <p>
 * [IDEA设置项目编码](https://www.cnblogs.com/hai-feng/p/12302052.html)
 */
@SpringBootApplication
public class DesignPatternApplication {
    public static void main(String[] args) {
        SpringApplication.run(DesignPatternApplication.class, args);
    }
}