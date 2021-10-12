package moner;

import java.util.Scanner;

public class Mon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	    int p,c,e;
	    p = scanner.nextInt();
	    c = scanner.nextInt();
	    while(p!=0){
	    	e = c%p;
	    	c = p;
	    	p = e;
	    	
	    }
	    System.out.print("The number is "+c);
	}

}
