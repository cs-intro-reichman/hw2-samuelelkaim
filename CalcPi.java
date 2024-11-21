public class CalcPi {

    public static void main(String[] args) {
        // Vérifie si l'argument est valide
        if (args.length != 1) {
            System.out.println("Usage: java CalcPi <iterations>");
            System.out.println("<iterations>: Un entier positif représentant le nombre d'itérations.");
            return;
        }

        int iterations;
        try {
            iterations = Integer.parseInt(args[0]);
            if (iterations <= 0) {
                System.out.println("Erreur: <iterations> doit être un entier positif.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Erreur: <iterations> doit être un entier valide.");
            return;
        }

        // Calcul de Pi avec la série de Leibniz
        double pi = 0.0;
        for (int i = 0; i < iterations; i++) {
            double term = 4.0 / (2 * i + 1);
            if (i % 2 == 0) {
                pi += term;
            } else {
                pi -= term;
            }
        }

        // Affiche les résultats
        System.out.printf("Pi according to Java: %.15f%n", Math.PI);
        System.out.printf("Pi, approximated:     %.15f%n", pi);
    }
}
