package show100;

import java.util.Scanner;

public class LeitorDado {

	static Scanner sc = new Scanner(System.in);
	
	public static String lerTexto() {
		return sc.nextLine();
	}
	
	public static int lerInteiro() {
		return Integer.parseInt(sc.nextLine());
	}
}
