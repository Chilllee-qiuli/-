package cn.edu.sdu.java.server.repositorys;
import cn.edu.sdu.java.server.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
@Repository
public interface InternshipRepository {
    @Query(value = "from Internship where student.person.num like ?1 or student.person.name like ?1 or companyName like ?1 or ")
}
