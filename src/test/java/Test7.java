import com.demo.entity.Emp;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test7 {
    @Test
    public void testGetBean(){
        ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
