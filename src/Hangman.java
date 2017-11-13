
public class Hangman {
	
	public static void main(String[] args) {
	    // Your incredible code goes here...
	    Game game = new Game("treehouse");
	    Prompter prompter = new Prompter(game);
	    do {
	      prompter.displayProgress();
	      prompter.promptForGuess();
	    } while (game.getRemainingTries() > 0);
	  }
	
}
