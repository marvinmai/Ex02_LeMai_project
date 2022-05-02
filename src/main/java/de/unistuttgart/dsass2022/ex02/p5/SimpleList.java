package de.unistuttgart.dsass2022.ex02.p5;


public class SimpleList<T extends Comparable<T>> implements ISimpleList<T> {

	private int size;

	private SimpleListNode<T> head;

	public SimpleList() {
		this.size = 0;
		this.head = new SimpleListNode<>();
	}

	@Override
	public int getSize() {
		return this.size;
	}

	@Override
	public void prepend(T newElement) {
		size++;
		SimpleListNode<T> newNode = new SimpleListNode<>(newElement);
		newNode.setNext(head.getNext());
		head.setNext(newNode);
	}

	@Override
	public T getElement(int index) {
		SimpleListNode<T> node = (SimpleListNode<T>) head.getNext();
		for (int i = 0; i < index; i++) {
			node = (SimpleListNode<T>) node.getNext();
		}
		return node.getElement();
	}


	@Override
	public void sort() {
		if (size == 1 || size == 0) return;
		boolean nodesSwitched;
		printList();
		SimpleListNode<T> lastNode;
		SimpleListNode<T> currentNode;
		SimpleListNode<T> temp;
		do {
			lastNode = head;
			currentNode = (SimpleListNode<T>) head.getNext();
			nodesSwitched = false;
			for (int i = 0; i < this.getSize() - 1; i++) {
				if (currentNode.getElement().compareTo(currentNode.getNext().getElement()) > 0) {
					temp = lastNode;
					lastNode = (SimpleListNode<T>) currentNode.getNext();
					switchNodes(temp);
					nodesSwitched = true;
					printList();
				} else {
					lastNode = currentNode;
					currentNode = (SimpleListNode<T>) currentNode.getNext();
				}
			}
		} while (nodesSwitched);
	}

	private void switchNodes(SimpleListNode<T> nodeBeforeElementsToSwitch) {
		SimpleListNode<T> firstNode = (SimpleListNode<T>) nodeBeforeElementsToSwitch.getNext();
		SimpleListNode<T> secondNode = (SimpleListNode<T>) firstNode.getNext();
		nodeBeforeElementsToSwitch.setNext(secondNode);
		if (secondNode.getNext() != null) {
			firstNode.setNext(secondNode.getNext());
		} else {
			firstNode.setNext(null);
		}
		secondNode.setNext(firstNode);
	}

	public void printList() {
		for (int i = 0; i < this.getSize(); i++) {
			System.out.print(this.getElement(i) + " | ");
		}
		System.out.println();
	}

	/**
	 * Equality method for testing purposes.
	 * @param other Object to compare this SimpleList to. Type SimpleList is expected.
	 * @return true if content of other list AND sorting is equal.
	 */
	@Override
	public boolean equals(Object other) {
		boolean isEqual = true;
		if (other instanceof SimpleList<?>) {
			SimpleList<?> otherList = (SimpleList<?>) other;
			if (otherList.getSize() == this.getSize()) {
				for (int i = 0; i < this.getSize(); i++) {
					T element = this.getElement(i);
					T otherElement = (T) otherList.getElement(i);
					if (element.compareTo(otherElement) != 0) {
						isEqual = false;
						break;
					}
				}
			} else {
				isEqual = false;
			}
		} else {
			isEqual = false;
		}
		return isEqual;
	}

}
