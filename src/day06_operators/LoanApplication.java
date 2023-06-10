package day06_operators;

public class LoanApplication {

	public static void main(String[] args) {
		int minimumSalary = 125000;
        int jobHistory = 3;
        int creditScore = 550;

        if (minimumSalary >= 30000) {
            if (jobHistory >= 2) {
                if (creditScore >= 680) {
                    System.out.println("You are qualified for load");
                    } else {
                    System.out.println("You must have at least 680 credit score!");
                }
            } else {
                System.out.println("You must be on the job for at least 2 years");
            }
        } else {
            System.out.println("You must have minimum 30k salary first!");
        }

        if (minimumSalary >= 30000 && jobHistory >= 2 && creditScore >= 680) {
            System.out.println("You are qualified for load");
        } else {
            System.out.println("You are not qualified for load");
        }	

	}

}
