package com.example.he.studenmanagement.tools;

/**
 * 保存学生信息的实体类
 * Created by he on 2016/10/1.
 */
public class Student {
    private String name;
    private String sex;
    private String id;//学号
    private String password;//学生登录密码
    private String number;//手机号
    private int MathScore;
    private int order;//名次


    public Student(String id, int mathScore, String name, String number, String password, String sex,int order) {

        this.id = id;
        this.name = name;
        this.number = number;
        this.password = password;
        this.sex = sex;
        MathScore = mathScore;
        this.order=order;
    }


    public String getId() {
        return id;
    }

    public int getMathScore() {
        return MathScore;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getPassword() {
        return password;
    }

    public String getSex() {
        return sex;
    }

    public int getOrder() {
        return order;
    }


}
