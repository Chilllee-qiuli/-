package cn.edu.sdu.java.server.repositorys;
import cn.edu.sdu.java.server.models.Attendance;
import cn.edu.sdu.java.server.models.Course;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Integer> {
    @Query(value = "from Attendance where student =?1")
    List<Attendance> findAttendanceListByPersonId(Integer personId);

    @Query(value ="from Attendance where course =?1")
    List<Attendance> findAttendanceListByCourseId(String courseId);

    @Query(value = "from Attendance where recordDate like %?1%")
    List<Attendance> findAttendanceListByRecordDate(Integer recordDate);

    @Query(value = "from Attendance  where attendanceSituation =false")
    List<Attendance> findAttendanceListByAttendanceSituationFalse();

    @Query(value = "from Attendance  where attendanceSituation = true")
    List<Attendance> findAttendanceListByAttendanceSituationTrue();
}
