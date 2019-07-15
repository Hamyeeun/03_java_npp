public class MethodDefinitions{
	// 0.
	public int power(int input){
		return input * input;
	}

	// 1.
	public void printTenTimes(int input){
		for(int idx = 0; idx < 10; idx++){
			System.out.printf("%d%n",input);
			input += 10;
		}
	}
	
	// 2.
	public void printSomebodysMessage(String message, String name){
		System.out.printf("%s message : [message] %s%n",name ,message);
	}
	
	// 3.
	public void printMessage(String message){
		System.out.printf("message : %s%n",message);
	}
	
	// 4.
	public String returnOriginalMessage(String message){
		System.out.printf("message : %s%n", message);
		return message;
	}
	
	// 5.
	public int addTen(int input){
		int sum = input + 10;
		return sum;
	}
	
	// 6.
	public int subtracTen(int input){
		int minus = input - 10;
		return minus;
	}
	
	// 7.
	public double makeDouble(double input){
		double result = input * 2;
		return result;
	}
	
	// 8.
	public double subtractFivePointFive(double input){
		double minus = input - 5.5;
		return minus;
	}
	
	// 9.
	public String makeFullName(String name, String surname){
		String fullname = surname + name;
		return fullname;
	}
	
	// 10.
	public int add(int x, int y){
		int sum = x + y;
		return sum;
	}
	
	// 11.
	public double add2(double x, double y){
		double sum = x + y;
		return sum;
	}
	
	// 12.
	public void printMsgManyTimes(String message, int input){
		for(int idx = 0; idx < input; idx++){
			System.out.printf("%d[message] : %s%n", idx + 1, message);
		}
	}
	
	// 13.
	public void arithmetic(char operator, int x, int y){
		switch(operator){
			case '+' :
			System.out.printf("%d + %d = %d%n", x, y, (x + y));
			break;
			
			case '-' :
			System.out.printf("%d - %d = %d%n", x, y, (x - y));
			break;
			
			case '*' :
			System.out.printf("%d * %d = %d%n", x, y, (x * y));
			break;
			
			case '/' :
			System.out.printf("%d / %d = %d%n", x, y, (x / y));
			break;
		}
	}
	
	// 14.
	public double arithmetic2(char operator, double x, double y){
		double result = 0;
		switch(operator){
			case '+' :
			result = x + y;
			break;
			
			case '-' :
			result = x - y;
			break;
			
			case '*' :
			result = x * y;
			break;
			
			case '/' :
			result = x / y;
			break;
		}
		return result;
	}
	
	// 15.
	public boolean isEven(int input){
		boolean result = false;
		if(input%2 == 0){
			result = true;
		}else{
			result = false;
		}
		return result;
	}
		
}