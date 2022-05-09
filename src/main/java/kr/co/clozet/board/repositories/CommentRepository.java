package kr.co.clozet.board.repositories;

import kr.co.clozet.board.domains.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName:kr.co.clozet.board.repositories
 * fileName        :CommentRepository.java
 * author          : sungsuhan
 * date            :2022-05-09
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-09           sungsuhan      최초 생성
 **/
@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
