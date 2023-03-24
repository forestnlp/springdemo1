import com.demo.dao.UserDao;
import com.demo.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test14 {
    @Test
    public void testGetBean(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = context.getBean( "UserDaoImplA",UserDao.class);
        int add = userDao.addUser(10,"晓明");
    }

    @Test
    public void testGetBean2(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext_aop.xml");
        UserDao userDao = context.getBean( "UserDaoImplA",UserDao.class);
        int add = userDao.addUser(10,"晓明");
    }
}
