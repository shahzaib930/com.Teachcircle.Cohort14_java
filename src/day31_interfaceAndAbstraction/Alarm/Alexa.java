package day31_interfaceAndAbstraction.Alarm;

import java.time.LocalTime;

public class Alexa implements Alarm {

	@Override
	public void setAlarm() {
		System.out.println("Alexa is Setting Alarm");
		
	}
public void alexaWhatTimeIsIt() {
	System.out.println("The time is"+ LocalTime.now());
}
}
