import java.util.*;
import java.time.*;
public class Datet {
public static void main(String[] args) {
LocalTime dt = LocalTime.of(0,0);
LocalDate pt = LocalDate.of(2018,01,27);
LocalDate fiveDaysFromNow = pt.plusDays(5);
System.out.print(dt);
System.out.print(fiveDaysFromNow);
}
}