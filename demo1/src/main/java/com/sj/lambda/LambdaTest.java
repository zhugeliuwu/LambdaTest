package com.sj.lambda;

import org.junit.Test;

import java.util.Comparator;

public class LambdaTest {

    @Test
    public void test1() {
        Runnable r2 = () -> System.out.println("xixi");

        r2.run();

    }

    @Test
    public void test2() {
        Comparator<Integer> integerComparable = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(01, 02);
            }
        };
        System.out.println(integerComparable.compare(12, 21));

        Comparator<Integer> integerComparable1 = (o1,o2) ->Integer.compare(01, 02);
        System.out.println(integerComparable1.compare(21, 21));

        Comparator<Integer> integerComparable2 = Integer::compare;
        System.out.println(integerComparable2.compare(31, 21));
    }
}
