
public class Hangman {
	
	public static void main(String[] args) {
		
		if (args.length == 0) {
			System.out.println("Usage java Hangman <answer>");
			System.err.println("answer is required!");
			System.exit(1);
		}
		System.out.print("\033[H\033[2J");
		System.out.flush();
		
	    Game game = new Game(args[0]);
	    Prompter prompter = new Prompter(game);
	    do {
	    		prompter.displayProgress();
	    		prompter.promptForGuess();
	    } while (game.getRemainingTries() > 0 && !game.isWon());
	    
	    prompter.displayOutcome();
	}
	
}
