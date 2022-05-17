package kr.co.clozet.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * packageName:kr.co.clozet.common.algorithm
 * fileName        :PrimeNumber.java
 * author          : sungsuhan
 * date            :2022-05-17
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-17           sungsuhan      최초 생성
 **/
public class PrimeNumber {
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    private static class Solution{
        private int start, end;
        private List<Integer> primes;

        @Override
        public String toString() {
            return String.format("소수: %d", primes);
        }
    }

    @FunctionalInterface private interface SolutionService{
        Solution solution(Solution s);
    }

    @Test
    void primeTest(){







    }












}
