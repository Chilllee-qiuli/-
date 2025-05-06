package cn.edu.sdu.java.server.repositorys;
import cn.edu.sdu.java.server.models.Course;
import cn.edu.sdu.java.server.models.Social;
import cn.edu.sdu.java.server.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
@Repository

public interface SocialRepository extends JpaRepository<Social, Integer> {
    @Query(value = "from Social where student = ?1")
    List<Social> findByPersonId(String personId);
    
    @Query(value = "from Social where project like %?1%")
    List<Social> findByProject(String project);

    @Query(value = "from Social where teacher = ?1")
    List<Social> findByTeacher(String teacher);

    @Query(value = "from Social where teamName like ?1")
    List<Social> findByTeamName(String teamName);

    @Query(value = "from Social where location like ?1")
    List<Social> findByLocation(String location);
}
