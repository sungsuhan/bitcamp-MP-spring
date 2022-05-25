package kr.co.clozet.user.services;

import kr.co.clozet.auth.domains.Messenger;
import kr.co.clozet.user.domains.User;
import kr.co.clozet.user.domains.UserDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

/**
 * packageName:kr.co.clozet.services
 * fileName        :UserService.java
 * author          : sungsuhan
 * date            :2022-05-03
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-03           sungsuhan      최초 생성
 **/
public interface UserService {
    UserDTO login(User user);

    List<User> findAll();

    List<User> findAll(Sort sort);

    Page<User> findAll(Pageable pageable);

    Messenger count();

    Messenger update(User user);

    Messenger delete(User user);

    Messenger save(User user);

    Optional<User> findById(String userid);

    Messenger existsById(String userid);

    // custom
    List<User> findByUserName(String name);

    Messenger logout();
}
