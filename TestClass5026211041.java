public class TestClass5026211041 {
    public static void main(String[] args){
    ComputerMethods5026211041 input = new ComputerMethods5026211041();

    double celsius = input.fToC(100);
		System.out.println("Temp in celsius is "+celsius);

    double hypot = input.hypotenuse(6,8);
		System.out.println("The hypotenuse is "+hypot);

    int dice = input.roll();
		System.out.println("The sum of the dice values is "+dice);
    }
}