package day27_immutableClasses_dateTime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.ZoneId;

public class C05_FarkliLokasyonIcinSaat {

    public static void main(String[] args) {

        /*
            LocalTime class'i ile

            - herhangi bir andaki local zamani kaydedebiliriz
            - herhangi bir anda her hangi bir saat dilimideki(ZoneId) zamani kaydedebiliriz
            - Verilen iki localtime arasindaki zaman dilimini bulabiliriz
            - localTime'dan
                - get() zamanin istenen bolumunu alabilirim yada getirebilirim
                - with() zamanin belirli bir bolumunu istedigim degerle degistirebilirim saat , dakika yada saniye bizim istedigimiz gibi olur
                - plus() zamani istedigimiz kadar ileri alabiliriz
                - minus() zamani istedigimiz kadar geri alabiliriz
            - farkli zamanlari isAfter veya isBefore ile karsilastirabiliriz
         */

        // su anda Japonya'daki saati yazdirin

        LocalTime timeJaponya = LocalTime.now(ZoneId.of("Japan"));
        System.out.println("japan: "+timeJaponya); // 19:29:21.685957


        // su anda Londra'daki saati yazdirin
        LocalTime timeLondon = LocalTime.now(ZoneId.of("Europe/London"));
        System.out.println("London: "+ timeLondon); // 11:31:02.612721
        
        LocalTime timeBerlin = LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println("Berlin: "+timeBerlin); // 11:31:02.612721


        // su anda Newyork'daki saati yazdirin
        LocalTime timeNewyork = LocalTime.now(ZoneId.of("America/New_York"));
        System.out.println("Newyork: "+timeNewyork); // 06:31:49.711406

        // su anda Denver'daki saati yazdirin  America/Denver
        LocalTime timeDenver = LocalTime.now(ZoneId.of("America/Denver"));
        System.out.println("Denver: "+timeDenver); // 04:32:56.213084



        // saat 11:25:12:00000 icin local saat olusturun
        LocalTime localTime1 = LocalTime.of(11,25,12,0);

        // saat 02:29:19:00000 icin local saat olusturun
        LocalTime localTime2 =LocalTime.of(2,29,19,0);

        // aralarindaki sure farkini bulalim

        System.out.println(Duration.between(localTime2, localTime1)); // PT8H55M53S ==>8 saat 55 dakika 53 saniye


        System.out.println(localTime1.isAfter(localTime2));  // true
        System.out.println(localTime1.isBefore(localTime2)); // false




    }
}