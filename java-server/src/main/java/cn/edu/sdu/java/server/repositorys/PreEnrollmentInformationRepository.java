package cn.edu.sdu.java.server.repositorys;
import cn.edu.sdu.java.server.models.Course;
import cn.edu.sdu.java.server.models.PreEnrollmentInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
@Repository

public interface PreEnrollmentInformationRepository extends JpaRepository<PreEnrollmentInformation, Integer> {
    /*@Query(value = "from  PreEnrollmentInformation where ?1='' or  student = ?1")
    List<Course> findPreEnrollmentInformationListByPersonId(Integer personId);*/
    @Query(value = "from PreEnrollmentInformation where student = ?1")
    Optional<PreEnrollmentInformation> findByPersonId(Integer personId);
}
