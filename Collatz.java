public class Collatz {
    public static void main(String[] args) {
        int maxSeed = Integer.parseInt(args[0]);
        String mode = args[1];

        for (int seed = 1; seed <= maxSeed; seed++) {
            int n = seed;
            int steps = 0;

            if (mode.equals("v")) {
                System.out.print(n);
            }

            if (n == 1) {
                steps = 4;
                if (mode.equals("v")) {
                    System.out.print(" 4 2 1");
                }
            } else {
                while (n != 1) {
                    if (n % 2 == 0) {
                        n = n / 2;
                    } else {
                        n = 3 * n + 1;
                    }
                    steps++;
                    if (mode.equals("v")) {
                        System.out.print(" " + n);
                    }
                }
                steps++;
            }

            if (mode.equals("v")) {
                System.out.println(" (" + steps + ")");
            }
        }

        System.out.println("Every one of the first " + maxSeed + " hailstone sequences reached 1.");
    }
}
