package QPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class HeapQ {
	public void sortAndPrint(int[] input) {
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
		ArrayList<Integer> result = new ArrayList<>();
		
		for (int i = 0; i < input.length; i++) {
			heap.add(input[i]);
		}
		
		for (int i = 0; i < input.length; i++) {
			System.out.println(Arrays.asList(heap));
			
			result.add(heap.poll());
		}
		
		System.out.println(Arrays.asList(result));
	}

}
