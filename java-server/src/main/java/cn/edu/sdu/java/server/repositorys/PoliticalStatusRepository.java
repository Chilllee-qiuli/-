package cn.edu.sdu.java.server.repositorys;
import cn.edu.sdu.java.server.models.Course;
import cn.edu.sdu.java.server.models.PoliticalStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
@Repository
public interface PoliticalStatusRepository extends JpaRepository<PoliticalStatus, Integer> {
    @Query(value = "from PoliticalStatus where student = ?1")
    Optional<PoliticalStatus> findByPersonId(Integer personId);
}
