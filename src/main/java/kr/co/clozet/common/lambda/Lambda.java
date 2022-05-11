package kr.co.clozet.common.lambda;

import com.sun.jdi.IntegerType;

import static kr.co.clozet.common.dataStructure.AppleList.Apple;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * packageName:kr.co.clozet.common.lambda
 * fileName        :LambdaUtil.java
 * author          : sungsuhan
 * date            :2022-05-11
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-11           sungsuhan      최초 생성
 **/
public class Lambda {
    public static void main(String[] args) {
        System.out.println(Lambda.integer("900"));
        System.out.println(Lambda.string(1200));
        System.out.println(string(new Apple.Builder().origin("영동").color("RED").price(3000).build()));
        System.out.println(
                string(
                        Arrays.asList(
                        new Apple.Builder().origin("영동").color("RED").price(1000).build(),
                        new Apple.Builder().origin("영동").color("BLUE").price(2000).build(),
                        new Apple.Builder().origin("풍기").color("RED").price(3000).build()
                        ))
        );
        System.out.println(Lambda.equals("1", "3"));
        System.out.println(array(7).length);
    }
    public static int integer(String arg){
        // Integer i = Integer.parseInt("900");
        Function<String, Integer> f = Integer::parseInt;
        return f.apply(arg);
    }
    public static String string(Object o){
        // String s = String.valueOf(o)
        Function<Object, String> s = String::valueOf;
        return s.apply(o);
    }
    public static boolean equals(String s1, String s2){
        BiPredicate<String, String> f = String::equals;
        return f.test(s1, s2);
    }

    public static int[] array(int i){
        // int[] arr = new int[8];
        Function<Integer, int[]> a = int[]::new;
        return a.apply(i);
    }








}
