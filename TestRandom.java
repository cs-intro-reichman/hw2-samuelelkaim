public class TestRandom {
    public static void main(String[] args) {
        // Les arguments sont supposés valides.
        int N = Integer.parseInt(args[0]);
        int countAboveHalf = 0;
        int countBelowOrEqualHalf = 0;

        // Génération et comptage
        for (int i = 0; i < N; i++) {
            double randomValue = Math.random();
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
            System.out.println("Ratio: " + ratio);
        }
    }
}
