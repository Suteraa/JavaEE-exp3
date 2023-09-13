package cn.edu.ujn.ch3.aspectj.xml;
import org.springframework.context.ApplicationContext;
import
        org.springframework.context.support.ClassPathXmlApplicationContext;
import cn.edu.ujn.ch3.jdk.IUserDao;
// 测试类
public class TestXmlAspectj {
    public static void main(String args[]) {
        String xmlPath = "applicationContext.xml";
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext(xmlPath);
        // 1 从spring容器获得内容
        IUserDao userDao = (IUserDao) applicationContext.getBean("userDao");
        // 2 执行方法
        userDao.addUser();
    }
}
