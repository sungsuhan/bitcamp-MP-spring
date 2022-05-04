package kr.co.clozet.repositories;


import kr.co.clozet.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName:kr.co.clozet.repositories
 * fileName        :UserRepository.java
 * author          : sungsuhan
 * date            :2022-05-03
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-03           sungsuhan      최초 생성
 **/
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
