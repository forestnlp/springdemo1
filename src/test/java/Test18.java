import com.demo.dao.EmployeeDao;
import com.demo.entity.Employee;
import com.demo.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)// 指定测试支持类
@ContextConfiguration("classpath:applicationContext_tx.xml")// 指定核心配置文件位置
public class Test18 {
    @Autowired // 注入要获取的bean
    private EmployeeDao dao;
    @Test()
    public void testTransaction(){
        List<Employee> byDeptno = dao.findByDeptno(10);
        System.out.println("byDeptno"+byDeptno);
    }
}
