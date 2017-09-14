
public class Heap {
	
	static HeapNode[] heapArray = new HeapNode[11];
	static HeapNode[] processedArray = new HeapNode[heapArray.length];
	int arraySize = heapArray.length;

	public static void main(String[] args) {
		heapArray[0] = new HeapNode(5);
		heapArray[1] = new HeapNode(7);
		heapArray[2] = new HeapNode(8);
		heapArray[3] = new HeapNode(13);
		heapArray[4] = new HeapNode(25);
		heapArray[5] = new HeapNode(34);
		heapArray[6] = new HeapNode(40);
		heapArray[7] = new HeapNode(30);
		heapArray[8] = new HeapNode(32);
		heapArray[9] = new HeapNode(27);
		heapArray[10] = new HeapNode(4);
		

		for (int i = 0; i < heapArray.length; i++) {
			heapArray[i].setIndex(i);
			heapArray[i].printElement();
		}
		
		bubbleUp(heapArray[10]);
		
		System.out.println("Result");
		
		for (int i = 0; i < heapArray.length; i++) {
			int newIndex = heapArray[i].getIndex();
			processedArray[newIndex] = heapArray[i];
		}
		
		for (int i = 0; i < processedArray.length; i++) {
			int leftChildIndex = processedArray[i].getIndex()*2 + 1;
			if (leftChildIndex < processedArray.length - 1) {
				processedArray[i].checkChildLeft();
			}
			processedArray[i].printElement();
		}
		
		//Remove the top element
		processedArray = removeTopNode(processedArray);
		
		System.out.println("Removed Top");
		
		for (int i = 0; i < processedArray.length; i++) {
			if (processedArray[i] != null) {
				int leftChildIndex = processedArray[i].getIndex()*2 + 1;
				if (leftChildIndex < processedArray.length - 1) {
					processedArray[i].checkChildLeft();
				}
				processedArray[i].printElement();
			}
		}
		
		heapArray = processedArray;
		
		//Bubble down
		bubbleDown(heapArray[0]);
		System.out.println("Bubbled Down");
		processedArray = reIndex(heapArray);
		
		for (int i = 0; i < processedArray.length; i++) {
			if (processedArray[i] != null) {
				int leftChildIndex = processedArray[i].getIndex()*2 + 1;
				if (leftChildIndex < processedArray.length - 1) {
					processedArray[i].checkChildLeft();
				}
				processedArray[i].printElement();
			}
			else {
				System.out.println("null");
			}
		}
		
	}
	
	public static void bubbleUp(HeapNode node) {
		while (heapArray[node.getParentIndex()] != null && node.getIndex() != 0) {
			int nodeValue = node.getValue();
			int parentValue = heapArray[node.getParentIndex()].getValue();
			if (nodeValue < parentValue) {
				swapNode(node, heapArray[node.getParentIndex()]);
			}
			else {
				break;
			}
		}
	}
	
	public static HeapNode[] removeTopNode(HeapNode[] inputArray) {
		swapNode(inputArray[0], inputArray[inputArray.length - 1]);
		HeapNode[] processedArray = new HeapNode[inputArray.length];
		for (int i = inputArray.length - 1; i > 0; i--) {
			processedArray[inputArray[i].getIndex()] = inputArray[i];
		}
		return processedArray;
	}
	
	public static HeapNode[] reIndex(HeapNode[] inputArray) {
		HeapNode[] processedArray = new HeapNode[inputArray.length];
		for (int i = 0; i < inputArray.length - 1; i++) {
			processedArray[inputArray[i].getIndex()] = new HeapNode(inputArray[i].getValue());
		}
		for (int i = 0; i < processedArray.length - 1; i++) {
			processedArray[i].setIndex(i);
		}
		return processedArray;
	}
	
	public static void bubbleDown(HeapNode inputNode) {
		int inputNodeValue = inputNode.getValue();
		int inputNodeIndex = inputNode.getIndex();
		while (heapArray[inputNodeIndex].hasLeftChild) {
			int leftChildValue = heapArray[inputNode.getLeftChildIndex()].getValue();
			int rightChildValue;
			
			if (heapArray[inputNode.getRightChildIndex()] != null) {
				rightChildValue = heapArray[inputNode.getRightChildIndex()].getValue();
			}
			else {
				rightChildValue = 999999;
			}
			
			if (leftChildValue < rightChildValue && inputNodeValue > leftChildValue){
				swapNode(heapArray[inputNodeIndex], heapArray[inputNode.getLeftChildIndex()]);
			}
			else if (leftChildValue > rightChildValue && inputNodeValue > leftChildValue) {
				swapNode(heapArray[inputNodeIndex], heapArray[inputNode.getRightChildIndex()]);
			}
			else {
				break;
			}
		}
		
	}
	
	public static void swapNode(HeapNode node1, HeapNode node2) {
		int tempValue = node1.getValue();
		int tempIndex = node1.getIndex();
		node1.setIndex(node2.getIndex());
//		node1.setValue(node2.getValue());
		node2.setIndex(tempIndex);
//		node2.setValue(tempValue);
	}
	
	

}
