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

	}

	

}
