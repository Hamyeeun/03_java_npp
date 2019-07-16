public class DefineMethods {
	// 1.
	public int absolute(int x){
		int result = (x < 0) ? -x : x;
		return result;
	}
	
	// 2-1.
	public void findMultiple(int x){
		for (int idx = 1; (idx * x) <= 100; idx++){
			System.out.printf("100 down's num = %d, result = %d%n", x, (idx * x));
		}
	}
	// 2-2.
	public void findMultiple2(int x){
		int count = 1;
		while(count < 100 / x){
			if((count * x)% 2 == 0){
				System.out.printf("%d%n",(count*x));
			}else{
				System.out.printf("%d%n",(count*x));
			}
			count++;
		}
	}
	
	// 3.
	public String decideSign(int x){
		String result;
		if(x < 0){
			result = "minus num";
		}else if(x == 0){
			result = "0";
		}else{
			result = "plus num";
		}
		return result;
	}
	
	// 4.
	public void repeatedMessage(String Message, int repeat){
		String[] repeatMs = new String[repeat];
		for(int idx = 0; idx < repeat; idx++){
			repeatMs[idx] = Message;
			System.out.println("repeatMs[" + idx + "]" + repeatMs[idx]);
		}
	}
	
	// 5.
	public double calcCircleArea(int r){
		double result;
		result = 3.14 * r * r;
		
		return result;
	}
	
	// 6. 
	public int[] makeMultipleNums(int x){
		int count = 0;
		int[] numbers;
		int idn = 0;
		for(int idx = 1; idx <= 100; idx++){
			if(idx % x == 0){
				count++;
			}
		}
		numbers = new int[count];
		for(int idx = 1; idx <= 100; idx++){
			if(idx % x == 0){
				numbers[idn] = idx;
				idn++;
			}
		}
		return numbers;
	}
}