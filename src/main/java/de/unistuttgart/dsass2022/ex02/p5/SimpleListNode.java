package de.unistuttgart.dsass2022.ex02.p5;

public class SimpleListNode<T extends Comparable<T>> implements ISimpleListNode<T>{

	private T element;
	private ISimpleListNode<T> next;

	public SimpleListNode() {}

	public SimpleListNode(T element) {
		this.element = element;
	}

	@Override
	public T getElement() {
		return element;
	}

	@Override
	public void setElement(T element) {
		this.element = element;
	}

	@Override
	public ISimpleListNode<T> getNext() {
		return this.next;
	}

	@Override
	public void setNext(ISimpleListNode<T> node) {
		this.next = node;
	}

}
