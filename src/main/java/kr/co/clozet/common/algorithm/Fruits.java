package kr.co.clozet.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * packageName:kr.co.clozet.common.algorithm
 * fileName        :Fruits.java
 * author          : sungsuhan
 * date            :2022-05-17
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-17           sungsuhan      최초 생성
 **/
public class Fruits {
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    private static class Solution{
        private int[][] arr;
        private int sum, avgA, avgG, avgO;

        @Override
        public String toString() {
            return String.format("총합: %d, 사과평균: %d, 포도평균: %d, 오렌지평균: %d", sum, avgA, avgG, avgO);
        }
    }

    @FunctionalInterface private interface SolutionService{
        Solution solution(Solution s);
    }

    @Test
    void testSolution(){
        int[][] arr = {
                {10000, 20000, 12000},
                {8000, 3000, 15000},
                {20000, 15000, 38000},
                {13000, 20000, 30000},
                {30000, 12000, 20000},
                {35000, 30000, 25000},
                {50000, 23000, 10000}
        };
    }










}
