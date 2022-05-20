package kr.co.clozet.soccer.repositories;

import kr.co.clozet.soccer.domains.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * packageName:kr.co.clozet.soccer.repositories
 * fileName        :TeamRepository.java
 * author          : sungsuhan
 * date            :2022-05-09
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-09           sungsuhan      최초 생성
 **/
interface TeamCustomRepository{
    // 001. 전체 축구팀 목록을 팀이름 오름차순으로 출력하시오
    @Query (value = "select t.teamName as teamName from Team t ORDER BY t.teamName",
            nativeQuery = true)
    List<String> findTeamNamesAsc();
}

@Repository
public interface TeamRepository extends JpaRepository<Team, Long>, TeamCustomRepository{


}
