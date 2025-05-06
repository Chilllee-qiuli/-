package cn.edu.sdu.java.server.repositorys;
import cn.edu.sdu.java.server.models.Course;
import cn.edu.sdu.java.server.models.StudentInnovationProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
@Repository
public interface StudentInnovationProjectRepository {
    @Query(value = "from StudentInnovationProject where student.person.num like ?1 or student.person.name like ?1 or innovationProject.innovationProjectName like ?1")
    List<StudentInnovationProject> findStudentInnovationProjectByNumName(String num);
}
