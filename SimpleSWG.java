public class SimpleSWG {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        java.util.Random rand = new java.util.Random();

        while (true) {

            // User input
            System.out.print("Enter s (Snake) / w (Water) / g (Gun) OR q to quit: ");
            String userInput = sc.next().toLowerCase();

            if (userInput.equals("q")) {
                System.out.println("Game Over! 👋");
                break;
            }

            int user = 0;
            if (userInput.equals("s")) user = 1;
            else if (userInput.equals("w")) user = 0;
            else if (userInput.equals("g")) user = -1;
            else {
                System.out.println("Invalid choice! Try again.\n");
                continue; // restart loop
            }

            // Computer choice
            String[] arr = {"s", "w", "g"};
            String compInput = arr[rand.nextInt(3)];

            int comp = 0;
            if (compInput.equals("s")) comp = 1;
            else if (compInput.equals("w")) comp = 0;
            else comp = -1;

            // Emojis
            String compEmoji = compInput.equals("s") ? "🐍" :
                               compInput.equals("w") ? "💧" : "🔫";

            String userEmoji = userInput.equals("s") ? "🐍" :
                               userInput.equals("w") ? "💧" : "🔫";

            System.out.println("Computer = " + compEmoji + "   User = " + userEmoji);

            // Game logic
            if (comp == user) {
                System.out.println("\nIt's a tie!\n");
            }
            else if (
                (comp == 0 && user == 1) ||   
                (comp == -1 && user == 0) ||  
                (comp == 1 && user == -1)     
            ) {
                System.out.println("\nYou won! 🎉\n");
            }
            else {
                System.out.println("\nYou lost!\n");
            }
        }

        sc.close();
    }
}
