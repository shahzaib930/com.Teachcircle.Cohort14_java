package day07_ControlFlowStatement;

public class TaskAgeGroup {

	public static void main(String[] args) {
		int age = 70;
		 String group = "";
		
		if(age>0 && age<=2) {group = "infancy";}
		else if (age>1 && age <= 4) { group = "Toddler";}
		else if (age>4 && age <=7) { group = "school age";}
		else if (age>7 && age <=12) { group = "Early Adolescence";}
		else if (age>12 && age <=17) { group = "Large adolescence";}
		else if (age>17 && age <=25) { group = "Early adulthood";}
		else if (age>30 && age <=50) { group = "large adulthood";}
		
		
		
		
	}

}
