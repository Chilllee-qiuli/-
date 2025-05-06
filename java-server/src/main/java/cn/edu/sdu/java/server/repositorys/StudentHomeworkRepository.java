package cn.edu.sdu.java.server.repositorys;
import cn.edu.sdu.java.server.models.Course;
import cn.edu.sdu.java.server.models.Student;
import cn.edu.sdu.java.server.models.StudentHomework;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
public interface StudentHomeworkRepository extends JpaRepository<StudentHomework, Integer> {
    @Query (value ="from StudentHomework where student = ?1")
    List<StudentHomework> findByPersonId(Integer personId);

    @Query(value = "from StudentHomework where homework = ?1")
    List<StudentHomework> findByHomeworkId(String homeworkId);

    @Query(value = "from StudentHomework where studentScore>?1")
    List<StudentHomework> findByStudentScore(Double studentScore);
}
