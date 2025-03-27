package calculos;

import java.time.Duration;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate data1 = LocalDate.now();
        LocalDate data2 = LocalDate.of(2005, 12, 29);
        System.out.println("Ontem: " + data1.minusDays(1));
        System.out.println("Semana que vem: " + data1.plusWeeks(1));
        System.out.println("Data 2 - 30 dias: " + data2.minusDays(30));
        Duration d1 = Duration.between(data2.atStartOfDay(), data1.atStartOfDay());
        System.out.println(d1.toDays() + " dias vividos!");
    }
}
