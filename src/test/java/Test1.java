import com.demo.dao.EmpDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    @Test
    public void testBean(){
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring.xml");
        EmpDao empDao = (EmpDao)classPathXmlApplicationContext.getBean("empDao");
        empDao.addEmp();
    }

}
