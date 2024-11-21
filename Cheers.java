public class Cheers {

    public static void main(String[] args) {
        // Vérifie si les arguments sont valides
        if (args.length != 2) {
            System.out.println("Usage: java Cheers <word> <repetitions>");
            return;
        }

        String word = args[0].toUpperCase(); // Convertit le mot en majuscules
        int repetitions;

        try {
            repetitions = Integer.parseInt(args[1]);
            if (repetitions < 0) {
                System.out.println("Repetitions must be non-negative.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("The second argument must be a valid integer.");
            return;
        }

        // Parcourt chaque lettre et affiche avec le bon article
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if ("AEIOU".indexOf(letter) != -1) {
                System.out.println("Give me an " + letter + ": " + letter + "!");
            } else {
                System.out.println("Give me a " + letter + ": " + letter + "!");
            }
        }

        // Affiche le mot épelé
        System.out.println("What does that spell?");
        System.out.println(word + "!!!");

        // Répète le mot le nombre de fois demandé
        for (int i = 0; i < repetitions; i++) {
            System.out.println(word + "!!!");
        }
    }
}
