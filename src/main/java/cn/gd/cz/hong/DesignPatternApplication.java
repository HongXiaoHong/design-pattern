package cn.gd.cz.hong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * java����dom4j����java.lang.ClassNotFoundException: org.jaxen.JaxenException
 * û������jaxen.jar
 * Caused by: java.lang.ClassNotFoundException: org.jaxen.JaxenException
 * at java.net.URLClassLoader.findClass(URLClassLoader.java:382)
 * at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
 * at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:349)
 * at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
 * ... 5 more
 * <p>
 * ���ģʽ������
 * <p>
 * �ο� [Spring Boot��Web��Ŀ���еķ���](https://www.jb51.net/article/169744.htm)
 * ֻ����һ�ξͽ���
 * <p>
 * �����Ҫ��ֹͣ ����ʵ�� CommandLineRunner
 * ��д run����Ϊ
 *
 * @Override public void run(String... args) throws Exception {
 * Thread.currentThread().join();
 * }
 * <p>
 * [IDEA������Ŀ����](https://www.cnblogs.com/hai-feng/p/12302052.html)
 */
@SpringBootApplication
public class DesignPatternApplication {
    public static void main(String[] args) {
        SpringApplication.run(DesignPatternApplication.class, args);
    }
}