import com.demo.dao.EmpDao;
import com.demo.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

    @Test
    public void testBean(){
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User user0 = (User)classPathXmlApplicationContext.getBean("user0");
        User user1 = (User)classPathXmlApplicationContext.getBean("user1");
        User user2 = (User)classPathXmlApplicationContext.getBean("user2");
        User user3 = (User)classPathXmlApplicationContext.getBean("user3");
        User user4 = (User)classPathXmlApplicationContext.getBean("user4");
        User user5 = (User)classPathXmlApplicationContext.getBean("user5");
        User user6 = (User)classPathXmlApplicationContext.getBean("user6");
        System.out.println(user0);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);
        System.out.println(user5);
        System.out.println(user6);

    }

}
