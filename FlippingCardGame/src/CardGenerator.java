import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class CardGenerator {
	private ArrayList<Integer> cardPool = new ArrayList<Integer>();
	private int[] cardPositionArray;
	private boolean[] selectedCard;
	private int selectedCardAmount = 0;
	
	public void start(int amount) {
		this.generateCard(amount);
		
		this.arrangeCard();
		
		this.selectedCard = new boolean[amount];
	}
	
	public void flipCard (int cardNumber) {
		this.selectedCard[cardNumber] = !this.selectedCard[cardNumber];
		
		this.selectedCardAmount++;
		
		if (selectedCardAmount == 2) {
			System.out.println("Check pair " + Arrays.toString(this.selectedCard));
			System.out.println("Card Position: " + Arrays.toString(this.cardPositionArray));
			selectedCardAmount = 0;
			
			for (int i = 0; i < this.selectedCard.length; i++) {
				this.selectedCard[i] = false;
			}
		}
	}
	
	private void generateCard(int amount) {
		for (int i = 0; i < amount / 2; i++) {
			cardPool.add(i);
			
			cardPool.add(i);
		}
	}
	
	private void arrangeCard () {
		int cardAmount = cardPool.size();
		Random generator = new Random();
		
		this.cardPositionArray = new int[cardAmount];
		
		for (int i = 0; i < cardAmount; i++) {
			int randomIndex = generator.nextInt(cardPool.size());
			
			cardPositionArray[i] = cardPool.get(randomIndex);
			
			cardPool.remove(randomIndex);
		}
	}
	
	public int[] getCardPosition () {
		return this.cardPositionArray;
	}
	
	public int getCard (int index) {
		return this.cardPositionArray[index];
	}
}
