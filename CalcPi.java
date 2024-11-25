// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args){ 
	    // Replace this comment with your code
	    int num = Integer.parseInt(args[0]);

		double denominator = 1.0;
		double res = 0.0;

		for (int i = 0; i < num; i++){
			res += Math.pow(- 1, i) * (1.0 / denominator);
			denominator += 2;
		}

		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + 4 * res);
	}

}
