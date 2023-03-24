import com.demo.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test10 {
    @Test
    public void testGetBean(){
        ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = context.getBean("userServiceImpl", UserService.class);
        userService.add();
    }
}
