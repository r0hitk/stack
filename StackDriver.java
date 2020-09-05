package stack;

public class StackDriver {

	public static void main(String[] args) {

		Stack stack = new Stack(3);

		stack.peek();
		stack.push(10);

		System.out.println(stack.isStackEmpty());
		System.out.println(stack.isStackFull());
		stack.peek();

		stack.push(20);
		stack.peek();
		stack.push(30);
		stack.peek();
		System.out.println(stack.isStackFull());

		stack.pop();
		stack.peek();
		stack.deleteStack();
		stack.peek();
	}

}
