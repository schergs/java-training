package conversoes_global_local;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        Instant data1 = Instant.parse("2020-01-01T01:00:00Z");
        LocalDate d1 = LocalDate.ofInstant(data1, ZoneId.systemDefault());
        LocalDateTime data2 = LocalDateTime.ofInstant(data1, ZoneId.of("Portugal"));
        System.out.println("Data 1: " + d1);
        System.out.println("Data 2: " + data2);
        System.out.println("Ano de data 1: " + d1.getYear());
        System.out.println("Hora de data 2: " + data2.getHour());
    }
}
