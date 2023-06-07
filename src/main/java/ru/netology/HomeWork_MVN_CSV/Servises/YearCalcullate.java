package ru.netology.HomeWork_MVN_CSV.Servises;

public class YearCalcullate {
    public int calculate(int income, int expenses, int threshold) {
        int rest = expenses * 3;
        int count = 0;
        int money = 0;
        for (int month = 0; month < 12; month++) {
            if (money > threshold) {
                count++;
                money = money - rest - expenses;
            } else {
                money = income - expenses + money;
            }
        }
        return count;

    }
}
