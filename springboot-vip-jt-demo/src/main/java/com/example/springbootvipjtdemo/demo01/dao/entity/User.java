package com.example.springbootvipjtdemo.demo01.dao.entity;

/**
 * @author 帅气的景天老师
 * @create 2021/8/2 16:37
 */
public class User {

    private long userId;
    private String userName;
    private int age;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }
}
