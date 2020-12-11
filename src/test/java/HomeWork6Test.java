import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class HomeWork6Test {


    @ParameterizedTest
    @MethodSource("results")
    void shouldReturnNewArrayWithNumbersAfterLast4(int [] array, int [] expected) {
        Assertions.assertArrayEquals(expected, HomeWork6.returnArrayAfterLast4(array));
    }

    private static Stream<Arguments> results(){
        return Stream.of(
                Arguments.arguments(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},new int[]{5, 6, 7, 8, 9}),
                Arguments.arguments(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7},new int[]{ 1, 7}),
                Arguments.arguments(new int[]{4, 4, 4},new int[]{})
        );
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowException() {
        HomeWork6.returnArrayAfterLast4(new int[]{5, 5, 5});
    }

    @ParameterizedTest
    @MethodSource("results_2")
    void shouldCheckIfIs4Or1InArray(int [] array, boolean expected) {
        Assertions.assertEquals(expected, HomeWork6.checkIfIs4Or1InArray(array));
    }

    private static Stream<Arguments> results_2(){
        return Stream.of(
                Arguments.arguments(new int[]{0, 2, 3, 4, 5, 6, 7, 8, 9},true),
                Arguments.arguments(new int[]{1, 2, 2, 3, 1, 7},true),
                Arguments.arguments(new int[]{5, 5, 5},false)
        );
    }

}
