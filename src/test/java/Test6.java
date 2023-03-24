import com.demo.entity.User;
import com.demo.entity.UserLifeCycle;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test6 {
    @Test
    public void testGetBean(){
        ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
        UserLifeCycle user1 = context.getBean("userlifecycle", UserLifeCycle.class);
        UserLifeCycle user2 = context.getBean("userlifecycle", UserLifeCycle.class);
        //System.out.println(user1==user2);
        System.out.println("第四步:User对象从容器中获取");
        // 关闭容器
        context.close();
    }
}
