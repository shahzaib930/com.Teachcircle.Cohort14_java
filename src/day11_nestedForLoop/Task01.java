package day11_nestedForLoop;

public class Task01 {

	public static void main(String[] args) throws InterruptedException {
		int timer = 14;
		System.out.println(timer +"time starts");
		for (int mint = timer; mint>=0;mint--) {
			for(int sec = 59; sec>=0; sec--) {
				System.out.println(mint +":"+sec);
				
				Thread.sleep(1);
				
			}
		}

		System.err.println("over");
		
		
	}

}
