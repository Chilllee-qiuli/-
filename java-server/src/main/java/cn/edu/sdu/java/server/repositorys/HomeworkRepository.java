package cn.edu.sdu.java.server.repositorys;
import cn.edu.sdu.java.server.models.Course;
import cn.edu.sdu.java.server.models.Homework;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
@Repository
public interface HomeworkRepository extends JpaRepository<Homework, Integer> {
    @Query(value ="from Homework where course = ?1")
    List<Homework> findByCourse(String course);

    @Query(value = "from Homework  where homeworkTitle like %?1%")
    List<Homework> findByHomeworkTitle(String homeworkTitle);

    @Query(value = "from Homework  where homeworkStartTime like %?1%")
    List<Homework> findByHomeworkStartTime(String homeworkStartTime);

    @Query(value ="from Homework  where homeworkDeadline like %?1%")
    List<Homework> findByHomeworkDeadline(String homeworkDeadline);

    @Query(value ="from Homework  where homeworkMaxScore = ?1")
    List<Homework> findByHomeworkMaxScore(int homeworkMaxScore);
}
