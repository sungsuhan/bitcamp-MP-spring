package kr.co.clozet.auth.domains;

import kr.co.clozet.user.domains.Role;
import kr.co.clozet.auth.services.AuthServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Base64;
import java.util.List;

/**
 * packageName:kr.co.clozet.security.domains
 * fileName        :SecurityProvider.java
 * author          : sungsuhan
 * date            :2022-05-23
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-23           sungsuhan      최초 생성
 **/
@Component
@RequiredArgsConstructor
@Log
public class AuthProvider implements AuthenticationProvider {

    private final AuthServiceImpl service;

    @Value("${security.jwt.token.security-key:secret-key}")
    private String securityKey;

    @Value("${security.jwt.token.expiration-length:3600000}")
    private long validityInMs = 3600000; //1h

    @PostConstruct
    protected void init(){
        securityKey = Base64.getEncoder().encodeToString(securityKey.getBytes());
        log.info("securityKey: "+securityKey);
    }

    public String createToken(String username, List<Role> roles){
        return "";
    }


    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        return null;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return false;
    }
}
