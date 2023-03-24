import com.demo.config.SpringConfig;
import com.demo.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test15 {
    @Test
    public void test(){
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        UserDao userDao = context.getBean( "UserDaoImplA",UserDao.class);
        int add = userDao.addUser(10,"晓明");
    }
}
