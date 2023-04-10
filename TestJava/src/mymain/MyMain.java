package mymain;

import java.util.Scanner;


public class MyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "tiger   bear   wolf     dog  cat ";
		Scanner scan = new Scanner(str).useDelimiter("\\s* \\s*");
		//scan.useDelimiter("\\s*");
		
		
		System.out.println(scan.next());
		System.out.println(scan.next());
		System.out.println(scan.next());
		System.out.println(scan.next());
		System.out.println(scan.next());
		System.out.println(scan.next());
		
		
		
	}

}
