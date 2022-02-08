package Assignment_01;

import java.util.*;

public class Problem_07 {
	public static void main(String args[]) {
		Queue<Integer> a = new LinkedList<Integer>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of elements");
	    int size = scanner.nextInt();
	    for ( int i=0; i<size;i++)
	    	
	    {
	    	System.out.println("Enter the element to queue");
	    	a.add(scanner.nextInt());
	    }

	    System.out.println("Output: " +prob7(a));
	}

	public static int prob7(Queue<Integer> a)
	{
		int num =0;
		int size = a.size();
		for (int i=size-1;i>=0;i--)
		{
			num = (int) (num + a.poll()* Math.pow(2, i));
		}
		return num;
		
	}
}


