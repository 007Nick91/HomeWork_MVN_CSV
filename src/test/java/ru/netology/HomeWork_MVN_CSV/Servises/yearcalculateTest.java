package ru.netology.HomeWork_MVN_CSV.Servises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
//import ru.netology.HomeWork_MVN_CSV.Servises.yearcalcullate;

public class yearcalculateTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/count.csv")
    public void shouldCalculatefirst(int income, int expenses, int threshold) {
        yearcalcullate service = new yearcalcullate();

        int year = service.calculate(income, expenses, threshold);

        System.out.println(year);
    }

    // @Test
    //  public void shouldCalculatefirst() {
    //  yearcalcullate service = new yearcalcullate();
    // int income = 10000;
    // int expenses = 3000;
    // int threshold = 20000;
    // int year = service.calculate(income, expenses, threshold);

    //      System.out.println(year);
    // }

    //@Test
    //public void shouldCalculatesecond() {
    //  yearcalcullate service = new yearcalcullate();
    //int income = 100000;
    //int expenses = 60000;
    // int threshold = 150000;
    //int year = service.calculate(income, expenses, threshold);

    // System.out.println(year);
    //  }
}
