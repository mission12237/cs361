/**
 * 
 */
package mystack;

/**
 * @author ADD YOUR NAME 
 *Congying Zhang
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete
        if (theStack ==null) {
        	return null;
        }
        T pop = theStack.val;
		theStack = theStack.next;
		return pop;
	
		
	}

	public void push(T v) {
		// TODO To complete
		if(theStack==null)
		  {
		   theStack= new MyNode(v, null);
		  }
		  else
		  {
		   theStack.next=new MyNode(v,null);
		  }
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		MyStack<Integer> stack = new MyStack<Integer>();
		// Push 1 and 2
		stack.push(1);
		stack.push(2);
		// Pop
		stack.pop();
		// Push 5
		stack.push(5);
		
		// TODO To complete
		// Create a stack of Person
		MyStack<Person> stackp = new MyStack<Person>();
		// Push a person p1 with your name
		Person p1 = new Person("Congyoing", "Zhang");
		stackp.push(p1);
		// Push a person p2 with my name
		Person p2 = new Person("Christelle", "Scharff");
		stackp.push(p2);
		
	}

}
