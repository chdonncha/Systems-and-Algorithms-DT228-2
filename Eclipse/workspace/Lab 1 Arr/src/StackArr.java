class Stack  {

	int [] i = new int [10];

	public int top=-1;

	public void push(int x) {
		top ++;
		i[top] = x;
		System.out.println("Element " + x + " is pushed to Stack !");
	}

	public boolean isMember(int x) {
		for(int j = 0; j <= top; j++)  
		{
			if (i[j] == x)
			{
				return true;
			}
		}
		
		return false;
	}

	public int pop() {

		if(top < 0)
		{
			int data = i[top];
			top--;
			return data;
		}
	
		return -10;
	}


	public void display() {
		for(int j = 0; j <= top; j ++)
		{
			System.out.println(i[j]);
		}
	}

	class StackArr {
		public static void main(String[] arg) {
			Stack s = new Stack();
			// Console.Write("Stack is created\n");
			System.out.println("Stack is created\n");

			s.push(10);
			s.push(3);
			s.push(11);
			s.push(7);
			s.display();

			int i = s.pop();
			System.out.println("Just popped " + i);
			s.display();

			boolean j = s.isMember(10);
			System.out.println("is 10 in the Stack \n" + j);
			s.display();
			// System.out.println(" " + isMember);
		}
	}
