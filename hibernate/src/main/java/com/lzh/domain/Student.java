package com.lzh.domain;


import lombok.Data;
import lombok.ToString;

import javax.persistence.*;


/**
 * 配置映射关系
 * 1、实体类和表的映射关系
 * 2、属性和字段的映射关系
 */
@Data
@ToString
@Entity
@Table(name = "student")
public class Student {

    /**
     * IDENTITY 自增
     * <p>
     * TABLE : 数据库另外创建一张表维护ID
     * SEQUENCE ：ORACL 序列
     * IDENTITY ： MySQL 自动增长
     * AUTO : 数据库另外创建一张表维护ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sid")
    private Integer sid;

    @Column(name = "sname")
    private String sname;

    @Column(name = "gender")
    private String gender;

    @Column(name = "class_id")
    private Integer classId;

    public Student() {
    }

    public Student(String sname, String gender, Integer classId) {
        this.sname = sname;
        this.gender = gender;
        this.classId = classId;
    }
}
