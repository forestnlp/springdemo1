import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.demo.entity.Emp;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test8 {
    @Test
    public void testGetBean() throws SQLException {
        ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
        DruidDataSource dataSource = context.getBean("dataSource", DruidDataSource.class);
        System.out.println(dataSource);
        DruidPooledConnection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from emp");
        while (resultSet.next()){
            System.out.println(resultSet.getString(1));
        }
        resultSet.close();
        statement.close();
        connection.close();
    }
}
