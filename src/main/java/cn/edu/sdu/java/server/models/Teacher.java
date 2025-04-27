package cn.edu.sdu.java.server.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

/**
 * Student学生表实体类 保存每个学生的信息，
 * Integer studentId 用户表 student 主键 student_id
 * Person person 关联到该用户所用的Person对象，账户所对应的人员信息 person_id 关联 person 表主键 person_id
 * String major 专业
 * String className 班级
 *
 */
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(	name = "teacher",
        uniqueConstraints = {
        })
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer personId;

    @OneToOne
    @JoinColumn(name="person_id")
    @JsonIgnore
    private Person person;

    @Size(max = 50)
    private String title;

    @Size(max = 50)
    private String degree;

    private Integer studentNum;


   }
