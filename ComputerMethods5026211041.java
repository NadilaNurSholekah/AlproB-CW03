import java.util.Random;

public class ComputerMethods5026211041 {

    public double fToC(double degreesF){
        double degreesC = (5.0/9.0)*(degreesF-32.0);
	return degreesC;
    }
    public  double hypotenuse(int a, int b) {
        double hypo = Math.sqrt((a*a) + (b*b));
	return hypo;
    }
    public int roll(){
        Random rndm = new Random();
        int dice1 = rndm.nextInt(6)+1;
        int dice2 = rndm.nextInt(6)+1;

        return dice1 + dice2;
    }
}