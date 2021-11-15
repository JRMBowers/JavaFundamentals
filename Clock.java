import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
class Clock {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.printf("%tT%n", time);
    }
}