
public class arithmeticCalculator {

	public float addition(float num1,float num2) {
		return num1+num2;
	}
	
	public float subtraction(float num1,float num2) {
		return num1-num2;
	}
	
	public float multiplication(float num1,float num2) {
		return num1*num2;
	}
	
	public float division(float num1,float num2) {
		return num1/num2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arithmeticCalculator obj=new arithmeticCalculator();
		float num1=25;
		float num2=7;
		System.out.println("First number:"+num1);
		System.out.println("Second Number:"+num2);
		System.out.println("______________________________");
		System.out.println("Addition:"+obj.addition(num1,num2));
		System.out.println("Subtraction:"+obj.subtraction(num1,num2));
		System.out.println("Multiplication:"+obj.multiplication(num1,num2));
		System.out.println("Division:"+obj.division(num1,num2));
	}

}
