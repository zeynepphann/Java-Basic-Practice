package practice_basic_day06;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Q09_ZoneDateTime {
    // Baska ülke veya bolgelerin saat dilimine gore zamani alma
    // Newyork un saat dilimine gore saat ?
    public static void main(String[] args) {

        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Amerika/New_York"));
        ZonedDateTime zdtLocal=ZonedDateTime.now();


    }
}
