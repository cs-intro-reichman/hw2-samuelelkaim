public class Collatz {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Collatz <N> <mode>");
            System.out.println("<N>: Positive integer.");
            System.out.println("<mode>: 'v' for verbose, any other value for silent.");
            return;
        }

        int N;
        try {
            N = Integer.parseInt(args[0]);
            if (N <= 0) {
                System.out.println("<N> must be a positive integer.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("<N> must be a valid integer.");
            return;
        }

        String mode = args[1];
        boolean verbose = mode.equalsIgnoreCase("v");

        for (int seed = 1; seed <= N; seed++) {
            int current = seed;
            int steps = 0;

            if (verbose) {
                System.out.print(seed + " ");
            }

            while (current != 1) {
                if (current % 2 == 0) {
                    current /= 2;
                } else {
                    current = current * 3 + 1;
                }
                steps++;
                if (verbose) {
                    System.out.print(current + " ");
                }
            }

            if (verbose) {
                System.out.println("(" + steps + ")");
            }
        }

        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
    }
}

