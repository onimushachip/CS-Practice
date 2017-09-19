import java.util.Arrays;

/*
 * Find the permutation given the number of population and sample
 * Using recursion
 */
public class Permutation {
	private boolean[] population;
	private int counter = 0;
	
	public void setPopulation(int size) {
		this.population = new boolean[size];
	}
	
	public void findPermutation(int layer) {
		if (layer < 1) {
			return;
		}
		for (int i = 0; i < population.length; i++) {
//			System.out.println(layer + " " + i + " " + Arrays.toString(population));
			if (population[i] == false) {
				population[i] = true;
				findPermutation(layer - 1);
				if (layer == 1) {
					counter++;
					System.out.println(layer + " " + i + " " + Arrays.toString(population));
//					System.out.println("check");
				}
				population[i] = false;
			}		
		}
	}
	
	public void printResult() {
		System.out.println("Result: " + counter);
	}
}
