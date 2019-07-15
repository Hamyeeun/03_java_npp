public class MethodTest{
	public static void main(String[] args){
		// 1. var declare of MethodDefinitions
		MethodDefinitions methods;
		
		// 2. var initiation
		methods = new MethodDefinitions();
		
		// 3. method call
		int result = methods.power(3);
		System.out.printf("power of %d = %d%n", 3, result);
		
		//(1)--------------------------------------------------------------
		methods.printTenTimes(1);
		
		//(2)--------------------------------------------------------------
		methods.printSomebodysMessage("Hello","yeeun");
		
		//(3)--------------------------------------------------------------
		methods.printMessage("My name is");
		
		//(4)--------------------------------------------------------------
		String message = methods.returnOriginalMessage("Hamyeeun!");
		System.out.printf("%s", message);
		//(5)--------------------------------------------------------------
		int sum = methods.addTen(11);
		System.out.printf("sum is %d%n",sum);
		
		//(6)--------------------------------------------------------------
		int minus = methods.subtracTen(5);
		System.out.printf("minus Ten is %d%n",minus);
		
		//(7)--------------------------------------------------------------
		double result1 = methods.makeDouble(2.0);
		System.out.printf("* is %f%n", result1);
		
		//(8)--------------------------------------------------------------
		double result2 = methods.subtractFivePointFive(6.6);
		System.out.printf("minus is %f%n",result2);
		
		//(9)--------------------------------------------------------------
		String name = methods.makeFullName("Yeeun", "Ham");
		System.out.printf("%s%n",name);
		
		//(10)--------------------------------------------------------------
		int sum1 = methods.add(6, 7);
		System.out.printf("sum is %d",sum1);
		
		//(11)--------------------------------------------------------------
		double sum2 = methods.add2(11.0, 12.0);
		System.out.printf("sum is %f",sum2);
		
		//(12)--------------------------------------------------------------
		methods.printMsgManyTimes("what?",3);
		
		//(13)--------------------------------------------------------------
		methods.arithmetic('-', 10, 8);
		
		//(14)--------------------------------------------------------------
		double result3 = methods.arithmetic2('*', 3, 2);
		System.out.printf("result is %f%n",result3);
		
		//(15)--------------------------------------------------------------
		boolean flag = methods.isEven(5);
		System.out.printf("isEven is %b",flag);
	}
}