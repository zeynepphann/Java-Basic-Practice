package practice_basic_day06;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q03_LocalDate01 {
    public static void main(String[] args) {
        //localDateTime olmali
        String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
        //iso date time= gecerlilik gormus tipler icin kullanilir
        //String date = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME); 2022-04-04T22:27:47.6704704
        //duzgun hali bu
        System.out.println(date); // cevap D
        //what is the result ?

        /*
         * A) May 04, 2014T00:00:00:000
         *
         * B) 2014-05-04T00:00:00:000
         *
         * C) 5/4/14T00:00:00:000
         *
         * D) An exception is throw at runtime
         */
    }
}
