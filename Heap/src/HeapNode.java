
public class HeapNode {
	int value;
	int index;
	boolean hasLeftChild = false;
	
	public HeapNode (int inputValue) {
		this.value = inputValue;
	}
	
	public int getValue() {
		return value;
	}
	
	public int getIndex() {
		return index;
	}
	
	public int getParentIndex() {
		int parentIndex = (int) Math.floor((double)((index - 1)/2));
		return parentIndex;
	}
	
	public int getLeftChildIndex() {
		return (index*2 + 1);
	}
	
	public int getRightChildIndex() {
		return (index*2 + 2);
	}
	
	public void printElement() {
		System.out.println(index + " " + value);
	}
	
	public void setIndex(int inputIndex) {
		index = inputIndex;
	}
	
	public void setValue(int inputValue) {
		value = inputValue;
	}
	
	public void checkChildLeft() {
		hasLeftChild = true;
	}
	

}
