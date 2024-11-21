public class Collatz {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        String mode = args[1];
        boolean verbose = mode.equals("v");

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

        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
    }
}
