package ru.netology.HomeWork_MVN_CSV.Servises;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
//import ru.netology.HomeWork_MVN_CSV.Servises.yearcalcullate;

public class YearCalculateTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/count.csv")
    public void shouldCalculateFirst(int income, int expenses, int threshold) {
        YearCalcullate service = new YearCalcullate();

        int year = service.calculate(income, expenses, threshold);

        System.out.println(year);
    }

    // @Test
    //  public void shouldCalculateFirst() {
    //YearCalcullate service = new YearCalcullate();
    // int income = 10000;
    // int expenses = 3000;
    // int threshold = 20000;
    // int year = service.calculate(income, expenses, threshold);

    //      System.out.println(year);
    // }

    //@Test
    //public void shouldCalculateSecond() {
    //  YearCalcullate service = new YearCalcullate();
    //int income = 100000;
    //int expenses = 60000;
    // int threshold = 150000;
    //int year = service.calculate(income, expenses, threshold);

    // System.out.println(year);
    //  }
}
