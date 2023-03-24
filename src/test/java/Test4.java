import com.demo.entity.Cat;
import com.demo.entity.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {

    @Test
    public void testBean(){
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Student student = (Student)classPathXmlApplicationContext.getBean("student1");
        System.out.println(student);
    }
}
