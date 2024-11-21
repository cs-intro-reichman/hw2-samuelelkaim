public class Cheers {

    public static void main(String[] args) {
        // Vérifie si le nombre d'arguments est correct
        if (args.length != 2) {
            System.out.println("Utilisation : Cheers <mot> <répétitions>");
            return;
        }

        String mot = args[0];
        int repetitions;

        try {
            // Convertit le deuxième argument en entier
            repetitions = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Le deuxième argument doit être un nombre entier.");
            return;
        }

        // Épelle chaque lettre du mot
        for (int i = 0; i < mot.length(); i++) {
            char lettre = mot.charAt(i);
            if ("AEIOUYaeiouy".indexOf(lettre) != -1) {
                System.out.println("Give me an " + lettre + ": " + lettre + "!");
            } else {
                System.out.println("Give me a " + lettre + ": " + lettre + "!");
            }
        }

        // Message après avoir épelé le mot
        System.out.println("What does that spell?");
        System.out.println(mot + "!!!");

        // Répète le mot le nombre de fois demandé
        for (int i = 0; i < repetitions; i++) {
            System.out.println(mot + "!!!");
        }
    }
}
