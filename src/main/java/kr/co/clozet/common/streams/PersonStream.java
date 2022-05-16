package kr.co.clozet.common.streams;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.*;
import java.util.stream.Collectors;

/**
 * packageName:kr.co.clozet.common.streams
 * fileName        :PersonStream.java
 * author          : sungsuhan
 * date            :2022-05-16
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-16           sungsuhan      최초 생성
 **/
public class PersonStream {
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    public static class Person{
        private String name, ssn;

        @Override
        public String toString(){
            String gender = (ssn.substring(7).equals("1")||ssn.substring(7).equals("3"))?"남자":"여자";
            Calendar cal = Calendar.getInstance(Locale.KOREA);
            int year = cal.get(Calendar.YEAR);
            int yy = Integer.parseInt(ssn.substring(0,2));
            if((ssn.charAt(7) - 48) < 3) {
                yy = yy + 1900;
            }
            else {
                yy = yy + 2000;
            }
            int age = year - yy + 1;

            return String.format("회원 : %s님은 %s 이며 %s 살 입니다.", name, gender, age);
        }
    }

    interface PersonService{
        List<Person> search(List<Person> person);}
    static class PersonServiceImpl implements PersonService{

        @Override
        public List<Person> search(List<Person> person) {
            return person
                    .stream()
                    .filter(e -> e.getName().equals("우지현"))
                    .collect(Collectors.toList());
        }
    }



    @Test
    void personStreamTest(){
      List<Person> person = Arrays.asList(
              Person.builder().name("한성수").ssn("940731-1").build(),
              Person.builder().name("우지현").ssn("931009-2").build(),
              Person.builder().name("한지훈").ssn("000118-3").build()
      );
      new PersonServiceImpl()
              .search(person)
              .forEach(System.out::print);
    }








}
