package instancias;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main{
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2025-01-01");
        LocalDateTime d05 = LocalDateTime.parse("2025-01-01T00:00:00");
        Instant d06 = Instant.parse("2025-01-01T00:00:00Z");
        Instant d07 = Instant.parse("2025-01-01T00:00:00-03:00");

        LocalDate d08 = LocalDate.parse("01/01/2025", formatter);
        LocalDateTime d09 = LocalDateTime.parse("01/01/2025 01:00", formatter2);

        System.out.println("D01: " + d01);
        System.out.println("D02: " + d02);
        System.out.println("D03: " + d03);
        System.out.println("D04: " + d04);
        System.out.println("D05: " + d05);
        System.out.println("D06: " + d06);
        System.out.println("D07: " + d07);
        System.out.println("D08: " + d08);
        System.out.println("D09: " + d09);
    }
}