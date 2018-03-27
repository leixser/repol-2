/**
 * @author Aleix Serra
 * @version 2.3
 */

import java.util.Scanner;

public class primer {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n;
		
		System.out.println("Insereix un nombre");
		n=s.nextInt();
		metode(n);
	}

	/**
	 * @param newParam = nombre limit.
	 */
	private static void metode(int newParam) {
		for(int countParells=0; countParells<=newParam; countParells++) 
		{
			Metodes.ComptadorDeParells(countParells);
		}
	}

}
