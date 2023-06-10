package day31_interfaceAndAbstraction.Alarm;

import java.time.LocalTime;

public class Clock implements Alarm{

	public void ShowCurrentTime() {
		System.out.println("Current time : "+LocalTime.now());
	}

	@Override
	public void setAlarm() {
		System.out.println("Clock is Sitting up");
		
	}
	
	
	
}
