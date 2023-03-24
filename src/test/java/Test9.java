import com.demo.entity.User;
import com.demo.entity.User1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test9 {
    @Test
    public void testGetBean(){
        ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
        User1 user = context.getBean("user1", User1.class);
        System.out.println(user);
    }
}
