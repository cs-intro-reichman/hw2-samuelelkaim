public class CalcPi {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java CalcPi <iterations>");
            return;
        }

        int iterations;
        try {
            iterations = Integer.parseInt(args[0]);
            if (iterations <= 0) {
                System.out.println("Iterations must be a positive integer.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("The argument must be a valid integer.");
            return;
        }

        double pi = 0.0;
        for (int i = 0; i < iterations; i++) {
            double term = 4.0 / (2 * i + 1);
            if (i % 2 == 0) {
                pi += term;
            } else {
                pi -= term;
            }
        }

        System.out.printf("Pi, approximated: %.6f%n", pi);
    }
}
