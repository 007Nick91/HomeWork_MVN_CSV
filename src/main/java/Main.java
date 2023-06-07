import ru.netology.HomeWork_MVN_CSV.Servises.YearCalcullate;

public class Main {
    public static void main(String[] args) {
        YearCalcullate service = new YearCalcullate();
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int year = service.calculate(income, expenses, threshold);
        System.out.println(year);
    }
}
