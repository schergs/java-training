package availableZoneIds;

import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        for (String s : ZoneId.getAvailableZoneIds()) {
            System.out.println(s);
        }
    }
}
