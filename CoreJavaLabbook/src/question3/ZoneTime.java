package question3;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneTime {

	public static void main(String[] args) {
		ZonedDateTime currentTime = ZonedDateTime.now();
		ZonedDateTime currentTimeInParis = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		ZonedDateTime currentTimeInNewYork = currentTime.withZoneSameInstant(ZoneId.of("America/New_York"));
		System.out.println("India:"+ currentTime);
		System.out.println("Paris:"+ currentTimeInParis);
		System.out.println("New York:"+ currentTimeInNewYork);
	}

}
