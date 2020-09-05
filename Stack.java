package stack;

public class Stack {

	private static int array[];
	private static int top;

	Stack(int size) {
		array = new int[size];
		top = -1;
	}

	public void push(int value) {

		if (!isStackFull()) {

			top++;
			array[top] = value;

		} else
			System.out.println("Cannot add more elements in the stack!");
	}

	public void pop() {

		if (!isStackEmpty()) {

			array[top] = 0;
			top--;
		} else
			System.out.println("The stack is empty!");
	}

	public void peek() {

		if (!isStackEmpty())
			System.out.println("The top of the stack has: " + array[top]);
		else
			System.out.println("The stack is empty!");
	}

	public void deleteStack() {

		array = null;
		top = -1;
	}

	public boolean isStackEmpty() {
		if (top == -1)
			return true;

		return false;
	}

	public boolean isStackFull() {
		if (top == (array.length - 1))
			return true;
		return false;
	}

}
