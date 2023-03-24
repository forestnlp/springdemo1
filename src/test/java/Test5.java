import com.demo.entity.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {

    @Test
    public void testBean(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        Book book = applicationContext.getBean("book", Book.class);
        System.out.println(book);

    }
}
