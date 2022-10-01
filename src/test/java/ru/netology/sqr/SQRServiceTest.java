package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
//import org.junit.jupiter.params.provider.CsvSource;


public class SQRServiceTest {
    @ParameterizedTest

    @CsvFileSource(files = "src/test/resources/countSqrt.csv")
    public void countSqrtTest(int expected, int low, int high) {
        SQRService service = new SQRService();

        int actual = service.countSqrt(low, high);

        Assertions.assertEquals(expected, actual);
    }
}
