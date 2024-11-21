
            public class Cheers {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: Cheers <word> <repetitions>");
            return;
        }

        String word = args[0];
        int repetitions;

        try {
            repetitions = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("The second argument must be an integer.");
            return;
        }

        // Process each letter of the word
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);

            // Use "an" for vowels and "a" for consonants
            if ("AEIOUaeiou".indexOf(letter) != -1) {
                System.out.println("Give me an " + letter + ": " + letter + "!");
            } else {
                System.out.println("Give me a " + letter + ": " + letter + "!");
            }
        }

        // Print the spelled word
        System.out.println("What does that spell?");
        System.out.println(word + "!!!");

        // Repeat the word the given number of times
        for (int i = 0; i < repetitions; i++) {
            System.out.println(word + "!!!");
        }
    }
}
