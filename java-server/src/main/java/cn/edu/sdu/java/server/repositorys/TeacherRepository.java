/*package cn.edu.sdu.java.server.repositorys;

import cn.edu.sdu.java.server.models.Student;
import cn.edu.sdu.java.server.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
    @Query(value = "from Teacher where ?1='' or person.num like %?1% or person.name like %?1% ")
    List<Teacher> findTeacherListByNumName(String numName);
    @Query(value = "from Teacher where ?1='' or Teacher.title like %?1% ORDER BY wage")
    List<Teacher> findTeacherListByTitle(String title);
}*/
/*
* 开发：
* model      ->
*                service(使用方法)->controller
* repository ->
*
* 类要有构造方法
* model:需要getter,setter方法,每个类都要有一个主类型
* repository:模糊匹配，继承Jpa
* service：
*
*
*
* */