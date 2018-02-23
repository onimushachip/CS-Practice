
public class GameInfo {
	private int lives;
	private int cardAmount;
	private CardGenerator generator = new CardGenerator();
	private int selectedCardNumber = 0;
	
	//
	public void generateCard(int amount) {
		generator.start(amount); 
	}
	
	public void selectCard () {
		selectedCardNumber++;
	}
}
