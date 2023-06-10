package reviewWeek_02;

public class ConvertSecond {

	public static void main(String[] args) {
		int seconds = 86400;
	    final int MAX_SECOND = 60;
	    final int MAX_MINUTE = 60;
	    int remainSecond = seconds % MAX_SECOND; // second to display in the result

	    int minuteCount = seconds / MAX_SECOND; // total minute to use to calculate number of hour
	    System.out.println(minuteCount);

	    int remainMinute = minuteCount % MAX_MINUTE; // minute to display in the result

	    int hrCount = minuteCount / MAX_MINUTE; // total hr

	    System.out.println(hrCount + ":"+remainMinute+":"+remainSecond);

	    // if question as to display number day
//	    int remainHr = hrCount % 24;
//	    int dayCount = hrCount / 24;
//	    System.out.println(dayCount + ":" + remainHr + ":"+remainMinute+":"+remainSecond);

	}

}
