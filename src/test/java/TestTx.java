import com.demo.config.SpringConfig;
import com.demo.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTx {
    @Test()
    public void testTransaction(){
        ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext_tx.xml");
        AccountService accountService = context.getBean(AccountService.class);
        int rows = accountService.transMoney(1, 2, 100);
        System.out.println(rows);
    }

    @Test()
    public void testTransaction3(){
        ApplicationContext context =new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = context.getBean(AccountService.class);
        int rows = accountService.transMoney(1, 2, 100);
        System.out.println(rows);
    }
}
