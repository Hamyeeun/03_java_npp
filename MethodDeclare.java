public class MethodDeclare{
	public void convertStringToCharArray(String input){
		char[] letters = new char[input.length()];
		for(int idx = 0; idx < letters.length; idx++){
			letters[idx] = input.charAt(idx);
		}
		for (char letter : letters){
			System.out.printf("%c",letter);
		}
	}
	
	
	public void sortLetters(String input){
		char temp;
		char[] letters = new char[input.length()];
		for(int idx = 0; idx < letters.length; idx++){
			letters[idx] = input.charAt(idx);
			for(int idn = 0; idn < idx; idn++){
				if(letters[idn] < letters[idn + 1]){
					//letters[idx] = input.charAt(idx);
					//letters[idx + 1] = input.charAt(idx + 1);
					temp = letters[idn];
					letters[idn] = letters[idn + 1];
					letters[idn + 1] = temp;
				}
			}
		}
		for (char letter : letters){
			System.out.printf("%c",letter);
		}	
		//return letters[input.length()];
	}
}