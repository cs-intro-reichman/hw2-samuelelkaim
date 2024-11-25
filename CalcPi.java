public class CalcPi {
    public static void main(String[] args) {
        int terms = Integer.parseInt(args[0]);
        double sum = 0.0;

        for (int i = 0; i < terms; i++) {
            if (i % 2 == 0) {
                sum += 1.0 / (2 * i + 1);
            } else {
                sum -= 1.0 / (2 * i + 1);
            }
        }

        double piApprox = 4 * sum;
        
        // Printing
        System.out.printf("pi according to Java: %.15f%n", Math.PI);
        System.out.printf("pi, approximated:     %.17f%n", piApprox);
        
    }
}

          
