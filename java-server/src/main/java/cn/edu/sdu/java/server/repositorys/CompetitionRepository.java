package cn.edu.sdu.java.server.repositorys;
import cn.edu.sdu.java.server.models.Competition;
import cn.edu.sdu.java.server.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
public interface CompetitionRepository {
    @Query(value = "from Competition where student = ?1")
    List<Competition> findCompetitionByPersonId(String personId);

    @Query(value = "from Competition where competitionName like ?1")
    List<Competition> findCompetitionByName(String competitionName);

    @Query(value = "from Competition where awardLevel like ?1")
    List<Competition> findCompetitionByAwardLevel(String awardLevel);

    @Query(value ="from Competition where role = \"captain\"")
    List<Competition> findCompetitionByCaptain();

    @Query(value = "from Competition where role = \"teammate\"" )
    List<Competition> findCompetitionByTeammate();
}
