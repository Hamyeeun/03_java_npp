public class MethodDeclareTest{
	public static void main(String[]args){
		MethodDeclare method = new MethodDeclare();
		
		//method.convertStringToCharArray("Hello, java!");
		// print result : "Hello, java!"
		
		method.sortLetters("Hello, World!");
		//method.sortLetters("Hello, Java!");
		// print result : " !,HWdellloor", " !,HJaaellov"
	}
}