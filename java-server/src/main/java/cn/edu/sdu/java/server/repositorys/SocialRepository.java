package cn.edu.sdu.java.server.repositorys;

import cn.edu.sdu.java.server.models.Social;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;
/*
 * Social 数据操作接口，主要实现Person数据的查询操作
 * Integer getMaxId()  Social 表中的最大的Social_id;    JPQL 注解
 * Optional<Social> findByPersonPersonId(Integer personId); 根据关联的Person的personId查询获得Option<Social>对象 命名规范
 * Optional<Social> findByPersonNum(String num); 根据关联的Person的num查询获得Option<Social>对象  命名规范
 * List<Social> findByPersonName(String name); 根据关联的Person的name查询获得List<Social>对象集合  可能存在相同姓名的多个学生 命名规范
 * List<Social> findSocialListByNumName(String numName); 根据输入的参数 如果参数为空，查询所有的学生，输入参数不为空，查询学号或姓名包含输入参数串的所有学生集合
 */

public interface SocialRepository extends JpaRepository<Social,Integer> {
    Optional<Social> findByPersonPersonId(Integer personId);
    Optional<Social> findByPersonNum(String num);
    List<Social> findByPersonName(String name);

    @Query(value = "from Social where ?1='' or person.num like %?1% or person.name like %?1% ")
    List<Social> findSocialListByNumName(String numName);

    @Query(value = "from Social where ?1='' or Social. ")
    List<Social> findSocialListByPersonPersonId(Integer personId);
}
