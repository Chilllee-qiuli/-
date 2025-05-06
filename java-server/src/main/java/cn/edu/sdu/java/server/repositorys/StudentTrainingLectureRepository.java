package cn.edu.sdu.java.server.repositorys;
import cn.edu.sdu.java.server.models.Course;
import cn.edu.sdu.java.server.models.StudentTrainingLecture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
@Repository
public interface StudentTrainingLectureRepository {
    @Query(value = "from StudentTrainingLecture where student.person.num like ?1 or student.person.name like ?1 or trainingLecture.theme like ?1 or trainingLecture.participationType like ?1")
    List<StudentTrainingLecture> findTrainingLectureByNumName(String numName);
}
