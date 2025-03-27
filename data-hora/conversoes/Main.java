package conversoes;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        LocalDate data1 = LocalDate.now();
        LocalDateTime data2 = LocalDateTime.now();
        Instant data3 = Instant.parse("2020-01-01T00:00:00Z");

        System.out.println("Data atual: " + data1.format(fmt1));
        System.out.println("Data atual: " + fmt1.format(data1));
        System.out.println("Data atual: " + data1.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Data e hora atual: " + data2.format(fmt2));
        System.out.println("Data e hora atual: " + fmt2.format(data2));
        System.out.println("Data e hora atual: " + data2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
        System.out.println("Data 3: " + fmt3.format(data3));
        System.out.println("Data atual: " + data2.format(fmt4));
        System.out.println("Data 3: " + fmt5.format(data3));
    }
}
