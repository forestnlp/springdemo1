package com.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @Author: Ma HaiYang
 * @Description: MircoMessage:Mark_7001
 */
@Configuration  // 配置类标志注解
@ComponentScan(basePackages = "com.demo") // spring包扫描
@PropertySource("classpath:jdbc.properties") // 读取属性配置文件
@EnableTransactionManagement // 开启事务注解
public class SpringConfig {
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;
    /*创建数据库连接池*/
    @Bean
    public DruidDataSource getDruidDataSource(){
        DruidDataSource dataSource=new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
    /*创建JdbcTemplate对象*/
    @Bean
    public JdbcTemplate getJdbcTemplate(DataSource dataSource){
        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }
    /*创建事务管理器*/
    @Bean
    public PlatformTransactionManager getPlatformTransactionManager(DataSource dataSource){
        DataSourceTransactionManager transactionManager =new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource);
        return transactionManager;
    }
}
