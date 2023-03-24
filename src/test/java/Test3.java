import com.demo.entity.Cat;
import com.demo.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

    @Test
    public void testBean(){
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Cat cat1 = (Cat)classPathXmlApplicationContext.getBean("cat1");
        System.out.println(cat1);
        Cat cat2 = (Cat)classPathXmlApplicationContext.getBean("cat2");
        System.out.println(cat2);
    }
}
