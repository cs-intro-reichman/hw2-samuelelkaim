public class Cheers {

    public static void main(String[] args) {
        // Vérifie si les arguments sont corrects
        if (args.length != 2) {
            System.out.println("Usage: java Cheers <word> <repetitions>");
            return;
        }

        String word = args[0].toUpperCase(); // Convertit le mot en majuscules
        int repetitions;

        try {
            repetitions = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("The second argument must be an integer.");
            return;
        }

        // Parcourt chaque lettre du mot
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);

            // Utilise "an" pour les voyelles, sinon "a"
            if (isVowel(letter)) {
                System.out.println("Give me an " + letter +

       

