package day13;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s= new Stack();
		s.push(1);
		s.add(2);
		s.add(3);
		System.out.println("Stack is: "+s);
		System.out.println("it return top element: "+s.peek());
		System.out.println("it returns and removes top element: "+s.pop());
		System.out.println("after poping out: "+s);
		System.out.println("it return top element: "+s.peek());
		System.out.println("it returns and removes top element: "+s.pop());
		System.out.println("after poping out: "+s);
		System.out.println("it return top element: "+s.peek());
		System.out.println("it returns and removes top element: "+s.pop());
		System.out.println("after poping out: "+s);
		
		

	}

}
