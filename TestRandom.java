public class TestRandom {

    public static void main(String[] args) {
        // Vérification des arguments
        if (args.length != 1) {
            System.out.println("Usage: java TestRandom <N>");
            System.out.println("<N>: Un entier positif représentant le nombre de valeurs aléatoires à générer.");
            return;
        }

        int N;
        try {
            N = Integer.parseInt(args[0]);
            if (N <= 0) {
                System.out.println("Erreur: <N> doit être un entier positif.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Erreur: <N> doit être un entier valide.");
            return;
        }

        int countAboveHalf = 0;
        int countBelowOrEqualHalf = 0;

        // Génération et comptage
        for (int i = 0; i < N; i++) {
            double randomValue = Math.random(); // Génère un nombre entre 0.0 (inclus) et 1.0 (exclu)
            if (randomValue > 0.5) {
                countAboveHalf++;
            } else {
                countBelowOrEqualHalf++;
            }
        }

        // Affichage des résultats
        System.out.println("> 0.5: " + countAboveHalf + " times");
        System.out.println("<= 0.5: " + countBelowOrEqualHalf + " times");

        // Calcul et affichage du ratio
        if (countBelowOrEqualHalf == 0) {
            System.out.println("Ratio: Undefined (no numbers ≤ 0.5)");
        } else {
            double ratio = (double) countAboveHalf / countBelowOrEqualHalf;
            System.out.printf("Ratio: %.6f%n", ratio); // Affiche le ratio avec 6 chiffres après la virgule
        }
    }
}


