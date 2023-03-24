import com.demo.entity.Department;
import com.demo.entity.Dept;
import com.demo.service.DeptService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test17 {
    @Test
    public void testBatchAdd(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptService deptService = context.getBean(DeptService.class);
        List<Department> depts =new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            depts.add(new Department(null,"name"+i,"loc"+i));
        }
        int[] ints = deptService.deptBatchAdd(depts);
        System.out.println(Arrays.toString(ints));
    }
    @Test
    public void testBatchUpdate(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptService deptService = context.getBean(DeptService.class);
        List<Department> depts =new ArrayList<>();
        for (int i = 41; i <=50; i++) {
            depts.add(new Department(i,"newname","newLoc"));
        }
        int[] ints = deptService.deptBatchUpdate(depts);
        System.out.println(Arrays.toString(ints));
    }
    @Test
    public void testBatchDelete(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptService deptService = context.getBean(DeptService.class);
        List<Integer> deptnos =new ArrayList<>();
        for (int i = 41; i <=49; i++) {
            deptnos.add(i);
        }
        int[] ints = deptService.deptBatchDelete(deptnos);
        System.out.println(Arrays.toString(ints));
    }
}
