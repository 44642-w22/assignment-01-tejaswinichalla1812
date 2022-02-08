package Assignment_01;

import java.util.*;

public class Problem_10 {
static String val = ""; 
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements in deque");
		int size=scanner.nextInt();
	    Deque<String> d1 = new ArrayDeque<String>();

		for (int i=0;i<size;i++)
		{
			System.out.println("Enter element"+i+" to Deque");
			d1.add(scanner.next());
		}
		
		System.out.println("Enter the number of elements in Array");
		int size2=scanner.nextInt();
		
		int[] ia = new int[size2];
		
		for (int i=0;i<size2;i++)
		{
			ia[i]=scanner.nextInt();
		}
		
		for (Integer p : ia) {
			prob10(p,d1);
		}

		String res = "";
		
		for (String string : d1) {
			res+=string;
		}
		
		System.out.println("\""+res+"\"");	
		
	}
	
	public static void prob10(int p, Deque<String> d1) {
		
		if(p == 1) {
			val = d1.poll();
		}else {
			
			if(val!="") {
				d1.addFirst(val);
				val="";
			}
		}
		
	}
}
	

