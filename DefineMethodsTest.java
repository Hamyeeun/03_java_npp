public class DefineMethodsTest {
	public static void main(String[] args){
		// 1. ,2.
		DefineMethods method = new DefineMethods();
		
		//(1)---------------------------------------------------------------
		int result1 = method.absolute(-1);
		System.out.printf("%d%n",result1);
		
		//(2-1)--------------------------------------------------------------
		method.findMultiple(11);
		
		//(2-2)--------------------------------------------------------------
		//method.findMultiple2(10);
		
		//(3)----------------------------------------------------------------
		String result2 = method.decideSign(1);
		System.out.printf("%s%n",result2);
		
		//(4)----------------------------------------------------------------
		method.repeatedMessage("Hello",2);
		
		//(5)----------------------------------------------------------------
		double result3 = method.calcCircleArea(3);
		System.out.printf("%f%n",result3);
		
		//(6)----------------------------------------------------------------
		int[] nums = method.makeMultipleNums(10);
		for (int num : nums){
			System.out.printf("%d%n",num);
		}
	}
}