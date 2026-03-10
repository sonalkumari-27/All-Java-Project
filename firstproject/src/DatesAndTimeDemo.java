import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormattter;

public class DatesAndTimeDemo {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate futureDate = today.plusDays(10);
		if(futureDate.isAfter(today)) {
			System.out.println("Future date is valid");
		}
		Period period = Period.between(today, futureDate);
		System.out.println("Days between dates : " + period.getDays());
		LocalDateTime currentTimestamp = LocalDateTime.now();
		// TODO Auto-generated method stub

	}

}
