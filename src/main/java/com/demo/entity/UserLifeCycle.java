package com.demo.entity;

public class UserLifeCycle {
    private Integer userid;
    private String username;
    private String password;

    public void initUserLifeCycle() {
        System.out.println("第三步:User初始化");
    }

    public UserLifeCycle() {
        System.out.println("第一步:User构造");
    }

    public void destoryUserLifeCycle() {
        System.out.println("第五步:User销毁");
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public UserLifeCycle(Integer userid, String username, String password) {
        this.userid = userid;
        this.username = username;
        this.password = password;
    }

    public void setUserid(Integer userid) {
        System.out.println("setUserid");
        this.userid = userid;
    }

    public void setUsername(String username) {
        System.out.println("第二步:User属性赋值");
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
