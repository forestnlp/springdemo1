import com.demo.entity.Emp;
import com.demo.entity.Employee;
import com.demo.service.EmpService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

public class Test16 {
    @Test
    public void testEmpService(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpService empService = context.getBean(EmpService.class);
        // 查询员工个数
        int empCount = empService.findEmpCount();
        System.out.println(empCount);
        // 根据员工编号查询员工对象
        Employee byEmpno = empService.findByEmpno(7521);
        System.out.println(byEmpno);
       /*根据部门编号查询多个员工对象集合*/
        List<Employee> emps = empService.findByDeptno(20);
        emps.forEach(System.out::println);
        /*增加员工信息*/
        int rows = empService.addEmp(new Employee(null, "TOM", "SALESMAN", 7521, new Date(), 2000.0, 100.0, 10));
        System.out.println(rows);
        /*根据员工编号修改员工信息*/
        int rows2 = empService.updateEmp(new Employee(7936, "JERRY", "MANAGER", 7839, new Date(), 3000.0, 0.0, 20));
        System.out.println(rows2);
        /*根据员工编号删除员工信息*/
        int rows3 = empService.deleteEmp(7938);
        System.out.println(rows3);
    }
}
