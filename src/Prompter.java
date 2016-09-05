import java.io.Console;

public class Prompter {

	private Game mGame;
	
	public Prompter(Game game) {
		mGame = game;
	}
	
	public void play() {
		while (mGame.getRemainingTries() > 0) {
			displayProgress();
			promptForGuess();
		}
	}
	
	public boolean promptForGuess() {
		Console console = System.console();
		String guessAsString = console.readLine("Enter a letter: ");
		char guess = guessAsString.charAt(0);
		return mGame.applyGuess(guess);
	}
	
	public void displayProgress() {
		// printf formatting would be better, but it's not working in the terminal.
		System.out.println("You have " + mGame.getRemainingTries() + " tries left to solve: " + mGame.getCurrentProgress()); 
	}

}
