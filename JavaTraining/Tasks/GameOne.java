import java.util.*;

class GameOne {
	public static void main(String [] args){
		/*
		Random randomGenerator;
		randomGenerator = new Random();
		int randomValue = (randomGenerator.nextInt(100) + 1);	
		
		Scanner scanner = new Scanner(System.in);
		for(int i = 5; i > 0; i--){
			System.out.println("Enter number, you have " + i + " attempts");
			String str = scanner.nextLine();
			int number = Integer.parseInt(str);
			if(number > randomValue){
				System.out.println("The number < than " + number);				
			}
			else if(number < randomValue){
				System.out.println("The number > than " + number);
			}
			else{
				System.out.println("You win");
			}				
		}
		System.out.println("Number is " + randomValue);
		*/
		Scanner scanner = new Scanner(System.in);
		int first = 0;
		int second = 100;		
		for(;;){
			int computerNumber = (second + first) / 2;
			System.out.println(computerNumber);
			String str = scanner.nextLine();
			if("more".equals(str)){
				first = computerNumber;								
			} else if("less".equals(str)){
				second = computerNumber;				
			} else if("equal".equals(str)){
				System.out.println("You win");
				break;
			} else if("exit".equals(str)){
				break;
			}
		}
	}
}
