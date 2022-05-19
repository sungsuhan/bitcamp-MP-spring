package kr.co.clozet.board.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * packageName:kr.co.clozet.board.domains
 * fileName        :Article2.java
 * author          : sungsuhan
 * date            :2022-05-09
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-09           sungsuhan      최초 생성
 **/
//@Data
//@Component
//@Entity
//@Table(name="articles")
public class Article2 {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false) private String project;
    @Column(nullable = false) private String startDate;
    @Column(nullable = false) private String status;
    @Column(nullable = false) private String team;
    @Column(nullable = false) private String progress;
    @Column(nullable = false) private String action;



}
