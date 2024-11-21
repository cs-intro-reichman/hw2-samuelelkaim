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

        // Boucle pour afficher le mot avec un point d'exclamation
        for (int i = 0; i < repetitions; i++) {
            System.out.println(mot + "!");
        }
    }
}
